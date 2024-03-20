/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidadesJPA;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
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

/**
 *
 * @author carlo
 */
@Entity
@Table(name="tramite")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo_tramite", discriminatorType = DiscriminatorType.STRING)
public class Tramite implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="costo", nullable=false)
    private float costo;
    
    @Column(name="estado", length=50, nullable=false)
    private String estado;
    
    @Column(name = "fecha_expedicion")
    @Temporal(TemporalType.DATE)
    private Calendar fechaExpedicion;
    
    @ManyToOne
    @JoinColumn(name="persona_id", nullable=false)
    private Persona persona;
    
    @OneToMany(mappedBy = "persona", cascade = CascadeType.PERSIST)
    private List<Tramite> tramites;

    public Tramite() {
    }

    public Tramite(float costo, String estado, Calendar fechaExpedicion, Persona persona, List<Tramite> tramites) {
        this.costo = costo;
        this.estado = estado;
        this.fechaExpedicion = fechaExpedicion;
        this.persona = persona;
        this.tramites = tramites;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

    public List<Tramite> getTramites() {
        return tramites;
    }

    public void setTramites(List<Tramite> tramites) {
        this.tramites = tramites;
    }

    @Override
    public String toString() {
        return "Tramite{" + "id=" + id + ", costo=" + costo + ", estado=" + estado + ", fechaExpedicion=" + fechaExpedicion + ", persona=" + persona + ", tramites=" + tramites + '}';
    }
     
     
    
}
