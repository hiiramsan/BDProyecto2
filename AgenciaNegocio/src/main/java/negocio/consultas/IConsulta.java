/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio.consultas;

import entidadesJPA.Persona;
import entidadesJPA.Placa;
import entidadesJPA.Tramite;
import java.util.Date;
import java.util.List;

/**
 *
 * @author carlo
 */
public interface IConsulta {
    public List<Persona> buscarPersonaPorRFC(String rfc);
    public List<Persona> buscarPersonaPorNombreSimilar(String nombre);
    public List<Persona> buscarPersonaPorFechaNacimiento(Date fechaNacimiento);
    public List<?> consultarTramites(String rfc, String consulta);
    public List<Tramite> obtenerTramites(String rfc);
    public List<Placa> obtenerPlacasPorFechaYNombre(Date fechaInicio, Date fechaFin, String nombre);
}
