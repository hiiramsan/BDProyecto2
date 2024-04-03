/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package conexion;

import javax.persistence.EntityManager;

/**
 * Esta interfaz define el contrato para las clases que proporcionan métodos de conexión con la base de datos utilizando JPA.
 * @author carlo
 */
public interface IConexionDAO {
    /**
      * Crea y devuelve una instancia de EntityManager para interactuar con la base de datos.
      * 
      * @return una instancia de EntityManager
      */
     public EntityManager crearConexion();
}
