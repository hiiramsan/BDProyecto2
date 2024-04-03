/*
 * Esta interfaz define los métodos que deben ser implementados por las clases que interactúan con la entidad Persona en la base de datos.
 */

package daos.persona;

import dtos.PersonaDTO;
import entidadesJPA.Persona;

/**
 * Interfaz que define los métodos que deben ser implementados por las clases que interactúan con la entidad Persona en la base de datos.
 * @author Carlos sanchez
 */
public interface IPersonaDAO {
    /**
     * Registra una nueva persona en la base de datos.
     * @param persona Objeto PersonaDTO que representa los datos de la persona a registrar.
     */
    public void registrar(PersonaDTO persona);
    
    /**
     * Consulta si existe una persona con el RFC especificado en la base de datos.
     * @param rfc El RFC de la persona a consultar.
     * @return true si la persona existe en la base de datos, false en caso contrario.
     */
    public boolean consultarPersona(String rfc);
    
    /**
     * Obtiene los datos de la persona con el RFC especificado.
     * @param rfc El RFC de la persona a obtener.
     * @return Objeto PersonaDTO con los datos de la persona encontrada, o null si no se encontró ninguna persona con el RFC especificado.
     */
    public PersonaDTO obtenerPersona(String rfc);
    
    /**
     * Busca y devuelve la persona con el RFC especificado.
     * @param rfc El RFC de la persona a buscar.
     * @return Objeto Persona correspondiente al RFC especificado, o null si no se encontró ninguna persona con ese RFC.
     */
    public Persona buscarPersonaPorRFC(String rfc);
    
    /**
     * Verifica si la persona con el RFC especificado es mayor de edad.
     * @param rfc El RFC de la persona a verificar.
     * @return true si la persona es mayor de edad, false en caso contrario o si no se encontró ninguna persona con el RFC especificado.
     */
    public boolean esMayorDeEdad(String rfc);
}
