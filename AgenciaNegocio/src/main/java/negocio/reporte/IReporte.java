/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio.reporte;

import entidadesJPA.Licencia;
import entidadesJPA.Placa;
import entidadesJPA.Tramite;
import java.util.Date;
import java.util.List;

/**
 *
 * @author carlo
 */
public interface IReporte {
    public List<Tramite> obtenerReportePorNombre(String nombre);
    
    public List<Tramite> obtenerReportePorFechas(Date inicio, Date fin);
    
     public List<Placa> obtenerTodasLasPlacas();
     
     public List<Licencia> obtenerTodasLasLicencias();
     
     public List<Tramite> obtenerTodosLosTramites();
     
     public void generarReportePlacas(List<Placa> placas);
     
     public void generarReporteLicencias(List<Licencia> licencias);
     
     public void generarReporteTramites(List<Tramite> tramites);
     
     public List<Tramite> buscarTramites(Date fechaInicio, Date fechaFin, String nombre);
     
     public List<Licencia> buscarLicencias(Date fechaInicio, Date fechaFin, String nombre);
     
     public List<Placa> buscarPlacas(Date fechaInicio, Date fechaFin, String nombre);
}
