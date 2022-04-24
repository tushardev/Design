package com.design.structural.bridge.movie;

public class BridgeDemo {

    public static void main(String[] args) {

        Movie movie = new Movie();
        movie.setGenre("Noir");
        movie.setTitle("Intersteller");
        movie.setRuntime("150");
        movie.setYear("2017");

        Printer moviePrinter = new MoviePrinter(movie);

        System.out.println("-------Print Formatter------------");
        Formatter printFormatter = new PrintFormatter();
        String printedmaterial = moviePrinter.print(printFormatter);
        System.out.println(printedmaterial);

        System.out.println("-------HTML Formatter------------");
        Formatter htmlFormatter = new HtmlFormatter();
        String htmlMaterial = moviePrinter.print(htmlFormatter);
        System.out.println(htmlMaterial);

    }
}
