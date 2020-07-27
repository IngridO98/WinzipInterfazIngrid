package com.example.winzipinterfazingrid;

public class MyFiles {
    String Nombre;
    String Descripcion;

    public MyFiles(){

    }

    public MyFiles(String nombre, String descripcion) {
        this.Nombre = nombre;
        this.Descripcion = descripcion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
