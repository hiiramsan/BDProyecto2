/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidadesJPA;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * Clase que representa la entidad de Vehiculo en la base de datos.
 * Esta clase es parte del modelo de persistencia JPA.
 * Contiene información sobre los vehículos registrados en el sistema.
 * La clase es abstracta y sirve como base para otros tipos específicos de vehículos.
 * @author Carlos Sanchez
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Vehiculo implements Serializable {

    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    /**
     * numSerie
     */
    @Column(name = "num_serie", nullable = false, length = 17)
    private String numSerie;

    /**
     * marca
     */
    @Column(name = "marca", nullable = false, length = 50)
    private String marca;

    /**
     * linea
     */
    @Column(name = "linea", nullable = false, length = 50)
    private String linea;

    /**
     * color
     */
    @Column(name = "color", nullable = false, length = 50)
    private String color;

    /**
     * modelo
     */
    @Column(name = "modelo", nullable = false)
    private int modelo;

    /**
     * Constructor de la clase Vehiculo.
     * @param numSerie Número de serie del vehículo.
     * @param marca Marca del vehículo.
     * @param linea Línea del vehículo.
     * @param color Color del vehículo.
     * @param modelo Modelo del vehículo.
     */
    public Vehiculo(String numSerie, String marca, String linea, String color, int modelo) {
        this.numSerie = numSerie;
        this.marca = marca;
        this.linea = linea;
        this.color = color;
        this.modelo = modelo;
    }

    /**
     * Constructor por omisión de la clase Vehiculo.
     */
    public Vehiculo() {
    }

    /**
     * Obtiene el ID del vehículo.
     * @return El ID del vehículo.
     */
    public Long getId() {
        return id;
    }

    /**
     * Establece el ID del vehículo.
     * @param id El ID del vehículo.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Obtiene el número de serie del vehículo.
     * @return El número de serie del vehículo.
     */
    public String getNumSerie() {
        return numSerie;
    }

    /**
     * Establece el número de serie del vehículo.
     * @param numSerie El número de serie del vehículo.
     */
    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    /**
     * Obtiene la marca del vehículo.
     * @return La marca del vehículo.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece la marca del vehículo.
     * @param marca La marca del vehículo.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Obtiene la línea del vehículo.
     * @return La línea del vehículo.
     */
    public String getLinea() {
        return linea;
    }

    /**
     * Establece la línea del vehículo.
     * @param linea La línea del vehículo.
     */
    public void setLinea(String linea) {
        this.linea = linea;
    }

    /**
     * Obtiene el color del vehículo.
     * @return El color del vehículo.
     */
    public String getColor() {
        return color;
    }

    /**
     * Establece el color del vehículo.
     * @param color El color del vehículo.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Obtiene el modelo del vehículo.
     * @return El modelo del vehículo.
     */
    public int getModelo() {
        return modelo;
    }

    /**
     * Establece el modelo del vehículo.
     * @param modelo El modelo del vehículo.
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
}
