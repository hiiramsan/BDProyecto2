/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciapersistencia.daos;

import dtos.PersonaDTO;
import entidadesJPA.Automovil;
import entidadesJPA.Licencia;
import entidadesJPA.Persona;
import entidadesJPA.Placa;
import java.util.Calendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author carlo
 */
public class PersonaDAO {
    public void registrar(PersonaDTO persona) {
        System.out.println("AQUI LOGICA DE REGISTRARRRRR!!!!!!!!!");
        System.out.println(persona);
        
        
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ConexionPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin(); 
        
        Persona personaARegisrar = new Persona(persona.getRfc(), persona.getNombre(), persona.getApellidoPaterno(), 
                persona.getApellidoMaterno(), persona.getTelefono(), 
                persona.getFechaNacimiento(), persona.isDiscapacidad());
        
        entityManager.persist(personaARegisrar);
        
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
