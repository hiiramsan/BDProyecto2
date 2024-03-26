/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio.automovil;

import conexion.IConexionDAO;
import dtos.AutomovilDTO;
import dtos.PersonaDTO;

/**
 *
 * @author carlo
 */
public interface IAutomovil {
    public AutomovilDTO registrarAutomovilDTO(AutomovilDTO automovil, PersonaDTO persona);
}
