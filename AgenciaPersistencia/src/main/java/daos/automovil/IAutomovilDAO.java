/*
 * Esta interfaz define los métodos que deben ser implementados por las clases que actúan como DAO para la entidad Automovil.
 */

package daos.automovil;

import dtos.AutomovilDTO;
import entidadesJPA.Automovil;
import entidadesJPA.Persona;

/**
 * Interfaz que define los métodos para interactuar con la entidad Automovil en la base de datos.
 * @author Carlos Sanchez
 */
public interface IAutomovilDAO {

    /**
     * Registra un nuevo automóvil en la base de datos.
     * @param numeroSerie Número de serie del automóvil.
     * @param marca Marca del automóvil.
     * @param linea Línea del automóvil.
     * @param color Color del automóvil.
     * @param modelo Modelo del automóvil.
     * @param persona Persona dueña del automóvil.
     * @return Objeto AutomovilDTO que representa el automóvil registrado.
     */
    public AutomovilDTO registrarAutomovil(String numeroSerie, String marca, String linea, String color, int modelo, Persona persona);

    /**
     * Verifica si un automóvil con el número de serie especificado existe en la base de datos.
     * @param numeroSerie Número de serie del automóvil a verificar.
     * @return true si el automóvil existe, false en caso contrario.
     */
    public boolean existeAutomovil(String numeroSerie);

    /**
     * Obtiene los detalles de un automóvil con el número de serie especificado y el RFC de la persona dueña.
     * @param numeroSerie Número de serie del automóvil a obtener.
     * @param rfc RFC de la persona dueña del automóvil.
     * @return Objeto AutomovilDTO que representa el automóvil obtenido, o null si no se encuentra.
     */
    public AutomovilDTO obtenerAutomovil(String numeroSerie, String rfc);

    /**
     * Obtiene un automóvil por su número de serie.
     * @param numSerie Número de serie del automóvil a obtener.
     * @return Objeto Automovil que representa el automóvil obtenido, o null si no se encuentra.
     */
    public Automovil obtenerAutomovilPorNumeroSerie(String numSerie);
    
    /**
     * Obtiene un automóvil por su placa y el RFC de la persona dueña.
     * @param claveNumerica Clave numérica de la placa del automóvil a obtener.
     * @param rfc RFC de la persona dueña del automóvil.
     * @return Objeto AutomovilDTO que representa el automóvil obtenido, o null si no se encuentra.
     */
    public AutomovilDTO obtenerAutoPorPlacas(String claveNumerica, String rfc);
}
