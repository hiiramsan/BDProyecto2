/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos.licencia;

import dtos.LicenciaDTO;
import dtos.PersonaDTO;
import entidadesJPA.Persona;

/**
 *
 * @author carlo
 */
public interface ILicenciaDAO {
    public boolean consultarLicencia(Persona persona);
    
    public LicenciaDTO registrarLicencia(Persona persona, int vigencia, float costo);
    
    public boolean tieneLicenciaActiva(Persona persona);
}
