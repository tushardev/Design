package com.java.design.repository.csv;

import com.java.design.repository.ClientEngagement;
import com.java.design.repository.ClientEngagementRepository;
import com.java.design.repository.Query;
import com.java.design.repository.RepositoryException;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CSVClientEngagementRepository implements ClientEngagementRepository {

    private final List<ClientEngagement> engagements;
    private final CsvPersistor csvPersistor;

    private int nextId = 1;

    public CSVClientEngagementRepository(String path) {
        csvPersistor = new CsvPersistor(path);
        engagements = csvPersistor.load();
    }

    @Override
    public void add(ClientEngagement clientEngagement) throws RepositoryException {
        if(clientEngagement.getId() == NO_ID) {
            engagements.add(clientEngagement);
            clientEngagement.setId(nextId++);
        }
    }

    @Override
    public void remove(ClientEngagement clientEngagementToRemove) throws RepositoryException {
        if(engagements.removeIf(engagement -> engagement.getId() == clientEngagementToRemove.getId())) {
            clientEngagementToRemove.setId(NO_ID);
        }
    }

    @Override
    public Iterable<ClientEngagement> find(Query query) throws RepositoryException {

        return null;
    }

    private Predicate<? super ClientEngagement> filterOf(Query query) {
        final String client = query.getClient();
        return engagements -> engagements.getHoursWorked() >= query.getAtLeastHoursWorked()
                            && (client == null || engagements.getClientName().equals(client));
    }


    @Override
    public void close() throws Exception {
        csvPersistor.save(engagements);
    }
}

