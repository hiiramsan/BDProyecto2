/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio.placa;

import dtos.AutomovilDTO;
import dtos.PersonaDTO;
import dtos.PlacaDTO;
import excepciones.AutomovilInexistenteException;
import excepciones.LicenciaInactivaException;
/**
 *
 * @author carlo
 */
public interface IPlaca {
    public float calcularCostoPlaca(boolean esNuevo);
    
   public String generarPlaca();
 
   public PlacaDTO registrarPlacaAutoNuevo(AutomovilDTO automovil, float costo, PersonaDTO persona) throws LicenciaInactivaException;
   
   public AutomovilDTO obtenerAutoPorPlacas(String claveNumerica, String rfc) throws AutomovilInexistenteException;
   
   public PlacaDTO registrarPlacaAutoUsado(AutomovilDTO automovil, float costo, PersonaDTO persona) throws LicenciaInactivaException;
}
