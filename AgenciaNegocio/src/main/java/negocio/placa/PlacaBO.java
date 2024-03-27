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
import java.util.Calendar;
import java.util.Random;
import javax.persistence.EntityManager;

/**
 *
 * @author carlo
 */
public class PlacaBO implements IPlaca {

    IConexionDAO conexionDAO = new ConexionDAO();
    IPlacaDAO placaDAO = new PlacaDAO(conexionDAO);
    IPersonaDAO personaDAO = new PersonaDAO(conexionDAO);
    IAutomovilDAO automovilDAO = new AutomovilDAO(conexionDAO);

    private static final Random RANDOM = new Random();
    private static final String LETRAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int NUM_LETRAS = LETRAS.length();
    private static final int NUM_DIGITOS = 1000;

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
        StringBuilder placa = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            placa.append(LETRAS.charAt(RANDOM.nextInt(NUM_LETRAS)));
        }

        placa.append("-");

        int numero = RANDOM.nextInt(NUM_DIGITOS);
        placa.append(String.format("%03d", numero));

        return placa.toString();
    }

    
    @Override
    public PlacaDTO registrarPlacaAutoNuevo(AutomovilDTO automovil, float costo, PersonaDTO persona) {
        // validar si tiene licencia activa
        
        
        // genera placa
        String claveNumerica = generarPlaca();
        
        // si tiene licencia activa registra la placona
        Persona personaPlaca  = personaDAO.buscarPersonaPorRFC(persona.getRfc());
        Automovil automovilPlaca = automovilDAO.obtenerAutomovilPorNumeroSerie(automovil.getNumeroSerie());
        
        return this.placaDAO.registrarPlacaAutoNuevo(automovilPlaca, costo, claveNumerica, personaPlaca);
        
    }
   

    

}
