/*
 * Clase Conexion 
 */
package conexion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Esta clase proporciona métodos para establecer una conexión con la base de datos utilizando JPA.
 * Implementa la interfaz IConexionDAO.
 * 
 * @author Carlos Sanchez
 */
public class ConexionDAO implements IConexionDAO {
    
    /**
     * Constructor por defecto de la clase ConexionDAO.
     */
    public ConexionDAO() {
    }
    
    /**
     * Crea y devuelve una instancia de EntityManager para interactuar con la base de datos.
     * @return una instancia de EntityManager
     */
    @Override
    public EntityManager crearConexion() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ConexionPU");
        EntityManager em = emf.createEntityManager();
        return em;
    }
}
