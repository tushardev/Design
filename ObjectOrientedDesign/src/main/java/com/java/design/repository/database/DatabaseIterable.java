package com.java.design.repository.database;

import com.java.design.repository.ClientEngagement;
import java.sql.ResultSet;
import java.util.Iterator;

class DatabaseIterable implements Iterable<ClientEngagement>
{
    private ResultSet resultSet;

    public DatabaseIterable(final ResultSet resultSet)
    {
        this.resultSet = resultSet;
    }

    @Override
    public Iterator<ClientEngagement> iterator()
    {
        return new DatabaseIterator(resultSet);
    }
}
