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
 *
 * @author carlos
 */
@Entity
@Table(name = "personas")
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "rfc", nullable=false)
    private String rfc;
    
    @Column(name = "nombre", length=50)
    private String nombre;
    
    @Column(name = "apellido_paterno", length=50, nullable=false)
    private String apellidoPaterno;
    
    @Column(name = "apellid_materno", length=50)
    private String apellidoMaterno;
    
    @Column(name = "telefono", length=10, nullable=false)
    private String telefono;
    
    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Calendar fechaNacimiento;
    
    @Column(name="discapacidad")
    private boolean discapacidad;

    @OneToMany(mappedBy = "persona", cascade = CascadeType.PERSIST)
    private List<Automovil> videojuegos;
    
    
}
