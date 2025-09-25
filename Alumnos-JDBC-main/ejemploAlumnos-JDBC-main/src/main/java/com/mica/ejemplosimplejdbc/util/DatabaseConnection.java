package com.mica.ejemplosimplejdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection getConnection() throws SQLException {
        String url = Config.getProperty("db.url");
        String usuario = Config.getProperty("db.username");
        String contrasena = Config.getProperty("db.password");
        return DriverManager.getConnection(url, usuario, contrasena);
    }
}
