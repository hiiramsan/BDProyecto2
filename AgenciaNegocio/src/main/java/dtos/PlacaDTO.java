/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;

import com.mycompany.agenciapersistencia.controlador.utils.EstadoTramite;
import entidadesJPA.Automovil;
import java.io.Serializable;
import java.util.Calendar;

/**
 * Clase que representa un DTO (Data Transfer Object) para la entidad Placa.
 * Contiene los atributos necesarios para transferir datos de Placa entre diferentes componentes del sistema.
 * 
 * @author Carlos Sanchez
 */
public class PlacaDTO implements Serializable {

    private String claveNumerica;
    private EstadoTramite estado;
    private Calendar fechaExpedicion;
    private Automovil automovil;
    private float costo;
    private String nombrePersona;

    public PlacaDTO() {
    }

    /**
     * Constructor de PlacaDTO.
     * @param claveNumerica Clave numérica de la placa.
     * @param estado Estado de la placa.
     * @param fechaExpedicion Fecha de expedición de la placa.
     * @param automovil Automóvil asociado a la placa.
     * @param costo Costo de la placa.
     * @param nombrePersona Nombre de la persona asociada a la placa.
     */
    public PlacaDTO(String claveNumerica, EstadoTramite estado, Calendar fechaExpedicion, Automovil automovil, float costo, String nombrePersona) {
        this.claveNumerica = claveNumerica;
        this.estado = estado;
        this.fechaExpedicion = fechaExpedicion;
        this.automovil = automovil;
        this.costo = costo;
        this.nombrePersona = nombrePersona;
    }

    /**
     * Obtiene el nombre de la persona asociada a la placa.
     * @return Nombre de la persona asociada a la placa.
     */
    public String getNombrePersona() {
        return nombrePersona;
    }

    /**
     * Establece el nombre de la persona asociada a la placa.
     * @param nombrePersona Nombre de la persona asociada a la placa.
     */
    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }
    
    /**
     * Obtiene la clave numérica de la placa.
     * @return Clave numérica de la placa.
     */
    public String getClaveNumerica() {
        return claveNumerica;
    }

    /**
     * Establece la clave numérica de la placa.
     * @param claveNumerica Clave numérica de la placa.
     */
    public void setClaveNumerica(String claveNumerica) {
        this.claveNumerica = claveNumerica;
    }

    /**
     * Obtiene el estado de la placa.
     * @return Estado de la placa.
     */
    public EstadoTramite getEstado() {
        return estado;
    }

    /**
     * Establece el estado de la placa.
     * @param estado Estado de la placa.
     */
    public void setEstado(EstadoTramite estado) {
        this.estado = estado;
    }

    /**
     * Obtiene la fecha de expedición de la placa.
     * @return Fecha de expedición de la placa.
     */
    public Calendar getFechaExpedicion() {
        return fechaExpedicion;
    }

    /**
     * Establece la fecha de expedición de la placa.
     * @param fechaExpedicion Fecha de expedición de la placa.
     */
    public void setFechaExpedicion(Calendar fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    /**
     * Obtiene el automóvil asociado a la placa.
     * @return Automóvil asociado a la placa.
     */
    public Automovil getAutomovil() {
        return automovil;
    }

    /**
     * Establece el automóvil asociado a la placa.
     * @param automovil Automóvil asociado a la placa.
     */
    public void setAutomovil(Automovil automovil) {
        this.automovil = automovil;
    }

    /**
     * Obtiene el costo de la placa.
     * @return Costo de la placa.
     */
    public float getCosto() {
        return costo;
    }

    /**
     * Establece el costo de la placa.
     * @param costo Costo de la placa.
     */
    public void setCosto(float costo) {
        this.costo = costo;
    }
}
