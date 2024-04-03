/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio.consultas;

import dtos.PersonaDTO;
import dtos.PlacaDTO;
import dtos.TramiteDTO;
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
    public List<PersonaDTO> buscarPersonaPorRFC(String rfc);
    public List<PersonaDTO> buscarPersonaPorNombreSimilar(String nombre);
    public List<PersonaDTO> buscarPersonaPorFechaNacimiento(Date fechaNacimiento);
    public List<?> consultarTramites(String rfc, String consulta);
    public List<TramiteDTO> obtenerTramites(String rfc);
    public List<PlacaDTO> obtenerPlacasPorFechaYNombre(Date fechaInicio, Date fechaFin, String nombre);
}
