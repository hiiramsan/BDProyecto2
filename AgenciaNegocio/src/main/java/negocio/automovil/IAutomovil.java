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
 * La interfaz IAutomovil define métodos para operaciones relacionadas con los automóviles.
 * Implementa esta interfaz para proporcionar funcionalidades para registrar nuevos automóviles y recuperar automóviles usados.
 * 
 * @author Carlos Sanchez
 */
public interface IAutomovil {
    
    /**
     * Registra un nuevo automóvil junto con su propietario en el sistema.
     * 
     * @param automovil El objeto AutomovilDTO que representa el automóvil a registrar.
     * @param persona El objeto PersonaDTO que representa al propietario del automóvil.
     * @return Un objeto AutomovilDTO que representa el automóvil registrado.
     * @throws AutomovilExistenteException Si el automóvil ya existe en el sistema.
     */
    public AutomovilDTO registrarAutomovilNuevo(AutomovilDTO automovil, PersonaDTO persona) throws AutomovilExistenteException;
    
    /**
     * Recupera la información de un automóvil usado basado en su número de serie y el RFC del propietario.
     * 
     * @param numSerie El número de serie del automóvil usado.
     * @param rfc El RFC del propietario del automóvil.
     * @return Un objeto AutomovilDTO que representa la información del automóvil usado.
     * @throws AutomovilInexistenteException Si el automóvil no existe en el sistema.
     * @throws NoPropietarioException Si el automóvil no corresponde al propietario proporcionado.
     */
    public AutomovilDTO recuperarAutomovilUsado(String numSerie, String rfc) throws AutomovilInexistenteException, NoPropietarioException;
}
