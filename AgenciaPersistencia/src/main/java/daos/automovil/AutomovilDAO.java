/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos.automovil;

import conexion.IConexionDAO;
import dtos.AutomovilDTO;
import entidadesJPA.Automovil;
import entidadesJPA.Persona;
import javax.persistence.EntityManager;

/**
 *
 * @author carlo
 */
public class AutomovilDAO implements IAutomovilDAO {

    private final IConexionDAO conexion;

    public AutomovilDAO(IConexionDAO conexion) {
        this.conexion = conexion;
    }

    @Override
    public AutomovilDTO registrarAutomovil(String numeroSerie, String marca, String linea, String color, int modelo, Persona persona) {
        EntityManager entityManager = conexion.crearConexion();
        entityManager.getTransaction().begin();

        try {
            Automovil automovil = new Automovil(numeroSerie, marca, linea, color, modelo, persona);
            entityManager.persist(automovil);

            entityManager.getTransaction().commit();

            AutomovilDTO automovilDTO = new AutomovilDTO(automovil.getNumSerie(), automovil.getMarca(), automovil.getLinea(), automovil.getColor(), automovil.getModelo());
            return automovilDTO;
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            throw e;
        } finally {
            entityManager.close();
        }

    }
}
