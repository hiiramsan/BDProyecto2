/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio.persona;

import negocio.persona.IPersona;
import conexion.ConexionDAO;
import conexion.IConexionDAO;
import daos.licencia.ILicenciaDAO;
import daos.licencia.LicenciaDAO;
import daos.persona.IPersonaDAO;
import daos.persona.PersonaDAO;
import dtos.PersonaDTO;
import excepciones.PersonaExistenteException;
import java.util.logging.Logger;

/**
 *
 * @author carlo
 */
public class PersonaBO implements IPersona {
    
    IConexionDAO conexionDAO = new ConexionDAO();
    IPersonaDAO personaDAO = new PersonaDAO(conexionDAO);
    private static final Logger LOG = Logger.getLogger(PersonaBO.class.getName());

    
    public PersonaBO(IConexionDAO conexion) {
        this.conexionDAO = conexionDAO;
    }
    
    
    
    @Override
    public void registrarPersona(PersonaDTO persona) throws PersonaExistenteException {
        Boolean personaExiste = personaDAO.consultarPersona(persona.getRfc());
        if(personaExiste) {
            throw new PersonaExistenteException("La persona ya se encuentra en el sistema");
        } else {
            this.personaDAO.registrar(persona);
        }
    }
    
    @Override
    public PersonaDTO obtenerPersona(String rfc) {
        return this.personaDAO.obtenerPersona(rfc);
    }
    
    @Override
    public boolean consultarPersona(String rfc) {
        Boolean personaExiste = personaDAO.consultarPersona(rfc);
        return personaExiste; 
    }
}
