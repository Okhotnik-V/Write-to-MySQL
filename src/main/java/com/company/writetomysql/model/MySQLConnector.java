package com.company.writetomysql.model;

import com.company.writetomysql.ui.MySQLConnecting;

import java.sql.Connection;
import java.sql.DriverManager;


public class MySQLConnector implements MySQLConnecting {

    @Override
    public Connection connection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://127.0.0.2:3306/writelinedb", "root", "okhotnik12"); // jdbc драйвер
        } catch (Throwable e) {
            System.out.println(e);
            System.err.println("Error Connecter MySQL");
            return null;
        }
    }
}

