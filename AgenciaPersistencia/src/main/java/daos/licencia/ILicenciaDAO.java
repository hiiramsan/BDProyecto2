/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos.licencia;

import dtos.LicenciaDTO;
import dtos.PersonaDTO;

/**
 *
 * @author carlo
 */
public interface ILicenciaDAO {
    public boolean consultarLicencia(PersonaDTO persona);
    
    public LicenciaDTO registrarLicencia(PersonaDTO persona, int vigencia, float costo);
    
    
}
