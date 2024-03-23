/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio;

import dtos.LicenciaDTO;
import dtos.PersonaDTO;
import entidadesJPA.Persona;

/**
 *
 * @author carlo
 */
public interface ILicencias {
    public float calcularCostoLicencia(int vigencia, boolean esDiscapacitado);
    
    public boolean consultarLicencia(PersonaDTO persona);
    
    public LicenciaDTO registrarLicencia(PersonaDTO persona, int vigencia, float costo);
}
