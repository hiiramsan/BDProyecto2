/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio.consultas;

import conexion.ConexionDAO;
import conexion.IConexionDAO;
import daos.consultas.ConsultasDAO;
import daos.consultas.IConsultasDAO;
import dtos.PersonaDTO;
import dtos.PlacaDTO;
import dtos.TramiteDTO;
import encriptador.Encriptador;
import entidadesJPA.Persona;
import entidadesJPA.Placa;
import entidadesJPA.Tramite;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * La clase ConsultaBO implementa la interfaz IConsulta y proporciona métodos para realizar consultas relacionadas con personas y trámites.
 * 
 * @author Carlos Sanchez
 */
public class ConsultaBO implements IConsulta {

    IConexionDAO conexionDAO = new ConexionDAO();
    IConsultasDAO consultaDAO = new ConsultasDAO(conexionDAO);

    /**
     * Constructor de la clase ConsultaBO.
     * @param conexionDAO El objeto de conexión a la base de datos.
     */
    public ConsultaBO(IConexionDAO conexionDAO) {
        this.conexionDAO = conexionDAO;
    }

    /**
     * Transforma una entidad Persona en un objeto PersonaDTO.
     * @param persona La entidad Persona a transformar.
     * @return El objeto PersonaDTO resultante.
     */
    public PersonaDTO transformarDTO(Persona persona) {
        PersonaDTO personaDto = new PersonaDTO();
        personaDto.setRfc(persona.getRfc());
        personaDto.setNombre(persona.getNombre());
        personaDto.setApellidoPaterno(persona.getApellidoPaterno());
        personaDto.setApellidoMaterno(persona.getApellidoMaterno());
        personaDto.setFechaNacimiento(persona.getFechaNacimiento());
        personaDto.setTelefono(Encriptador.desencriptar(persona.getTelefono()));

        return personaDto;
    }

    @Override
    public List<PersonaDTO> buscarPersonaPorRFC(String rfc) {
        List<Persona> personas = this.consultaDAO.buscarPersonaPorRFC(rfc);
        List<PersonaDTO> personasDTO = new ArrayList<>();
        for (Persona persona : personas) {
            PersonaDTO personaDto = transformarDTO(persona);
            personasDTO.add(personaDto);
        }
        return personasDTO;
    }

    @Override
    public List<PersonaDTO> buscarPersonaPorNombreSimilar(String nombre) {
        List<Persona> personas = this.consultaDAO.buscarPersonaPorNombreSimilar(nombre);
        List<PersonaDTO> personasDTO = new ArrayList<>();
        for (Persona persona : personas) {
            PersonaDTO personaDto = transformarDTO(persona);
            personasDTO.add(personaDto);
        }
        return personasDTO;
    }

    @Override
    public List<PersonaDTO> buscarPersonaPorFechaNacimiento(Date fechaNacimiento) {
        List<Persona> personas = this.consultaDAO.buscarPersonaPorFechaNacimiento(fechaNacimiento);
        List<PersonaDTO> personasDTO = new ArrayList<>();
        for (Persona persona : personas) {
            PersonaDTO personaDto = transformarDTO(persona);
            personasDTO.add(personaDto);
        }
        return personasDTO;
    }

    @Override
    public List<?> consultarTramites(String rfc, String consulta) {
        switch (consulta) {
            case "Todos":
                return consultaDAO.obtenerTramitesPorRFC(rfc);
            case "Licencias":
                return consultaDAO.obtenerLicenciasPorRFC(rfc);
            case "Placas":
                return consultaDAO.obtenerPlacasPorRFC(rfc);
            default:
                throw new IllegalArgumentException("Consulta no válida");
        }
    }

    @Override
    public List<TramiteDTO> obtenerTramites(String rfc) {
        List<Tramite> tramites = this.consultaDAO.obtenerTramitesPorRFC(rfc);
        List<TramiteDTO> tramitesDTO = new ArrayList<>();
        for(Tramite tramite : tramites) {
            TramiteDTO tramiteDTO = new TramiteDTO();
            tramiteDTO.setCosto(tramite.getCosto());
            tramiteDTO.setFechaExpedicion(tramite.getFechaExpedicion().getTime());
            String nombrePersona = tramite.getPersona().getNombre()  + " " + tramite.getPersona().getApellidoPaterno();
            tramiteDTO.setNombrePersona(nombrePersona);
            tramiteDTO.setEstado(tramite.getEstado());
            tramitesDTO.add(tramiteDTO);
        }
        return tramitesDTO; 
    }

    @Override
    public List<PlacaDTO> obtenerPlacasPorFechaYNombre(Date fechaInicio, Date fechaFin, String nombre) {
        List<Placa> placas= this.consultaDAO.obtenerPlacasPorFechaYNombre(fechaInicio, fechaFin, nombre);
        List<PlacaDTO> placasDTO = new ArrayList<>();
        for(Placa placa : placas) {
            PlacaDTO placaDTO = new PlacaDTO();
            placaDTO.setFechaExpedicion(placa.getFechaExpedicion());
            placaDTO.setCosto(placa.getCosto());
            placaDTO.setClaveNumerica(placa.getNumeroAlfanumerico());
            placaDTO.setEstado(placa.getEstado());
            String nombrePersona = placa.getPersona().getNombre() + " " + placa.getPersona().getApellidoPaterno();
            placaDTO.setNombrePersona(nombrePersona);
            placasDTO.add(placaDTO);
        }
        return placasDTO;
    }
}
