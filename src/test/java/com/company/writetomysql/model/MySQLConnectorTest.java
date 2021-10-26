package com.company.writetomysql.model;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnectorTest {

    @Test
    public void testConnect() {
        try {
            Connection mockConnection = Mockito.mock(Connection.class);
            Statement statement = Mockito.mock(Statement.class);
            Mockito.when(mockConnection.createStatement()).thenReturn(statement);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}