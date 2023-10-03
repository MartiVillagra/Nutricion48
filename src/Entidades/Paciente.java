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
public class Paciente {
    
    private int idPaciente;
    private String nombre;
    private int dni;
    private String domicilio;
    private int telefono;
    private boolean estado;

    public Paciente(int idPaciente, String nombre, int dni, String domicilio, int telefono, boolean estado) {
        this.idPaciente = idPaciente;
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.estado = estado;
    }

    public Paciente(String nombre, int dni, String domicilio, int telefono, boolean estado) {
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.estado = estado;
    }

    public Paciente() {
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Paciente{" + "idPaciente=" + idPaciente + ", nombre=" + nombre + ", dni=" + dni + ", domicilio=" + domicilio + ", telefono=" + telefono + ", estado=" + estado + '}';
    }

    
    
    
}
