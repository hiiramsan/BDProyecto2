/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio.placa;

import com.mycompany.agenciapersistencia.controlador.utils.EstadoTramite;
import conexion.ConexionDAO;
import conexion.IConexionDAO;
import daos.automovil.AutomovilDAO;
import daos.automovil.IAutomovilDAO;
import daos.licencia.ILicenciaDAO;
import daos.licencia.LicenciaDAO;
import daos.persona.IPersonaDAO;
import daos.persona.PersonaDAO;
import daos.placa.IPlacaDAO;
import daos.placa.PlacaDAO;
import dtos.AutomovilDTO;
import dtos.PersonaDTO;
import dtos.PlacaDTO;
import entidadesJPA.Automovil;
import entidadesJPA.Persona;
import entidadesJPA.Placa;
import excepciones.AutomovilInexistenteException;
import excepciones.LicenciaInactivaException;
import java.util.Calendar;
import java.util.Random;
import javax.persistence.EntityManager;

/**
 * La clase PlacaBO implementa la interfaz IPlaca y proporciona métodos para
 * realizar operaciones relacionadas con las placas de vehículos. Esta clase
 * maneja la lógica de negocio para calcular el costo de una placa, generar una
 * nueva placa, registrar placas para vehículos nuevos y usados, así como
 * obtener información de un vehículo a través de su placa.
 *
 * @author Carlos Sanchez
 */
public class PlacaBO implements IPlaca {

    IConexionDAO conexionDAO = new ConexionDAO();
    IPlacaDAO placaDAO = new PlacaDAO(conexionDAO);
    IPersonaDAO personaDAO = new PersonaDAO(conexionDAO);
    IAutomovilDAO automovilDAO = new AutomovilDAO(conexionDAO);
    ILicenciaDAO licenciaDAO = new LicenciaDAO(conexionDAO);

    private static final Random RANDOM = new Random();
    private static final String LETRAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int NUM_LETRAS = LETRAS.length();
    private static final int NUM_DIGITOS = 1000;

    /**
     * Constructor de la clase PlacaBO.
     *
     * @param conexionDAO El objeto de conexión a la base de datos.
     */
    public PlacaBO(IConexionDAO conexionDAO) {
        this.conexionDAO = conexionDAO;
    }

    @Override
    public float calcularCostoPlaca(boolean esNuevo) {
        float costo;
        if (esNuevo) {
            costo = 1500;
        } else {
            costo = 1000;
        }
        return costo;
    }

    @Override
    public String generarPlaca() {
        String nuevaPlaca;
        do {
            StringBuilder placa = new StringBuilder();

            for (int i = 0; i < 3; i++) {
                placa.append(LETRAS.charAt(RANDOM.nextInt(NUM_LETRAS)));
            }

            placa.append("-");

            int numero = RANDOM.nextInt(NUM_DIGITOS);
            placa.append(String.format("%03d", numero));

            nuevaPlaca = placa.toString();
        } while (placaDAO.placaExiste(nuevaPlaca));

        return nuevaPlaca;
    }

    @Override
    public PlacaDTO registrarPlacaAutoNuevo(AutomovilDTO automovil, float costo, PersonaDTO persona) throws LicenciaInactivaException {
        // genera placa
        String claveNumerica = generarPlaca();

        // si tiene licencia activa registra la placona
        Persona personaPlaca = personaDAO.buscarPersonaPorRFC(persona.getRfc());
        Automovil automovilPlaca = automovilDAO.obtenerAutomovilPorNumeroSerie(automovil.getNumeroSerie());

        Boolean licenciaActiva = licenciaDAO.tieneLicenciaActiva(personaPlaca);

        if (licenciaActiva) {
            return this.placaDAO.registrarPlaca(automovilPlaca, costo, claveNumerica, personaPlaca);
        } else {
            throw new LicenciaInactivaException("La persona no tiene una licencia activa");
        }
    }

    @Override
    public AutomovilDTO obtenerAutoPorPlacas(String claveNumerica, String rfc) throws AutomovilInexistenteException {
        AutomovilDTO autoRecuperar = this.automovilDAO.obtenerAutoPorPlacas(claveNumerica, rfc);

        if (autoRecuperar != null) {
            return autoRecuperar;
        } else {
            throw new AutomovilInexistenteException("Automovil no encontrado con esas placas");
        }

    }

    @Override
    public PlacaDTO registrarPlacaAutoUsado(AutomovilDTO automovil, float costo, PersonaDTO persona) throws LicenciaInactivaException {
        Automovil automovilPlaca = automovilDAO.obtenerAutomovilPorNumeroSerie(automovil.getNumeroSerie());
        Persona personaPlaca = personaDAO.buscarPersonaPorRFC(persona.getRfc());

        //generar la placa
        String claveNumerica = generarPlaca();

        // desactivar placa anterior
        this.placaDAO.desactivarPlaca(automovilPlaca);

        //  validar licencia
        Boolean licenciaActiva = licenciaDAO.tieneLicenciaActiva(personaPlaca);

        if (licenciaActiva) {
            return this.placaDAO.registrarPlaca(automovilPlaca, costo, claveNumerica, personaPlaca);
        } else {
            throw new LicenciaInactivaException("La persona no tiene una licencia activa");
        }

    }

}
