/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author A Tirador Laser
 */
public class Comida {
    
    private int idComida;
    private String nombre;
    private String detalle;
    private int cantCalorias;
    private  boolean estado;
    private String tipoComida;

    public Comida(int idComida, String nombre, String detalle, int cantCalorias, boolean estado,String tipoComida) {
        this.idComida = idComida;
        this.nombre = nombre;
        this.detalle = detalle;
        this.cantCalorias = cantCalorias;
        this.estado = estado;
        this.tipoComida = tipoComida;
    }

    public Comida(String nombre, String detalle, int cantCalorias, boolean estado,String tipoComida) {
        this.nombre = nombre;
        this.detalle = detalle;
        this.cantCalorias = cantCalorias;
        this.estado = estado;
        this.tipoComida = tipoComida;    
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Comida() {
    }

    public int getIdComida() {
        return idComida;
    }

    public void setIdComida(int idComida) {
        this.idComida = idComida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getCantCalorias() {
        return cantCalorias;
    }

    public void setCantCalorias(int cantCalorias) {
        this.cantCalorias = cantCalorias;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    @Override
    public String toString() {
        return "idComida: " + idComida +
               " \nNombre: " + nombre + 
               " \nDetalle: " + detalle + 
               " \nCantCalorias: " + cantCalorias + 
               " \nEstado: " + estado +
                " \nTipoComida: " + tipoComida ;
    }

  
    
    
    
}
