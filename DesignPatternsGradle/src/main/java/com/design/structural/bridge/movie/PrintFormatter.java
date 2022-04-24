package com.design.structural.bridge.movie;

import java.util.List;

public class PrintFormatter implements Formatter {

    @Override
    public String format(String header, List<Details> details) {

        StringBuilder builder = new StringBuilder();
        builder.append(header);
        builder.append("\n");

        for (Details detail : details) {
            builder.append(detail.getLabel());
            builder.append(":");
            builder.append(detail.getValue());
            builder.append("\n");
        }

        return builder.toString();
    }
}
