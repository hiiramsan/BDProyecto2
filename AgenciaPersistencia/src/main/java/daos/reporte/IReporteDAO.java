/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos.reporte;

import entidadesJPA.Licencia;
import entidadesJPA.Placa;
import entidadesJPA.Tramite;
import java.util.Date;
import java.util.List;

/**
 * Interfaz que define los métodos para buscar tramites, licencias y placas.
 * @author Carlos Sanchez
 */
public interface IReporteDAO {

    /**
     * Método para buscar tramites en base a ciertos criterios.
     * @param fechaInicio Fecha de inicio para la búsqueda.
     * @param fechaFin Fecha de fin para la búsqueda.
     * @param nombre Nombre de la persona asociada al trámite (opcional).
     * @return Lista de tramites que cumplen con los criterios de búsqueda.
     */
    public List<Tramite> buscarTramites(Date fechaInicio, Date fechaFin, String nombre);

    /**
     * Método para buscar licencias en base a ciertos criterios.
     * @param fechaInicio Fecha de inicio para la búsqueda.
     * @param fechaFin Fecha de fin para la búsqueda.
     * @param nombre Nombre de la persona asociada a la licencia (opcional).
     * @return Lista de licencias que cumplen con los criterios de búsqueda.
     */
    public List<Licencia> buscarLicencias(Date fechaInicio, Date fechaFin, String nombre);

    /**
     * Método para buscar placas en base a ciertos criterios.
     * @param fechaInicio Fecha de inicio para la búsqueda.
     * @param fechaFin Fecha de fin para la búsqueda.
     * @param nombre Nombre de la persona asociada a la placa (opcional).
     * @return Lista de placas que cumplen con los criterios de búsqueda.
     */
    public List<Placa> buscarPlacas(Date fechaInicio, Date fechaFin, String nombre);

}
