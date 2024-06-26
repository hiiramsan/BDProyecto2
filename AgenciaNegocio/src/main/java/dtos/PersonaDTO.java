/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;

import java.io.Serializable;
import java.util.Calendar;

/**
 * Clase que representa un DTO (Data Transfer Object) para la entidad Persona.
 * Contiene los atributos necesarios para transferir datos de Persona entre diferentes componentes del sistema.
 * 
 * @author Carlos Sanchez
 */
public class PersonaDTO implements Serializable {
    private String rfc;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String telefono;
    private Calendar fechaNacimiento;
    private boolean discapacidad;

    // Constructor, getters y setters

    public PersonaDTO() {
    }

    /**
     * Constructor de PersonaDTO.
     * @param rfc RFC de la persona.
     * @param nombre Nombre de la persona.
     * @param apellidoPaterno Apellido paterno de la persona.
     * @param apellidoMaterno Apellido materno de la persona.
     * @param telefono Teléfono de la persona.
     * @param fechaNacimiento Fecha de nacimiento de la persona.
     * @param discapacidad Indica si la persona tiene alguna discapacidad.
     */
    public PersonaDTO(String rfc, String nombre, String apellidoPaterno, String apellidoMaterno, String telefono, Calendar fechaNacimiento, boolean discapacidad) {
        this.rfc = rfc;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.discapacidad = discapacidad;
    }

    // Getters y setters

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(boolean discapacidad) {
        this.discapacidad = discapacidad;
    }

    @Override
    public String toString() {
        return "PersonaDTO{" + "rfc=" + rfc + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", telefono=" + telefono + ", fechaNacimiento=" + fechaNacimiento + ", discapacidad=" + discapacidad + '}';
    }
    
    
}
