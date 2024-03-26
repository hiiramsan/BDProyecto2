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
    public AutomovilDTO registrarAutomovilDTO(AutomovilDTO automovil, PersonaDTO persona) {
        String numeroSerie = automovil.getNumeroSerie();
        String marca = automovil.getMarca();
        String linea = automovil.getLinea();
        String color = automovil.getColor();
        int modelo = automovil.getModelo();
        
        Persona personaAutomovil = personaDAO.buscarPersonaPorRFC(persona.getRfc());
        
        return this.automovilDAO.registrarAutomovil(numeroSerie, marca, linea, color, 0, personaAutomovil);
    }
    
    
}
