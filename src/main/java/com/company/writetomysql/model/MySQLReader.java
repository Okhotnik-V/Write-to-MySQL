package com.company.writetomysql.model;

import com.company.writetomysql.ui.MySQLConnecting;
import com.company.writetomysql.ui.MySQLReading;

import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLReader implements MySQLReading {

    @Override
    public String readBD() {
        MySQLConnecting connecting = new MySQLConnector();
        String sql = "SELECT * FROM linedb";
        String linesBD = "";
        try {
            Statement statement = connecting.connection().createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            //отримання інфи з бд
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String line = resultSet.getString(2);
                String lineBD = "id, text: " + id + ", " + line;
                linesBD = linesBD + "\n" + lineBD;
            }
            return linesBD;
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }
    }
}
