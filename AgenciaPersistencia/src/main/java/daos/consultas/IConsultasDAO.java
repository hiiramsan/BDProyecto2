/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos.consultas;

import entidadesJPA.Licencia;
import entidadesJPA.Persona;
import entidadesJPA.Placa;
import entidadesJPA.Tramite;
import java.util.Date;
import java.util.List;

/**
 *
 * @author carlo
 */
public interface IConsultasDAO {
    public List<Persona> buscarPersonaPorRFC(String rfc);
    public List<Persona> buscarPersonaPorNombreSimilar(String nombre);
    public List<Persona> buscarPersonaPorFechaNacimiento(Date fechaNacimiento);
    public List<Licencia> obtenerLicenciasPorRFC(String rfc);
    public List<Placa> obtenerPlacasPorRFC(String rfc);
    public List<Tramite> obtenerTramitesPorRFC(String rfc);
    public List<Object[]> obtenerReporteTramites();
    public List<Placa> obtenerPlacasPorFechaYNombre(Date fechaInicio, Date fechaFin, String nombre);
    public List<Licencia> obtenerLicenciasPorFechaYNombre(Date fechaInicio, Date fechaFin, String nombre);
}
