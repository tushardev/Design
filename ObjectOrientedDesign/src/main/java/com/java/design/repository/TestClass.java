package com.java.design.repository;

public class TestClass {

    public static void main(String[] args) {

        ClientEngagementRepository repository = null;

        Query query = new Query()
                        .atLeastHoursWorked(5)
                        .client("Google");

        Iterable<ClientEngagement> engagements = repository.find(query);

        engagements.forEach(System.out::println);

    }
}


/*** As query object is designed to return same Query object from setter methods multiple properties
 can be set in one go **/