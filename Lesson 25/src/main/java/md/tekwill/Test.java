package md.tekwill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/tekwill_demo_db";
        String username = "tekwill";
        String password = "tekwill";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            if (connection.isValid(5)) {
                System.out.println("Connection is valid");
            }
            //  connection.close(); -----> opreste conexiunea la baza de date
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}