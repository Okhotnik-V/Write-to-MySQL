package com.company.writetomysql;

import com.company.writetomysql.model.MySQLCreator;
import com.company.writetomysql.model.MySQLReader;
import com.company.writetomysql.ui.LineDAO;
import com.company.writetomysql.ui.MySQLReading;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LineDAO lineDAO = new MySQLCreator();
        MySQLReading mySQLReading = new MySQLReader();
        Scanner scanner = new Scanner(System.in);
        Boolean restart = true;
        System.out.println("Write text");
        lineDAO.createLine(scanner.nextLine());
        System.out.println(mySQLReading.readBD());
        do {
            System.out.println("If you want to exit the program, enter \"exit\", otherwise restart the program.");
            String exit = scanner.nextLine();
            if (exit.equals("exit")) {
                return;
            } else {
                main(args);
            }
        } while (restart);
    }
}
