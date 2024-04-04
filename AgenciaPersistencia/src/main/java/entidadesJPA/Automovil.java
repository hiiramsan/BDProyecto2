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
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * entidad persona
     */
    @ManyToOne
    @JoinColumn(name = "persona_id", nullable = false)
    private Persona persona;
    
    /**
     * placas
     */
    @OneToMany(mappedBy = "automovil")
    private List<Placa> placas;

    /**
     * Constructor por defecto de la clase Automovil.
     */
    public Automovil() {
    }

    /**
     * Constructor de la clase Automovil con persona y placas.
     * @param persona La persona propietaria del automóvil.
     * @param placas Las placas asociadas al automóvil.
     */
    public Automovil(Persona persona, List<Placa> placas) {
        this.persona = persona;
    }

    /**
     * Constructor de la clase Automovil con parámetros completos.
     * @param numSerie Número de serie del automóvil.
     * @param marca Marca del automóvil.
     * @param linea Línea del automóvil.
     * @param color Color del automóvil.
     * @param modelo Modelo del automóvil.
     * @param persona La persona propietaria del automóvil.
     */
    public Automovil(String numSerie, String marca, String linea, String color, int modelo, Persona persona) {
        super(numSerie, marca, linea, color, modelo);
        this.persona = persona;
    }

    /**
     * Obtiene la persona propietaria del automóvil.
     * @return La persona propietaria del automóvil.
     */
    public Persona getPersona() {
        return persona;
    }

    /**
     * Establece la persona propietaria del automóvil.
     * @param persona La persona propietaria del automóvil.
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    /**
     * Obtiene la lista de placas asociadas al automóvil.
     * @return La lista de placas asociadas al automóvil.
     */
    public List<Placa> getPlacas() {
        return placas;
    }

    /**
     * Establece la lista de placas asociadas al automóvil.
     * @param placas La lista de placas asociadas al automóvil.
     */
    public void setPlacas(List<Placa> placas) {
        this.placas = placas;
    }

}
