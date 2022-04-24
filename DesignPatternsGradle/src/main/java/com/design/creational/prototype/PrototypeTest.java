package com.design.creational.prototype;

public class PrototypeTest {

    public static void main(String[] args) {

        Registry registry = new Registry();

        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Joker");
        movie.setUrl("http://movieservice");

        System.out.println("Created New Movie: " + movie);
        System.out.println(movie.getTitle());
        System.out.println(movie.getPrice());
        System.out.println(movie.getUrl());
        System.out.println(movie.getRuntime());

        Book book = (Book) registry.createItem("Book");
        book.setTitle("Deep Work");
        book.setUrl("http://bookservice");

        System.out.println("Created New Book: " + book);
        System.out.println(book.getTitle());
        System.out.println(book.getPrice());
        System.out.println(book.getUrl());
        System.out.println(book.getNumberOfPages());

    }
}

/*** Here we have get object from Registry and then set the properties as per our requirement
 * So object created without new keyword */