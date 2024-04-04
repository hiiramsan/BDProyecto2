/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio.licencia;

import negocio.licencia.ILicencias;
import conexion.ConexionDAO;
import conexion.IConexionDAO;
import daos.licencia.ILicenciaDAO;
import daos.licencia.LicenciaDAO;
import daos.persona.IPersonaDAO;
import daos.persona.PersonaDAO;
import dtos.LicenciaDTO;
import dtos.PersonaDTO;
import entidadesJPA.Persona;
import excepciones.LicenciaActivaException;
import excepciones.MenorDeEdadException;
import java.util.logging.Logger;

/**
 * La clase LicenciaBO implementa la interfaz ILicencias y proporciona métodos para realizar operaciones relacionadas con las licencias de conducir.
 * Esta clase maneja la lógica de negocio para calcular el costo de una licencia, consultar la existencia de una licencia para una persona y registrar una nueva licencia.
 * 
 * @author Carlos sanchez
 */
public class LicenciaBO implements ILicencias {

    IConexionDAO conexionDAO = new ConexionDAO();
    ILicenciaDAO licenciaDAO = new LicenciaDAO(conexionDAO);
    IPersonaDAO personaDAO = new PersonaDAO(conexionDAO);
    private static final Logger LOG = Logger.getLogger(LicenciaBO.class.getName());

    /**
     * Constructor de la clase LicenciaBO.
     * @param conexionDAO El objeto de conexión a la base de datos.
     */
    public LicenciaBO(IConexionDAO conexionDAO) {
        this.conexionDAO = conexionDAO;
    }

    @Override
    public float calcularCostoLicencia(int vigencia, boolean esDiscapacitado) {
        float costoNormal = 0;
        float costoDiscapacitado = 0;

        switch (vigencia) {
            case 1:
                costoNormal = 600;
                costoDiscapacitado = 200;
                break;
            case 2:
                costoNormal = 900;
                costoDiscapacitado = 500;
                break;
            case 3:
                costoNormal = 1100;
                costoDiscapacitado = 700;
                break;
            default:

                break;
        }
        return esDiscapacitado ? costoDiscapacitado : costoNormal;

    }

    @Override
    public boolean consultarLicencia(PersonaDTO persona) {
        Persona personaABuscar = personaDAO.buscarPersonaPorRFC(persona.getRfc());
        
        return this.licenciaDAO.consultarLicencia(personaABuscar);

    }

    @Override
    public LicenciaDTO registrarLicencia(PersonaDTO persona, int vigencia, float costo) throws MenorDeEdadException, LicenciaActivaException {
        Persona personaABuscar = personaDAO.buscarPersonaPorRFC(persona.getRfc());
        Boolean esMayorDeEdad = personaDAO.esMayorDeEdad(persona.getRfc());
        Boolean tieneLicenciaActiva = licenciaDAO.consultarLicencia(personaABuscar);

        if (!tieneLicenciaActiva && esMayorDeEdad) {
            return this.licenciaDAO.registrarLicencia(personaABuscar, vigencia, costo);
        } else if (tieneLicenciaActiva) {
            throw new LicenciaActivaException("La persona ya tiene una licencia activa");
        } else {
            throw new MenorDeEdadException("La persona es menor de edad");
        }
    }

}
