package org.example.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
    private final static String URL = "jdbc:mysql://localhost:3306/Books";
    private final static String USER = "root";
    private final static String PASSWORD = "p@ssw0rd";

    public static Connection connect() throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connect = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connection successful");

            return connect;
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static void main(String[] args) throws Exception {
        connect();
    }
}
