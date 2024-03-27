/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos.automovil;

import dtos.AutomovilDTO;
import entidadesJPA.Persona;

/**
 *
 * @author carlo
 */
public interface IAutomovilDAO {
    public AutomovilDTO registrarAutomovil(String numeroSerie, String marca, String linea, String color, int modelo, Persona persona);
    
    public boolean existeAutomovil(String numeroSerie);
    
    public AutomovilDTO obtenerAutomovil(String numeroSerie, String rfc);
}
