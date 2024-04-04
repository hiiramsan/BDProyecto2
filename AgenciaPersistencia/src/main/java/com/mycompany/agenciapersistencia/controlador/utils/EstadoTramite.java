/*
 * Enum Estado Tramite
 */
package com.mycompany.agenciapersistencia.controlador.utils;

/**
 * Enumerado que representa los estados posibles de un trámite.
 * Los posibles estados son: ACTIVA y VENCIDA.
 * 
 * @author Carlos Sanchez
 */
public enum EstadoTramite {

    /**
     *  Estado del trámite cuando está activo
     */
    ACTIVA, 

    /**
     *  Estado del trámite cuando ha vencido
     */
    VENCIDA 
}
