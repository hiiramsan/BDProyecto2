/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio.licencia;

import dtos.LicenciaDTO;
import dtos.PersonaDTO;
import excepciones.LicenciaActivaException;
import excepciones.MenorDeEdadException;

/**
 * La interfaz ILicencias define métodos para realizar operaciones relacionadas con las licencias de conducir.
 * Implementa esta interfaz para proporcionar funcionalidades para calcular el costo de una licencia, 
 * consultar la existencia de una licencia para una persona y registrar una nueva licencia.
 * 
 * @author Carlos Sanchez
 */
public interface ILicencias {

    /**
     * Calcula el costo de una licencia de conducir basado en su vigencia y si el solicitante es discapacitado.
     * 
     * @param vigencia La vigencia de la licencia (1, 2 o 3 años).
     * @param esDiscapacitado Indica si el solicitante es discapacitado o no.
     * @return El costo de la licencia calculado.
     */
    public float calcularCostoLicencia(int vigencia, boolean esDiscapacitado);

    /**
     * Consulta si una persona posee una licencia de conducir activa.
     * 
     * @param persona La información de la persona para la cual se realizará la consulta.
     * @return true si la persona tiene una licencia activa, false en caso contrario.
     */
    public boolean consultarLicencia(PersonaDTO persona);

    /**
     * Registra una nueva licencia de conducir para una persona.
     * 
     * @param persona La información de la persona para la cual se registrará la licencia.
     * @param vigencia La vigencia de la licencia (1, 2 o 3 años).
     * @param costo El costo de la licencia.
     * @return El objeto LicenciaDTO que representa la licencia registrada.
     * @throws MenorDeEdadException Si la persona es menor de edad y no puede obtener una licencia de conducir.
     * @throws LicenciaActivaException Si la persona ya tiene una licencia de conducir activa.
     */
    public LicenciaDTO registrarLicencia(PersonaDTO persona, int vigencia, float costo) throws MenorDeEdadException, LicenciaActivaException;
}
