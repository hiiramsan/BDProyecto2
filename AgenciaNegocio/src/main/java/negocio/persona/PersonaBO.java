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
import encriptador.Encriptador;
import excepciones.PersonaExistenteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * La clase PersonaBO implementa la interfaz IPersona y proporciona métodos para realizar operaciones relacionadas con las personas.
 * Esta clase maneja la lógica de negocio para registrar una nueva persona, obtener información de una persona y consultar la existencia de una persona.
 * 
 * @author Carlos Sanchez
 */
public class PersonaBO implements IPersona {

    IConexionDAO conexionDAO = new ConexionDAO();
    IPersonaDAO personaDAO = new PersonaDAO(conexionDAO);
    private static final Logger LOG = Logger.getLogger(PersonaBO.class.getName());

    /**
     * Constructor de la clase PersonaBO.
     * @param conexionDAO El objeto de conexión a la base de datos.
     */
    public PersonaBO(IConexionDAO conexionDAO) {
        this.conexionDAO = conexionDAO;
    }

    @Override
    public void registrarPersona(PersonaDTO persona) throws PersonaExistenteException {
        Boolean personaExiste = personaDAO.consultarPersona(persona.getRfc());
        if (personaExiste) {
            throw new PersonaExistenteException("La persona ya se encuentra en el sistema");
        } else {
            try {
                // encriptar telefono:
                persona.setTelefono(Encriptador.encriptar(persona.getTelefono()));
                this.personaDAO.registrar(persona);
            } catch (Exception ex) {
                System.out.println("Aqui esta el problema");
                ex.printStackTrace();
            }
        }
    }

    @Override
    public PersonaDTO obtenerPersona(String rfc) {
        PersonaDTO personaObtenida = this.personaDAO.obtenerPersona(rfc);

        try {
            personaObtenida.setTelefono(Encriptador.desencriptar(personaObtenida.getTelefono()));
        } catch (Exception ex) {
            
        }
        return personaObtenida;

    }

    @Override
    public boolean consultarPersona(String rfc) {
        Boolean personaExiste = personaDAO.consultarPersona(rfc);
        return personaExiste;
    }
}
