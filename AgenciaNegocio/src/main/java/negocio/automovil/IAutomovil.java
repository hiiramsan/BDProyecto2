/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio.automovil;

import conexion.IConexionDAO;
import dtos.AutomovilDTO;
import dtos.PersonaDTO;
import excepciones.AutomovilExistenteException;
import excepciones.AutomovilInexistenteException;
import excepciones.NoPropietarioException;

/**
 *
 * @author carlo
 */
public interface IAutomovil {
    public AutomovilDTO registrarAutomovilNuevo(AutomovilDTO automovil, PersonaDTO persona) throws AutomovilExistenteException;
    
    public AutomovilDTO recuperarAutomovilUsado(String numSerie, String rfc) throws AutomovilInexistenteException, NoPropietarioException;
}
