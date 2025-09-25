package com.mica.ejemplosimplejdbc.model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Alumno {
    private final SimpleIntegerProperty id;
    private final SimpleStringProperty nombre;
    private final SimpleIntegerProperty edad;
    private final SimpleStringProperty email;
    private final SimpleStringProperty telefono;


    public Alumno(int id, String nombre, int edad,String email,String telefono) {
        this.id = new SimpleIntegerProperty(id);
        this.nombre = new SimpleStringProperty(nombre);
        this.edad = new SimpleIntegerProperty(edad);
        this.email = new SimpleStringProperty(email);
        this.telefono = new SimpleStringProperty(telefono);
    }

    public int getId() {
        return id.get();
    }

    public String getNombre() {
        return nombre.get();
    }

    public int getEdad() {
        return edad.get();
    }

    public String getEmail() {
        return email.get();
    }

    public SimpleStringProperty emailProperty() {
        return email;
    }

    public String getTelefono() {
        return telefono.get();
    }

    public SimpleStringProperty telefonoProperty() {
        return telefono;
    }
}
