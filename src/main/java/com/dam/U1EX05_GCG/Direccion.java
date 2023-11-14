package com.dam.U1EX05_GCG;

public class Direccion {
    private String calle;
    private int numero;
    private String ciudad;
    private int codigoPostal;
    private String pais;

    
    public Direccion(String calle, int numero, String ciudad, int codigoPostal, String pais) {
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
        this.pais = pais;
    }

    


    public String getCalle() {
        return calle;
    }




    public void setCalle(String calle) {
        this.calle = calle;
    }




    public int getNumero() {
        return numero;
    }




    public void setNumero(int numero) {
        this.numero = numero;
    }




    public String getCiudad() {
        return ciudad;
    }




    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }




    public int getCodigoPostal() {
        return codigoPostal;
    }




    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }




    public String getPais() {
        return pais;
    }




    public void setPais(String pais) {
        this.pais = pais;
    }




    @Override
    public String toString() {
        return "Direccion [calle=" + calle + ", numero=" + numero + ", ciudad=" + ciudad + ", codigoPostal="
                + codigoPostal + ", pais=" + pais + "]";
    }
}
