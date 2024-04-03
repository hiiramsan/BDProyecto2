/*
 * Esta interfaz define los métodos que deben ser implementados por las clases que actúan como DAO para la entidad Licencia en la base de datos.
 */

package daos.licencia;

import dtos.LicenciaDTO;
import dtos.PersonaDTO;
import entidadesJPA.Persona;

/**
 * Interfaz que define los métodos para interactuar con la entidad Licencia en la base de datos.
 * @author Carlos Sanchez
 */
public interface ILicenciaDAO {

    /**
     * Consulta si una persona tiene una licencia registrada en la base de datos.
     * @param persona Persona para la cual se desea consultar la licencia.
     * @return true si la persona tiene una licencia registrada, false en caso contrario.
     */
    public boolean consultarLicencia(Persona persona);
    
    /**
     * Registra una nueva licencia para una persona en la base de datos.
     * @param persona Persona a la cual se desea registrar la licencia.
     * @param vigencia Periodo de vigencia de la licencia en años.
     * @param costo Costo de la licencia.
     * @return Objeto LicenciaDTO que representa la licencia registrada.
     */
    public LicenciaDTO registrarLicencia(Persona persona, int vigencia, float costo);
    
    /**
     * Verifica si una persona tiene una licencia activa en la base de datos.
     * @param persona Persona para la cual se desea verificar la licencia activa.
     * @return true si la persona tiene una licencia activa, false en caso contrario.
     */
    public boolean tieneLicenciaActiva(Persona persona);
}
