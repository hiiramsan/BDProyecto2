/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio.consultas;

import conexion.ConexionDAO;
import conexion.IConexionDAO;
import daos.consultas.ConsultasDAO;
import daos.consultas.IConsultasDAO;
import entidadesJPA.Persona;
import entidadesJPA.Tramite;
import java.util.Date;
import java.util.List;

/**
 *
 * @author carlo
 */
public class ConsultaBO implements IConsulta {
    IConexionDAO conexionDAO = new ConexionDAO();
    IConsultasDAO consultaDAO = new ConsultasDAO(conexionDAO);
    
    public ConsultaBO(IConexionDAO conexionDAO) {
        this.conexionDAO = conexionDAO;
    }
    
    @Override
    public List<Persona> buscarPersonaPorRFC(String rfc) {
        return this.consultaDAO.buscarPersonaPorRFC(rfc);
    }
    
    @Override
    public List<Persona> buscarPersonaPorNombreSimilar(String nombre) {
        return this.consultaDAO.buscarPersonaPorNombreSimilar(nombre);
    }
    
    @Override
    public List<Persona> buscarPersonaPorFechaNacimiento(Date fechaNacimiento) {
        return this.consultaDAO.buscarPersonaPorFechaNacimiento(fechaNacimiento);
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
                throw new IllegalArgumentException("Consulta no valida");
        }
    }
   
    @Override
   public List<Tramite> obtenerTramites(String rfc) {
       return this.consultaDAO.obtenerTramitesPorRFC(rfc);
   }
}
