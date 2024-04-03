/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidadesJPA;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Clase que representa la entidad de Automovil en la base de datos.
 * Esta clase es parte del modelo de persistencia JPA.
 * Contiene información sobre los automóviles registrados en el sistema.
 * @author Carlos Sanchez
 */
@Entity
@Table(name = "automoviles")
public class Automovil extends Vehiculo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "persona_id", nullable = false)
    private Persona persona;

    @OneToMany(mappedBy = "automovil")
    private List<Placa> placas;

    /**
     * Constructor por defecto de la clase Automovil.
     */
    public Automovil() {
    }

    public Automovil(Persona persona, List<Placa> placas) {
        this.persona = persona;
    }

    public Automovil(String numSerie, String marca, String linea, String color, int modelo, Persona persona) {
        super(numSerie, marca, linea, color, modelo);
        this.persona = persona;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public List<Placa> getPlacas() {
        return placas;
    }

    public void setPlacas(List<Placa> placas) {
        this.placas = placas;
    }

}
