package org.example;

import java.util.Date;

public class Book implements Comparable<Book>{
    private final String name;
    private final int numberOfPages;
    private final String author;
    private final int releaseDate;

    public Book(String name, int numberOfPages, String author, int releaseDate) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.releaseDate = releaseDate;
    }
    @Override
    public int compareTo(Book o) {
        return this.getName().compareTo(o.getName());
    }

    public String getName() {
        return name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", author='" + author + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }
}