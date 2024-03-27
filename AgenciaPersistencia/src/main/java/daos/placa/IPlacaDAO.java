/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos.placa;

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
public interface IPlacaDAO {
    public PlacaDTO registrarPlacaAutoNuevo(Automovil automovil, float costo, String claveNumerica, Persona persona);
}
