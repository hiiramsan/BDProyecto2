/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio.reporte;

import dtos.LicenciaDTO;
import dtos.PlacaDTO;
import dtos.TramiteDTO;
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
     
     public void generarReportePlacas(List<PlacaDTO> placas);
     
     public void generarReporteLicencias(List<LicenciaDTO> licencias);
     
     public void generarReporteTramites(List<TramiteDTO> tramites);
     
     public List<TramiteDTO> buscarTramites(Date fechaInicio, Date fechaFin, String nombre);
     
     public List<LicenciaDTO> buscarLicencias(Date fechaInicio, Date fechaFin, String nombre);
     
     public List<PlacaDTO> buscarPlacas(Date fechaInicio, Date fechaFin, String nombre);
}
