/*
 * Esta interfaz define los métodos que deben ser implementados por las clases que actúan como DAO para realizar consultas relacionadas con entidades como Persona, Licencia, Placa y Tramite en la base de datos.
 */

package daos.consultas;

import entidadesJPA.Licencia;
import entidadesJPA.Persona;
import entidadesJPA.Placa;
import entidadesJPA.Tramite;
import java.util.Date;
import java.util.List;

/**
 * Interfaz que define los métodos para realizar consultas en la base de datos relacionadas con entidades como 
 * Persona, Licencia, Placa y Tramite.
 * @author Carlos Sanchez
 */
public interface IConsultasDAO {

    /**
     * Busca personas en la base de datos por su RFC.
     * @param rfc RFC de la persona a buscar.
     * @return Lista de personas encontradas con el RFC especificado.
     */
    public List<Persona> buscarPersonaPorRFC(String rfc);

    /**
     * Busca personas en la base de datos cuyo nombre sea similar al proporcionado.
     * @param nombre Nombre o parte del nombre de la persona a buscar.
     * @return Lista de personas cuyos nombres son similares al proporcionado.
     */
    public List<Persona> buscarPersonaPorNombreSimilar(String nombre);

    /**
     * Busca personas en la base de datos por su fecha de nacimiento.
     * @param fechaNacimiento Fecha de nacimiento de la persona a buscar.
     * @return Lista de personas encontradas con la fecha de nacimiento especificada.
     */
    public List<Persona> buscarPersonaPorFechaNacimiento(Date fechaNacimiento);

    /**
     * Obtiene las licencias asociadas a una persona en la base de datos por su RFC.
     * @param rfc RFC de la persona cuyas licencias se desean obtener.
     * @return Lista de licencias asociadas a la persona con el RFC especificado.
     */
    public List<Licencia> obtenerLicenciasPorRFC(String rfc);

    /**
     * Obtiene las placas asociadas a una persona en la base de datos por su RFC.
     * @param rfc RFC de la persona cuyas placas se desean obtener.
     * @return Lista de placas asociadas a la persona con el RFC especificado.
     */
    public List<Placa> obtenerPlacasPorRFC(String rfc);

    /**
     * Obtiene los trámites asociados a una persona en la base de datos por su RFC.
     * @param rfc RFC de la persona cuyos trámites se desean obtener.
     * @return Lista de trámites asociados a la persona con el RFC especificado.
     */
    public List<Tramite> obtenerTramitesPorRFC(String rfc);

    /**
     * Obtiene un reporte de trámites realizado por personas en la base de datos.
     * @return Lista de objetos que representan los trámites realizados, cada objeto contiene información como fecha, tipo de trámite, nombre de la persona y costo.
     */
    public List<Object[]> obtenerReporteTramites();

    /**
     * Obtiene las placas asociadas a una persona en la base de datos por un rango de fechas y un nombre similar.
     * @param fechaInicio Fecha de inicio del rango de fechas.
     * @param fechaFin Fecha de fin del rango de fechas.
     * @param nombre Nombre o parte del nombre de la persona cuyas placas se desean obtener.
     * @return Lista de placas asociadas a la persona cuyo nombre sea similar al proporcionado y cuya fecha de expedición esté dentro del rango especificado.
     */
    public List<Placa> obtenerPlacasPorFechaYNombre(Date fechaInicio, Date fechaFin, String nombre);

    /**
     * Obtiene las licencias asociadas a una persona en la base de datos por un rango de fechas y un nombre similar.
     * @param fechaInicio Fecha de inicio del rango de fechas.
     * @param fechaFin Fecha de fin del rango de fechas.
     * @param nombre Nombre o parte del nombre de la persona cuyas licencias se desean obtener.
     * @return Lista de licencias asociadas a la persona cuyo nombre sea similar al proporcionado y cuya fecha de expedición esté dentro del rango especificado.
     */
    public List<Licencia> obtenerLicenciasPorFechaYNombre(Date fechaInicio, Date fechaFin, String nombre);
}
