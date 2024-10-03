package org.renewableEnergies.repository;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionMySQL {
    private String nameBD = "renewableEnergies";
    private String urlDB = "jdbc:mysql://localhost:3306/" + nameBD;
    private String user = "root";
    private String password = "0000";

    public Connection connect() {
        try {
            return DriverManager.getConnection(urlDB, user, password);
        } catch(Exception error) {
            System.out.println(error);
        }
        return null;
    }
}
