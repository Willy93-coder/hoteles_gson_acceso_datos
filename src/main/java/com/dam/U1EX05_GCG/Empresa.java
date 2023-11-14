package com.dam.U1EX05_GCG;

import java.util.List;

public class Empresa {
    private String empresa;
    private int fundacion;
    private String ciudadSede;
    private String paisSede;
    private Hotel[] hotel;

    
    public Empresa(String empresa, int fundacion, String ciudadSede, String paisSede, Hotel[] hotel) {
        this.empresa = empresa;
        this.fundacion = fundacion;
        this.ciudadSede = ciudadSede;
        this.paisSede = paisSede;
        this.hotel = hotel;
    }


    public String getEmpresa() {
        return empresa;
    }


    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }


    public int getFundacion() {
        return fundacion;
    }


    public void setFundacion(int fundacion) {
        this.fundacion = fundacion;
    }


    public String getCiudadSede() {
        return ciudadSede;
    }


    public void setCiudadSede(String ciudadSede) {
        this.ciudadSede = ciudadSede;
    }


    public String getPaisSede() {
        return paisSede;
    }


    public void setPaisSede(String paisSede) {
        this.paisSede = paisSede;
    }


    public Hotel[] getHotel() {
        return hotel;
    }


    public void setHotel(Hotel[] hotel) {
        this.hotel = hotel;
    }


    @Override
    public String toString() {
        return "Empresa [empresa=" + empresa + ", fundacion=" + fundacion + ", ciudadSede=" + ciudadSede + ", paisSede="
                + paisSede + ", hotel=" + hotel + "]";
    }
    
    
}
