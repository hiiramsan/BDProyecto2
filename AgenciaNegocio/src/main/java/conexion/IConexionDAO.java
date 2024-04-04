/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package conexion;

import javax.persistence.EntityManager;

/**
 * Interfaz que define el método para crear una conexión con la base de datos.
 * @author Carlos Sanchez
 */
public interface IConexionDAO {
    
    /**
     * Método para crear una conexión con la base de datos.
     * @return EntityManager que representa la conexión con la base de datos.
     */
    public EntityManager crearConexion();
}
