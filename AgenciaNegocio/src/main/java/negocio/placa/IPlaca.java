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
 * La interfaz IPlaca proporciona métodos para realizar operaciones relacionadas con las placas de vehículos.
 * Estos métodos son implementados por la clase PlacaBO para manejar la lógica de negocio.
 * 
 * @author Carlos Sanchez
 */
public interface IPlaca {
    
    /**
     * Calcula el costo de una placa en función de si el vehículo es nuevo o usado.
     * @param esNuevo Un booleano que indica si el vehículo es nuevo.
     * @return El costo de la placa.
     */
    public float calcularCostoPlaca(boolean esNuevo);
    
    /**
     * Genera una nueva placa alfanumérica.
     * @return La placa generada.
     */
   public String generarPlaca();
 
   /**
    * Registra una nueva placa para un automóvil nuevo.
    * @param automovil El DTO del automóvil.
    * @param costo El costo de la placa.
    * @param persona El DTO de la persona dueña del automóvil.
    * @return El DTO de la placa registrada.
    * @throws LicenciaInactivaException Si la licencia de la persona está inactiva.
    */
   public PlacaDTO registrarPlacaAutoNuevo(AutomovilDTO automovil, float costo, PersonaDTO persona) throws LicenciaInactivaException;
   
   /**
    * Obtiene información de un automóvil a partir de su placa.
    * @param claveNumerica La clave alfanumérica de la placa.
    * @param rfc El RFC de la persona dueña del automóvil.
    * @return El DTO del automóvil.
    * @throws AutomovilInexistenteException Si no se encuentra ningún automóvil con esa placa.
    */
   public AutomovilDTO obtenerAutoPorPlacas(String claveNumerica, String rfc) throws AutomovilInexistenteException;
   
   /**
    * Registra una nueva placa para un automóvil usado, desactivando la placa anterior.
    * @param automovil El DTO del automóvil.
    * @param costo El costo de la placa.
    * @param persona El DTO de la persona dueña del automóvil.
    * @return El DTO de la placa registrada.
    * @throws LicenciaInactivaException Si la licencia de la persona está inactiva.
    */
   public PlacaDTO registrarPlacaAutoUsado(AutomovilDTO automovil, float costo, PersonaDTO persona) throws LicenciaInactivaException;
}
