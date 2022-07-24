package org.example;

import com.google.gson.Gson;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
            //Pretty print
//        Gson gson = new GsonBuilder().setPrettyPrinting().create();
            Gson gson = new Gson();

            //Object to JSON
            Author author2 = new Author(1, "Ion", "Creangă", "1837-03-01");
            Author author1 = new Author(2, "Mihai", "Eminescu", "1837-01-15");
            Book book = new Book(1, "Amintiri din copilarie", 1892, Set.of(author1, author2));
            String jsonBook = gson.toJson(book);
            System.out.println(jsonBook);

            //JSON to Book with Authors
            String jsonBook2 = "{\"id\":1,\"title\":\"Amintiri din copilarie 2\",\"yearOfPublish\":1892,\"authors\":[{\"id\":3,\"name\":" +
                    "\"Luca\",\"surname\":\"Caragiale\",\"birthDate\":\"1850, 1, 1\"},{\"id\":2,\"name\":\"Ion\",\"surname\":" +
                    "\"Creanga\",\"birthDate\":\"1842, 5, 18\"}]}";
            Book book2 = gson.fromJson(jsonBook2, Book.class);
            System.out.println(book2);
        }
    }