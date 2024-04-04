/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidadesJPA;

import com.mycompany.agenciapersistencia.controlador.utils.EstadoTramite;
import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Clase que representa la entidad de Placa en la base de datos.
 * Extiende de la clase Tramite.
 * Contiene información sobre las placas registradas en el sistema.
 * @author Carlos Sanchez
 */
@Entity
@DiscriminatorValue("placa")
public class Placa extends Tramite implements Serializable {
    /**
     * fecha recepcion
     */
    @Column(name = "fecha_recepcion")
    @Temporal(TemporalType.DATE)
    private Calendar fechaRecepcion;
    
    /**
     * placa, numero alfanumerico
     */
    @Column(name="numero_alfanumerico", length=7, nullable=false)
    private String numeroAlfanumerico;
    
    /**
     * automovil entity
     */
    @ManyToOne
    @JoinColumn(name="automovil_id", nullable=false)
    private Automovil automovil;

    /**
     * Constructor de la clase Placa.
     * @param fechaRecepcion Fecha de recepción de la placa.
     * @param numeroAlfanumerico Número alfanumérico de la placa.
     * @param automovil Automóvil asociado a la placa.
     */
    public Placa(Calendar fechaRecepcion, String numeroAlfanumerico, Automovil automovil) {
        this.fechaRecepcion = fechaRecepcion;
        this.numeroAlfanumerico = numeroAlfanumerico;
        this.automovil = automovil;
    }

    /**
     * Constructor de la clase Placa.
     * @param numeroAlfanumerico Número alfanumérico de la placa.
     * @param automovil Automóvil asociado a la placa.
     * @param costo Costo de la placa.
     * @param estado Estado de la placa.
     * @param fechaExpedicion Fecha de expedición de la placa.
     * @param persona Persona asociada a la placa.
     */
    public Placa(String numeroAlfanumerico, Automovil automovil, float costo, EstadoTramite estado, Calendar fechaExpedicion, Persona persona) {
        super(costo, estado, fechaExpedicion, persona);
        this.numeroAlfanumerico = numeroAlfanumerico;
        this.automovil = automovil;
    }

    /**
     * Constructor por defecto de la clase Placa.
     */
    public Placa() {
    }

    /**
     * Obtiene la fecha de recepción de la placa.
     * @return La fecha de recepción de la placa.
     */
    public Calendar getFechaRecepcion() {
        return fechaRecepcion;
    }

    /**
     * Establece la fecha de recepción de la placa.
     * @param fechaRecepcion La fecha de recepción de la placa.
     */
    public void setFechaRecepcion(Calendar fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    /**
     * Obtiene el número alfanumérico de la placa.
     * @return El número alfanumérico de la placa.
     */
    public String getNumeroAlfanumerico() {
        return numeroAlfanumerico;
    }

    /**
     * Establece el número alfanumérico de la placa.
     * @param numeroAlfanumerico El número alfanumérico de la placa.
     */
    public void setNumeroAlfanumerico(String numeroAlfanumerico) {
        this.numeroAlfanumerico = numeroAlfanumerico;
    }

    /**
     * Obtiene el automóvil asociado a la placa.
     * @return El automóvil asociado a la placa.
     */
    public Automovil getAutomovil() {
        return automovil;
    }

    /**
     * Establece el automóvil asociado a la placa.
     * @param automovil El automóvil asociado a la placa.
     */
    public void setAutomovil(Automovil automovil) {
        this.automovil = automovil;
    }

    /**
     * Retorna una representación en cadena de la placa.
     * @return Una cadena que representa la placa.
     */
    @Override
    public String toString() {
        return "Placa{" + "fechaRecepcion=" + fechaRecepcion + ", numeroAlfanumerico=" + numeroAlfanumerico + ", automovil=" + automovil + '}';
    }
}
