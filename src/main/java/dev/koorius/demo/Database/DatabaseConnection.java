package dev.koorius.demo.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection connect() {
        Connection dbConnector = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            dbConnector = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "if30luw@");
        } catch (ClassNotFoundException | SQLException e) {
            e.getMessage();
        }
        return dbConnector;
    }


}
