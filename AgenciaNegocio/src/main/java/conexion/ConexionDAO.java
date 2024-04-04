/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Clase que implementa la interfaz IConexionDAO y proporciona métodos para establecer una conexión con la base de datos.
 * @author Carlos Sanchez
 */
public class ConexionDAO implements IConexionDAO {
    
    /**
     * Método para crear una conexión con la base de datos.
     * @return EntityManager que representa la conexión con la base de datos.
     */
    @Override
    public EntityManager crearConexion() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ConexionPU");
        EntityManager em = emf.createEntityManager();
        return em;
    }
}
