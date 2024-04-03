/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Esta clase proporciona métodos para establecer una conexión con la base de datos utilizando JPA.
 * Implementa la interfaz IConexionDAO.
 * @author carlo
 */
public class ConexionDAO implements IConexionDAO {
    
    /**
     * Crea y devuelve una instancia de EntityManager para interactuar con la base de datos.
     * 
     * @return una instancia de EntityManager
     */
    @Override
    public EntityManager crearConexion() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ConexionPU");
        EntityManager em = emf.createEntityManager();
        return em;
    }
}
