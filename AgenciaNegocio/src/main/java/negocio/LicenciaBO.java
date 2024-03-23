/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import com.mycompany.agenciapersistencia.controlador.ControladorPersistencia;
import dtos.PersonaDTO;
import entidadesJPA.Persona;

/**
 *
 * @author carlo
 */
public class LicenciaBO implements ILicencias {
    // this class could be called ConsultaLicenciasBO but dont know if i should put every method together no se si me entiendes
    
    ControladorPersistencia cp = new ControladorPersistencia();

    @Override
    public float calcularCostoLicencia(int vigencia, boolean esDiscapacitado) {
        float costoNormal = 0;
        float costoDiscapacitado = 0;
        
        switch (vigencia) {
            case 1:
                costoNormal = 600;
                costoDiscapacitado = 200;
                break;
            case 2:
                costoNormal = 900;
                costoDiscapacitado = 500;
                break;
            case 3:
                costoNormal = 1100;
                costoDiscapacitado = 700;
                break;
            default:
                
                break;
        }
        return esDiscapacitado ? costoDiscapacitado : costoNormal;
    
    }
    
    public boolean consultarLicencia(PersonaDTO persona) {
        return this.cp.consultarLicencia(persona);
    }
    
    
}
