/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio.automovil;

import conexion.ConexionDAO;
import conexion.IConexionDAO;
import daos.automovil.AutomovilDAO;
import daos.automovil.IAutomovilDAO;
import daos.persona.IPersonaDAO;
import daos.persona.PersonaDAO;
import dtos.AutomovilDTO;
import dtos.PersonaDTO;
import entidadesJPA.Persona;
import excepciones.AutomovilExistenteException;
import excepciones.AutomovilInexistenteException;
import excepciones.NoPropietarioException;
import java.util.logging.Logger;

/**
 *
 * @author carlo
 */
public class AutomovilBO implements IAutomovil {

    IConexionDAO conexionDAO = new ConexionDAO();
    private static final Logger LOG = Logger.getLogger(AutomovilBO.class.getName());
    IAutomovilDAO automovilDAO = new AutomovilDAO(conexionDAO);
    IPersonaDAO personaDAO = new PersonaDAO(conexionDAO);

    public AutomovilBO(IConexionDAO conexion) {
        this.conexionDAO = conexionDAO;
    }

    @Override
    public AutomovilDTO registrarAutomovilNuevo(AutomovilDTO automovil, PersonaDTO persona) throws AutomovilExistenteException {
        String numeroSerie = automovil.getNumeroSerie();
        String marca = automovil.getMarca();
        String linea = automovil.getLinea();
        String color = automovil.getColor();
        int modelo = automovil.getModelo();

        Persona personaAutomovil = personaDAO.buscarPersonaPorRFC(persona.getRfc());

        Boolean autoYaExiste = automovilDAO.existeAutomovil(numeroSerie);
        if (autoYaExiste) {
            throw new AutomovilExistenteException("EL auto ya existe");
        } else {
            return this.automovilDAO.registrarAutomovil(numeroSerie, marca, linea, color, modelo, personaAutomovil);
        }
    }

    @Override
    public AutomovilDTO recuperarAutomovilUsado(String numSerie, String rfc) throws AutomovilInexistenteException, NoPropietarioException {
        AutomovilDTO automovilDTO = this.automovilDAO.obtenerAutomovil(numSerie, rfc);

        if (automovilDTO != null) {
            return automovilDTO;
        } else {
            throw new NoPropietarioException("El automóvil no existe o no corresponde al propietario.");
        }
    }

}
