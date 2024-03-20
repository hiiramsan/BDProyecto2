/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidadesJPA;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author carlo
 */
@Entity
@DiscriminatorValue("licencia")
public class Licencia extends Tramite implements Serializable {
    
    @Column(name = "vigencia")
    @Temporal(TemporalType.DATE)
    private Calendar vigencia;

    public Licencia(Calendar vigencia) {
        this.vigencia = vigencia;
    }

    public Licencia(Calendar vigencia, float costo, String estado, Calendar fechaExpedicion, Persona persona, List<Tramite> tramites) {
        super(costo, estado, fechaExpedicion, persona, tramites);
        this.vigencia = vigencia;
    }

    public Licencia() {
    }

    public Calendar getVigencia() {
        return vigencia;
    }

    public void setVigencia(Calendar vigencia) {
        this.vigencia = vigencia;
    }

    @Override
    public String toString() {
        return "Licencia{" + "vigencia=" + vigencia + '}';
    }

    
    
}
