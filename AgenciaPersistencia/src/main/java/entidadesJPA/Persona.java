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
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Clase que representa la entidad de Persona en la base de datos.
 * Contiene información sobre las personas registradas en el sistema.
 * @author Carlos Sanchez
 */
@Entity
@Table(name = "personas")
public class Persona implements Serializable {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    /**
     * id
     */
    @Column(name = "rfc", nullable=false, length=13)
    private String rfc;
    
    /**
     * id
     */
    @Column(name = "nombre", length=50)
    private String nombre;
    
    /**
     * id
     */
    @Column(name = "apellido_paterno", length=50, nullable=false)
    private String apellidoPaterno;
    
    /**
     * id
     */
    @Column(name = "apellid_materno", length=50)
    private String apellidoMaterno;
    
    /**
     * id
     */
    @Column(name = "telefono", length=10, nullable=false)
    private String telefono;
    
    /**
     * id
     */
    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Calendar fechaNacimiento;
    
    /**
     * id
     */
    @Column(name="discapacidad")
    private boolean discapacidad;

    /**
     * id
     */
    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL)
    private List<Automovil> automoviles;

    /**
     * id
     */
    @OneToMany(mappedBy = "persona", cascade = CascadeType.PERSIST)
    private List<Tramite> tramites;
    
    /**
     * Constructor de la clase Persona.
     * @param rfc RFC de la persona.
     * @param nombre Nombre de la persona.
     * @param apellidoPaterno Apellido paterno de la persona.
     * @param apellidoMaterno Apellido materno de la persona.
     * @param telefono Teléfono de la persona.
     * @param fechaNacimiento Fecha de nacimiento de la persona.
     * @param discapacidad Indica si la persona tiene alguna discapacidad.
     */
    public Persona(String rfc, String nombre, String apellidoPaterno, String apellidoMaterno, String telefono, Calendar fechaNacimiento, boolean discapacidad) {
        this.rfc = rfc;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.discapacidad = discapacidad;
    }

    /**
     * Constructor por defecto de la clase Persona.
     */
    public Persona() {
    }

    /**
     * Obtiene el ID de la persona.
     * @return El ID de la persona.
     */
    public Long getId() {
        return id;
    }

    /**
     * Establece el ID de la persona.
     * @param id El ID de la persona.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Obtiene el RFC de la persona.
     * @return El RFC de la persona.
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Establece el RFC de la persona.
     * @param rfc El RFC de la persona.
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * Obtiene el nombre de la persona.
     * @return El nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la persona.
     * @param nombre El nombre de la persona.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido paterno de la persona.
     * @return El apellido paterno de la persona.
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * Establece el apellido paterno de la persona.
     * @param apellidoPaterno El apellido paterno de la persona.
     */
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    /**
     * Obtiene el apellido materno de la persona.
     * @return El apellido materno de la persona.
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    /**
     * Establece el apellido materno de la persona.
     * @param apellidoMaterno El apellido materno de la persona.
     */
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    /**
     * Obtiene el teléfono de la persona.
     * @return El teléfono de la persona.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el teléfono de la persona.
     * @param telefono El teléfono de la persona.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene la fecha de nacimiento de la persona.
     * @return La fecha de nacimiento de la persona.
     */
    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Establece la fecha de nacimiento de la persona.
     * @param fechaNacimiento La fecha de nacimiento de la persona.
     */
    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Verifica si la persona tiene discapacidad.
     * @return true si la persona tiene discapacidad, false de lo contrario.
     */
    public boolean isDiscapacidad() {
        return discapacidad;
    }

    /**
     * Establece si la persona tiene discapacidad.
     * @param discapacidad true si la persona tiene discapacidad, false de lo contrario.
     */
    public void setDiscapacidad(boolean discapacidad) {
        this.discapacidad = discapacidad;
    }

    /**
     * Obtiene la lista de automóviles asociados a la persona.
     * @return La lista de automóviles asociados a la persona.
     */
    public List<Automovil> getAutomoviles() {
        return automoviles;
    }

    /**
     * Establece la lista de automóviles asociados a la persona.
     * @param automoviles La lista de automóviles asociados a la persona.
     */
    public void setAutomoviles(List<Automovil> automoviles) {
        this.automoviles = automoviles;
    }

    /**
     * Obtiene la lista de trámites asociados a la persona.
     * @return La lista de trámites asociados a la persona.
     */
    public List<Tramite> getTramites() {
        return tramites;
    }

    /**
     * Establece la lista de trámites asociados a la persona.
     * @param tramites La lista de trámites asociados a la persona.
     */
    public void setTramites(List<Tramite> tramites) {
        this.tramites = tramites;
    }

    /**
     * Retorna una representación en cadena de la persona.
     * @return Una cadena que representa la persona.
     */
    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", rfc=" + rfc + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", telefono=" + telefono + ", fechaNacimiento=" + fechaNacimiento + ", discapacidad=" + discapacidad + ", automoviles=" + automoviles + ", tramites=" + tramites + '}';
    }

}
