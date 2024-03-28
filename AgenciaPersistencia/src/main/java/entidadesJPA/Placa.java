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
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author carlo
 */
@Entity
@DiscriminatorValue("placa")
public class Placa extends Tramite implements Serializable {
        
    @Column(name = "fecha_recepcion")
    @Temporal(TemporalType.DATE)
    private Calendar fechaRecepcion;
    
    @Column(name="numero_alfanumerico", length=7, nullable=false)
    private String numeroAlfanumerico;
    
    @ManyToOne
    @JoinColumn(name="automovil_id", nullable=false)
    private Automovil automovil;

    public Placa(Calendar fechaRecepcion, String numeroAlfanumerico, Automovil automovil) {
        this.fechaRecepcion = fechaRecepcion;
        this.numeroAlfanumerico = numeroAlfanumerico;
        this.automovil = automovil;
    }

    public Placa(String numeroAlfanumerico, Automovil automovil, float costo, EstadoTramite estado, Calendar fechaExpedicion, Persona persona) {
        super(costo, estado, fechaExpedicion, persona);
        this.numeroAlfanumerico = numeroAlfanumerico;
        this.automovil = automovil;
    }

    public Placa() {
    }

    public Calendar getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(Calendar fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public String getNumeroAlfanumerico() {
        return numeroAlfanumerico;
    }

    public void setNumeroAlfanumerico(String numeroAlfanumerico) {
        this.numeroAlfanumerico = numeroAlfanumerico;
    }

    public Automovil getAutomovil() {
        return automovil;
    }

    public void setAutomovil(Automovil automovil) {
        this.automovil = automovil;
    }
    
    

    @Override
    public String toString() {
        return "Placa{" + "fechaRecepcion=" + fechaRecepcion + ", numeroAlfanumerico=" + numeroAlfanumerico + ", automovil=" + automovil + '}';
    }
    
    
    
}
