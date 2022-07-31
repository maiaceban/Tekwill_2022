package md.tekwill;

import jdk.dynalink.linker.LinkerServices;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/tekwill_demo_db";
        String username = "tekwill";
        String password = "tekwill";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            statement.executeUpdate(getCreateUserTableQuery());
            statement.executeUpdate(getInsertUser("Maia", true));
            statement.executeUpdate(getInsertUser("Mondon De la Vega", false));
            statement.executeUpdate(getInsertUser("Gabriel", false));

            ResultSet resultSet = statement.executeQuery("SELECT * FROM USERS");

            List<User> users = new ArrayList<>();
            while (resultSet.next()) {
                long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                boolean isVip = resultSet.getBoolean("is_vip");

                users.add(new User(id, name, isVip));
            }
            System.out.println(users);
            if (connection.isValid(5)) {
                System.out.println("Connection is valid");
            }
            //  connection.close(); -----> opreste conexiunea la baza de date
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static String getCreateUserTableQuery() {
        return """
                create table if not exists users (
                    id serial primary key,
                    name varchar(45),
                    is_vip bool
                );
                """;
    }


    public static String getInsertUser(String name, boolean isVip) {
        return " insert into users(name, is_vip) values ('%s', %b)".formatted(name, isVip);
    }
}