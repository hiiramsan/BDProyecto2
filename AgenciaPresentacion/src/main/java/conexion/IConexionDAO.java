/**
 * Interfaz que define un método para crear una conexión a una base de datos utilizando JPA (Java Persistence API).
 */
package conexion;

import javax.persistence.EntityManager;

/**
 * Interfaz que define el método para crear una conexión con la base de datos.
 * @author Carlos Sanchez
 */
public interface IConexionDAO {
    
    /**
     * Método para crear y retornar una conexión EntityManager a la base de datos.
     * @return EntityManager para interactuar con la base de datos.
     */
    public EntityManager crearConexion();
}
