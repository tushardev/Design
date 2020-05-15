package com.design.structural.bridge.movie;

import java.util.ArrayList;
import java.util.List;

public class MoviePrinter extends Printer {

    private Movie movie;

    public MoviePrinter(Movie movie) {
        this.movie = movie;
    }

    @Override
    protected String getHeader() {
        return movie.getGenre();
    }

    @Override
    protected List<Details> getDetails() {
        List<Details> details = new ArrayList<>();

        details.add(new Details("Title", movie.getTitle()));
        details.add(new Details("Year", movie.getYear()));
        details.add(new Details("Runtime", movie.getRuntime()));

        return details;
    }
}
