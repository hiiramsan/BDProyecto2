/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos.placa;

import com.mycompany.agenciapersistencia.controlador.utils.EstadoTramite;
import conexion.IConexionDAO;
import dtos.PlacaDTO;
import entidadesJPA.Automovil;
import entidadesJPA.Persona;
import entidadesJPA.Placa;
import java.util.Calendar;
import javax.persistence.EntityManager;

/**
 *
 * @author carlo
 */
public class PlacaDAO implements IPlacaDAO {
    private final IConexionDAO conexion;
    
    public PlacaDAO(IConexionDAO conexion) {  
        this.conexion = conexion;
    }
    
    @Override
    public PlacaDTO registrarPlacaAutoNuevo(Automovil automovil, float costo, String claveNumerica, Persona persona) {
        EntityManager entityManager = conexion.crearConexion();
        entityManager.getTransaction().begin();

        try {

            Calendar fechaExpedicion = Calendar.getInstance();

            
            Placa placa = new Placa(claveNumerica, automovil, costo, EstadoTramite.ACTIVA, fechaExpedicion, persona);
            entityManager.persist(placa);
            entityManager.getTransaction().commit();

            PlacaDTO placaDTO = new PlacaDTO();
            placaDTO.setClaveNumerica(claveNumerica);
            placaDTO.setEstado(placa.getEstado());
            placaDTO.setFechaExpedicion(placa.getFechaExpedicion());
            placaDTO.setAutomovil(placa.getAutomovil());
            placaDTO.setCosto(placa.getCosto());

            return placaDTO;
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            throw e;
        } finally {
            entityManager.close();
        }
    }
}
