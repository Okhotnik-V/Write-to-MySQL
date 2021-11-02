package com.company.writetomysql.model;

import com.company.writetomysql.ui.LineDAO;

import java.sql.PreparedStatement;

public class MySQLCreator implements LineDAO {
    MySQLConnector mySQLConnector = new MySQLConnector();

    @Override
    public void createLine(String line) {
        try {
            //запис в БД
            String sql = "INSERT INTO linedb (line) VALUES (?)";
            PreparedStatement preparedStatement = mySQLConnector.connection().prepareStatement(sql); //попередньо компілює запити, які можуть містити вхідні параметри "?"
            preparedStatement.setString(1, line);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
