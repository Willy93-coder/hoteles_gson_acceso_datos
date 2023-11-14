package com.dam.U1EX05_GCG;

public class Hotel {
    private String nombre;
    private int estrellas;
    private int telefono;
    private Direccion direccion;

    
    public Hotel(String nombre, int estrellas, int telefono, Direccion direccion) {
        this.nombre = nombre;
        this.estrellas = estrellas;
        this.telefono = telefono;
        this.direccion = direccion;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public int getTelefono() {
        return telefono;
    }


    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }


    public Direccion getDireccion() {
        return direccion;
    }


    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }


    @Override
    public String toString() {
        return "Hotel [nombre=" + nombre + ", estrellas=" + estrellas + ", telefono=" + telefono + ", direccion="
                + direccion + "]";
    }
}
