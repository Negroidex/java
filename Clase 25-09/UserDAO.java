package com.juan.ejemplomvc.dao;

import com.ejemplo.app.models.User;
import org.mindrot.jbcrypt.BCrypt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {

    public boolean registrarUsuario(String username, String password) throws SQLException {
        // TODO
    }

    public User obtenerUsuario(String username) {
        // TODO
    }

    public boolean comprobarLogin(String username, String password) {
        // TODO
    }
}