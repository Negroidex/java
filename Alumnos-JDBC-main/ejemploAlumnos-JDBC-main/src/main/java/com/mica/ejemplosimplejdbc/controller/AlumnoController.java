package com.mica.ejemplosimplejdbc.controller;

import com.mica.ejemplosimplejdbc.model.Alumno;
import com.mica.ejemplosimplejdbc.util.DatabaseConnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class AlumnoController {
    @FXML
    private TableView<Alumno> table;

    @FXML
    private TableColumn<Alumno, Integer> colId;

    @FXML
    private TableColumn<Alumno, String> colNombre;

    @FXML
    private TableColumn<Alumno, Integer> colEdad;

    @FXML
    private TableColumn<Alumno,String> colEmail;

    @FXML
    private TableColumn<Alumno,String> colTelefono;

    @FXML
    public void initialize() {
        // Configurar columnas
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colEdad.setCellValueFactory(new PropertyValueFactory<>("edad"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colTelefono.setCellValueFactory(new PropertyValueFactory<>("telefono"));

        // Cargar datos desde la base
        ObservableList<Alumno> alumnos = FXCollections.observableArrayList();
        try (Connection conexion = DatabaseConnection.getConnection();
             Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM alumnos")) {

            while (rs.next()) {
                alumnos.add(new Alumno(rs.getInt("id"), rs.getString("nombre"), rs.getInt("edad"),rs.getString("email"),rs.getString("telefono")));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        table.setItems(alumnos);
    }
}
