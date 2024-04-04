/**
 * Clase que implementa la interfaz IConexionDAO para establecer una conexión a una base de datos utilizando JPA.
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
     * Método para crear y retornar una conexión EntityManager a la base de datos.
     * @return EntityManager para interactuar con la base de datos.
     */
    @Override
    public EntityManager crearConexion() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ConexionPU"); // Crea una fábrica de EntityManager utilizando la unidad de persistencia "ConexionPU"
        EntityManager em = emf.createEntityManager(); // Crea y devuelve un EntityManager a partir de la fábrica
        return em; // Retorna el EntityManager para interactuar con la base de datos
    }
}
