/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;

import com.mycompany.agenciapersistencia.controlador.utils.EstadoTramite;
import java.util.Date;

/**
 * Clase que representa un DTO (Data Transfer Object) para el trámite genérico.
 * Contiene los atributos necesarios para transferir datos de un trámite entre diferentes componentes del sistema.
 * 
 * @author Carlos Sanchez
 */
public class TramiteDTO {
    private Date fechaExpedicion;
    private double costo;
    private EstadoTramite estado;
    private String nombrePersona;
    private String tipoTramite;
    
    /**
     * Constructor de TramiteDTO.
     * @param fechaExpedicion Fecha de expedición del trámite.
     * @param costo Costo del trámite.
     * @param estado Estado del trámite.
     * @param nombrePersona Nombre de la persona asociada al trámite.
     */
    public TramiteDTO(Date fechaExpedicion, double costo, EstadoTramite estado, String nombrePersona) {
        this.fechaExpedicion = fechaExpedicion;
        this.costo = costo;
        this.estado = estado;
        this.nombrePersona = nombrePersona;
    }

    /**
     * Constructor vacío de TramiteDTO.
     */
    public TramiteDTO() {
    }

    /**
     * Obtiene el tipo de trámite.
     * @return Tipo de trámite.
     */
    public String getTipoTramite() {
        return tipoTramite;
    }

    /**
     * Establece el tipo de trámite.
     * @param tipoTramite Tipo de trámite.
     */
    public void setTipoTramite(String tipoTramite) {
        this.tipoTramite = tipoTramite;
    }
    
    /**
     * Obtiene la fecha de expedición del trámite.
     * @return Fecha de expedición del trámite.
     */
    public Date getFechaExpedicion() {
        return fechaExpedicion;
    }

    /**
     * Establece la fecha de expedición del trámite.
     * @param fechaExpedicion Fecha de expedición del trámite.
     */
    public void setFechaExpedicion(Date fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    /**
     * Obtiene el costo del trámite.
     * @return Costo del trámite.
     */
    public double getCosto() {
        return costo;
    }

    /**
     * Establece el costo del trámite.
     * @param costo Costo del trámite.
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }

    /**
     * Obtiene el estado del trámite.
     * @return Estado del trámite.
     */
    public EstadoTramite getEstado() {
        return estado;
    }

    /**
     * Establece el estado del trámite.
     * @param estado Estado del trámite.
     */
    public void setEstado(EstadoTramite estado) {
        this.estado = estado;
    }

    /**
     * Obtiene el nombre de la persona asociada al trámite.
     * @return Nombre de la persona asociada al trámite.
     */
    public String getNombrePersona() {
        return nombrePersona;
    }

    /**
     * Establece el nombre de la persona asociada al trámite.
     * @param nombrePersona Nombre de la persona asociada al trámite.
     */
    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }


}
