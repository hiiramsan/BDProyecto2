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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Clase que representa la entidad de Licencia en la base de datos.
 * Extiende de la clase Tramite.
 * Contiene información sobre las licencias registradas en el sistema.
 * @author Carlos Sanchez
 */
@Entity
@DiscriminatorValue("licencia")
public class Licencia extends Tramite implements Serializable {
    
    /**
     * vigencia
     */
    @Column(name = "vigencia")
    @Temporal(TemporalType.DATE)
    private Calendar vigencia;

    /**
     * Constructor de la clase Licencia.
     * @param vigencia Fecha de vigencia de la licencia.
     */
    public Licencia(Calendar vigencia) {
        this.vigencia = vigencia;
    }

    /**
     * Constructor de la clase Licencia.
     * @param vigencia Fecha de vigencia de la licencia.
     * @param costo Costo de la licencia.
     * @param estado Estado de la licencia.
     * @param fechaExpedicion Fecha de expedición de la licencia.
     * @param persona Persona asociada a la licencia.
     */
    public Licencia(Calendar vigencia, float costo, EstadoTramite estado, Calendar fechaExpedicion, Persona persona) {
        super(costo, estado, fechaExpedicion, persona);
        this.vigencia = vigencia;
    }

    /**
     * Constructor por defecto de la clase Licencia.
     */
    public Licencia() {
    }

    /**
     * Obtiene la fecha de vigencia de la licencia.
     * @return La fecha de vigencia de la licencia.
     */
    public Calendar getVigencia() {
        return vigencia;
    }

    /**
     * Establece la fecha de vigencia de la licencia.
     * @param vigencia La fecha de vigencia de la licencia.
     */
    public void setVigencia(Calendar vigencia) {
        this.vigencia = vigencia;
    }
    
    /**
     * Determina el estado de la licencia (ACTIVA o VENCIDA) basado en su fecha de vigencia.
     * @return EstadoTramite.ACTIVA si la licencia está vigente, EstadoTramite.VENCIDA si la licencia está vencida.
     */
    public EstadoTramite determinarEstado() {
        Calendar fechaActual = Calendar.getInstance();
        if (getVigencia().after(fechaActual)) {
            return EstadoTramite.ACTIVA;
        } else {
            return EstadoTramite.VENCIDA;
        }
    }

    /**
     * Retorna una representación en cadena de la licencia.
     * @return Una cadena que representa la licencia.
     */
    @Override
    public String toString() {
        return "Licencia{" + "vigencia=" + vigencia + '}';
    }
}
