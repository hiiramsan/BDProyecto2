/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio.consultas;

import dtos.PersonaDTO;
import dtos.PlacaDTO;
import dtos.TramiteDTO;
import java.util.Date;
import java.util.List;

/**
 * La interfaz IConsulta define métodos para realizar consultas relacionadas con personas y trámites.
 * Implementa esta interfaz para proporcionar funcionalidades para buscar personas por RFC, nombre o fecha de nacimiento,
 * consultar trámites por RFC y tipo, y obtener placas por fecha y nombre.
 * 
 * @author Carlos Sanchez
 */
public interface IConsulta {
    
    /**
     * Busca personas por su RFC.
     * 
     * @param rfc El RFC de la persona a buscar.
     * @return Una lista de objetos PersonaDTO que coinciden con el RFC especificado.
     */
    public List<PersonaDTO> buscarPersonaPorRFC(String rfc);
    
    /**
     * Busca personas cuyo nombre sea similar al proporcionado.
     * 
     * @param nombre El nombre o parte del nombre de la persona a buscar.
     * @return Una lista de objetos PersonaDTO cuyos nombres son similares al proporcionado.
     */
    public List<PersonaDTO> buscarPersonaPorNombreSimilar(String nombre);
    
    /**
     * Busca personas por su fecha de nacimiento.
     * 
     * @param fechaNacimiento La fecha de nacimiento de la persona a buscar.
     * @return Una lista de objetos PersonaDTO que coinciden con la fecha de nacimiento especificada.
     */
    public List<PersonaDTO> buscarPersonaPorFechaNacimiento(Date fechaNacimiento);
    
    /**
     * Consulta trámites realizados por una persona específica.
     * 
     * @param rfc El RFC de la persona para la cual se realizará la consulta.
     * @param consulta El tipo de trámite a consultar ("Todos", "Licencias" o "Placas").
     * @return Una lista de objetos que representan los trámites consultados.
     */
    public List<?> consultarTramites(String rfc, String consulta);
    
    /**
     * Obtiene los trámites realizados por una persona.
     * 
     * @param rfc El RFC de la persona para la cual se obtendrán los trámites.
     * @return Una lista de objetos TramiteDTO que representan los trámites realizados por la persona.
     */
    public List<TramiteDTO> obtenerTramites(String rfc);
    
    /**
     * Obtiene las placas registradas en un rango de fechas y asociadas a un nombre específico.
     * 
     * @param fechaInicio La fecha de inicio del rango.
     * @param fechaFin La fecha de fin del rango.
     * @param nombre El nombre o parte del nombre asociado a las placas.
     * @return Una lista de objetos PlacaDTO que representan las placas obtenidas.
     */
    public List<PlacaDTO> obtenerPlacasPorFechaYNombre(Date fechaInicio, Date fechaFin, String nombre);
}
