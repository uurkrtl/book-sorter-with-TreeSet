package org.example;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("To Kill a Mockingbird", 281, "Harper Lee", 1960);
        Book book2 = new Book("Pride and Prejudice", 279, "Jane Austen", 1813);
        Book book3 = new Book("Dracula", 418, "Bram Stoker", 1897);
        Book book4 = new Book("War and Peace", 1440, "Leo Tolstoy", 1869);
        Book book5 = new Book("Crime and Punishment", 430, "Fyodor Dostoevsky", 1866);

        Set<Book> books = new TreeSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        System.out.println("Sorted by Name");
        for (Book book : books){
            System.out.println(book.toString());
        }

        Set<Book> booksByPage = new TreeSet<>(new PageNumberComparator());
        booksByPage.add(book1);
        booksByPage.add(book2);
        booksByPage.add(book3);
        booksByPage.add(book4);
        booksByPage.add(book5);

        System.out.println("\nSorted by Page");
        for (Book book : booksByPage){
            System.out.println(book.toString());
        }
    }
}