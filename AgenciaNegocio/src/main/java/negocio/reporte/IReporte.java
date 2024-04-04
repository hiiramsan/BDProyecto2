/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio.reporte;

import dtos.LicenciaDTO;
import dtos.PlacaDTO;
import dtos.TramiteDTO;
import java.util.Date;
import java.util.List;

/**
 * Interfaz para definir métodos relacionados con la generación y búsqueda de reportes.
 * @author Carlos sanchez
 */
public interface IReporte {
    
    /**
     * Genera un reporte de placas.
     * @param placas Lista de objetos PlacaDTO.
     */
    public void generarReportePlacas(List<PlacaDTO> placas);
    
    /**
     * Genera un reporte de licencias.
     * @param licencias Lista de objetos LicenciaDTO.
     */
    public void generarReporteLicencias(List<LicenciaDTO> licencias);
    
    /**
     * Genera un reporte de trámites.
     * @param tramites Lista de objetos TramiteDTO.
     */
    public void generarReporteTramites(List<TramiteDTO> tramites);
    
    /**
     * Busca trámites en un rango de fechas y por nombre.
     * @param fechaInicio Fecha de inicio del rango de búsqueda.
     * @param fechaFin Fecha de fin del rango de búsqueda.
     * @param nombre Nombre relacionado con los trámites a buscar.
     * @return Lista de objetos TramiteDTO que coinciden con los criterios de búsqueda.
     */
    public List<TramiteDTO> buscarTramites(Date fechaInicio, Date fechaFin, String nombre);
    
    /**
     * Busca licencias en un rango de fechas y por nombre.
     * @param fechaInicio Fecha de inicio del rango de búsqueda.
     * @param fechaFin Fecha de fin del rango de búsqueda.
     * @param nombre Nombre relacionado con las licencias a buscar.
     * @return Lista de objetos LicenciaDTO que coinciden con los criterios de búsqueda.
     */
    public List<LicenciaDTO> buscarLicencias(Date fechaInicio, Date fechaFin, String nombre);
    
    /**
     * Busca placas en un rango de fechas y por nombre.
     * @param fechaInicio Fecha de inicio del rango de búsqueda.
     * @param fechaFin Fecha de fin del rango de búsqueda.
     * @param nombre Nombre relacionado con las placas a buscar.
     * @return Lista de objetos PlacaDTO que coinciden con los criterios de búsqueda.
     */
    public List<PlacaDTO> buscarPlacas(Date fechaInicio, Date fechaFin, String nombre);
}
