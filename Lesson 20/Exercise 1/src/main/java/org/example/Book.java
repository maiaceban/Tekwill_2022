package org.example;

import java.util.Set;

public class Book {
    private long id;
    private String title;
    private int yearOfPublish;
    private Set<Author> authors;

    public Book(long id, String title, int yearOfPublish, Set<Author> authors) {
        this.id = id;
        this.title = title;
        this.yearOfPublish = yearOfPublish;
        this.authors = authors;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    public void setYearOfPublish(int yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", yearOfPublish=" + yearOfPublish +
                ", authors=" + authors +
                '}';
    }
}