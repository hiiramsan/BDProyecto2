/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidadesJPA;

import com.mycompany.agenciapersistencia.controlador.utils.EstadoTramite;
import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.CascadeType;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author carlo
 */
@Entity
@Table(name="tramites")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo_tramite", discriminatorType = DiscriminatorType.STRING)
public class Tramite implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="costo", nullable=false)
    private float costo;
    
    @Enumerated(EnumType.STRING)
    @Column(name="estado", nullable=false)
    private EstadoTramite estado;
    
    @Column(name = "fecha_expedicion")
    @Temporal(TemporalType.DATE)
    private Calendar fechaExpedicion;
    
    @ManyToOne
    @JoinColumn(name="persona_id", nullable=false)
    private Persona persona;
    
    

    public Tramite() {
    }

    public Tramite(float costo, EstadoTramite estado, Calendar fechaExpedicion, Persona persona) {
        this.costo = costo;
        this.estado = estado;
        this.fechaExpedicion = fechaExpedicion;
        this.persona = persona;
    }
    
    public EstadoTramite getEstado() {
        return estado;
    }

    public void setEstado(EstadoTramite estado) {
        this.estado = estado;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public Calendar getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(Calendar fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    @Override
    public String toString() {
        return "Tramite{" + "id=" + id + ", costo=" + costo + ", estado=" + estado + ", fechaExpedicion=" + fechaExpedicion + ", persona=" + persona + '}';
    }
    
    @Transient
    public String getDecriminatorValue() {
        return this.getClass().getAnnotation(DiscriminatorValue.class).value();
    }
    
}
