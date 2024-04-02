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
 *
 * @author carlo
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

    public PlacaDTO(String claveNumerica, EstadoTramite estado, Calendar fechaExpedicion, Automovil automovil, float costo, String nombrePersona) {
        this.claveNumerica = claveNumerica;
        this.estado = estado;
        this.fechaExpedicion = fechaExpedicion;
        this.automovil = automovil;
        this.costo = costo;
        this.nombrePersona = nombrePersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }
    
    

    public String getClaveNumerica() {
        return claveNumerica;
    }

    public void setClaveNumerica(String claveNumerica) {
        this.claveNumerica = claveNumerica;
    }

    public EstadoTramite getEstado() {
        return estado;
    }

    public void setEstado(EstadoTramite estado) {
        this.estado = estado;
    }

    public Calendar getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(Calendar fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public Automovil getAutomovil() {
        return automovil;
    }

    public void setAutomovil(Automovil automovil) {
        this.automovil = automovil;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
}
