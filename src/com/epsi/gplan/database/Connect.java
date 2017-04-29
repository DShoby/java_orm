package com.epsi.gplan.database;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Connect {

    public Connect() {}

    public Connection getDBConnexion(){

        System.out.println("-------- PostgreSQL "
                + "JDBC Connection Testing ------------");
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your PostgreSQL JDBC Driver? "
                    + "Include in your library path!");
            e.printStackTrace();
        }
        System.out.println("PostgreSQL JDBC Driver Registered!");
        Connection connexion = null;

        try {
            connexion = DriverManager.getConnection(
                    "jdbc:postgresql://127.0.0.1:5432/testdb", "mkyong",
                    "123456");

        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }

        if (connexion != null) {
            System.out.println("You made it, take control your database now!");
        } else {
            System.out.println("Failed to make connection!");
        }
        return connexion;
    }
}