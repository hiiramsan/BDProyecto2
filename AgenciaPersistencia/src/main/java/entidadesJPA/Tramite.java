/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidadesJPA;

import com.mycompany.agenciapersistencia.controlador.utils.EstadoTramite;
import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Clase que representa la entidad de Tramite en la base de datos.
 * Es una clase padre para otras entidades de tramites específicos como Licencia y Placa.
 * Contiene información común a todos los trámites.
 * @author carlo
 */
@Entity
@Table(name="tramites")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo_tramite", discriminatorType = DiscriminatorType.STRING)
public class Tramite implements Serializable {
    
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * costo
     */
    @Column(name="costo", nullable=false)
    private float costo;
    
    /**
     * Estado Tramite
     */
    @Enumerated(EnumType.STRING)
    @Column(name="estado", nullable=false)
    private EstadoTramite estado;
    
    /**
     * fecha expedicion
     */
    @Column(name = "fecha_expedicion")
    @Temporal(TemporalType.DATE)
    private Calendar fechaExpedicion;
    
    /**
     * persona entty
     */
    @ManyToOne
    @JoinColumn(name="persona_id", nullable=false)
    private Persona persona;
    
    /**
     * Constructor por defecto de la clase Tramite.
     */
    public Tramite() {
    }

    /**
     * Constructor de la clase Tramite.
     * @param costo Costo del trámite.
     * @param estado Estado del trámite.
     * @param fechaExpedicion Fecha de expedición del trámite.
     * @param persona Persona asociada al trámite.
     */
    public Tramite(float costo, EstadoTramite estado, Calendar fechaExpedicion, Persona persona) {
        this.costo = costo;
        this.estado = estado;
        this.fechaExpedicion = fechaExpedicion;
        this.persona = persona;
    }
    
    /**
     * Método para obtener el estado del trámite.
     * @return Estado del trámite.
     */
    public EstadoTramite getEstado() {
        return estado;
    }

    /**
     * Método para establecer el estado del trámite.
     * @param estado Estado del trámite.
     */
    public void setEstado(EstadoTramite estado) {
        this.estado = estado;
    }
    
    /**
     * Método para obtener el ID del trámite.
     * @return ID del trámite.
     */
    public Long getId() {
        return id;
    }

    /**
     * Método para establecer el ID del trámite.
     * @param id ID del trámite.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Método para obtener el costo del trámite.
     * @return Costo del trámite.
     */
    public float getCosto() {
        return costo;
    }

    /**
     * Método para establecer el costo del trámite.
     * @param costo Costo del trámite.
     */
    public void setCosto(float costo) {
        this.costo = costo;
    }

    /**
     * Método para obtener la fecha de expedición del trámite.
     * @return Fecha de expedición del trámite.
     */
    public Calendar getFechaExpedicion() {
        return fechaExpedicion;
    }

    /**
     * Método para establecer la fecha de expedición del trámite.
     * @param fechaExpedicion Fecha de expedición del trámite.
     */
    public void setFechaExpedicion(Calendar fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    /**
     * Método para obtener la persona asociada al trámite.
     * @return Persona asociada al trámite.
     */
    public Persona getPersona() {
        return persona;
    }

    /**
     * Método para establecer la persona asociada al trámite.
     * @param persona Persona asociada al trámite.
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    /**
     * Método para obtener el valor del discriminador del trámite.
     * @return Valor del discriminador del trámite.
     */
    public String getDecriminatorValue() {
        return this.getClass().getAnnotation(DiscriminatorValue.class).value();
    }
    
    /**
     * Metodo toString
     * @return string de tramite
     */
    @Override
    public String toString() {
        return "Tramite{" + "id=" + id + ", costo=" + costo + ", estado=" + estado + ", fechaExpedicion=" + fechaExpedicion + ", persona=" + persona + '}';
    }
    
}
