/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;

import com.mycompany.agenciapersistencia.controlador.utils.EstadoTramite;
import java.io.Serializable;
import java.util.Calendar;

/**
 * Clase que representa un DTO (Data Transfer Object) para la entidad Licencia.
 * Contiene los atributos necesarios para transferir datos de Licencia entre diferentes componentes del sistema.
 * 
 * @author Carlos Sanchez
 */
public class LicenciaDTO implements Serializable {

    private Calendar fechaExpedicion;
    private Calendar fechaVigencia;
    private float costo;
    private EstadoTramite estado;
    private String nombrePersona;
    
    public LicenciaDTO() {
    }

    /**
     * Constructor de LicenciaDTO.
     * @param fechaExpedicion Fecha de expedición de la licencia.
     * @param fechaVigencia Fecha de vigencia de la licencia.
     * @param costo Costo de la licencia.
     * @param estado Estado de la licencia.
     * @param nombrePersona Nombre de la persona asociada a la licencia.
     */
    public LicenciaDTO(Calendar fechaExpedicion, Calendar fechaVigencia, float costo, EstadoTramite estado, String nombrePersona) {
        this.fechaExpedicion = fechaExpedicion;
        this.fechaVigencia = fechaVigencia;
        this.costo = costo;
        this.estado = estado;
        this.nombrePersona = nombrePersona;
    }
    
    public Calendar getFechaExpedicion() {
        return fechaExpedicion;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }
    
    

    public void setFechaExpedicion(Calendar fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public Calendar getFechaVigencia() {
        return fechaVigencia;
    }

    public void setFechaVigencia(Calendar fechaVigencia) {
        this.fechaVigencia = fechaVigencia;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public EstadoTramite getEstado() {
        return estado;
    }

    public void setEstado(EstadoTramite estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "LicenciaDTO{" + "fechaExpedicion=" + fechaExpedicion + ", fechaVigencia=" + fechaVigencia + ", costo=" + costo + ", estado=" + estado + '}';
    }
    
    
}
