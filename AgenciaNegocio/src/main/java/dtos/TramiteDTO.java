/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;
import com.mycompany.agenciapersistencia.controlador.utils.EstadoTramite;
import java.util.Date;
/**
 *
 * @author carlo
 */


public class TramiteDTO {
    private Date fechaExpedicion;
    private double costo;
    private EstadoTramite estado;
    private String nombrePersona;
    private String tipoTramite;
    
    public TramiteDTO(Date fechaExpedicion, double costo, EstadoTramite estado, String nombrePersona) {
        this.fechaExpedicion = fechaExpedicion;
        this.costo = costo;
        this.estado = estado;
        this.nombrePersona = nombrePersona;
    }

    public TramiteDTO() {
    }

    public String getTipoTramite() {
        return tipoTramite;
    }

    public void setTipoTramite(String tipoTramite) {
        this.tipoTramite = tipoTramite;
    }
    
    public Date getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(Date fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public EstadoTramite getEstado() {
        return estado;
    }

    public void setEstado(EstadoTramite estado) {
        this.estado = estado;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }


}

