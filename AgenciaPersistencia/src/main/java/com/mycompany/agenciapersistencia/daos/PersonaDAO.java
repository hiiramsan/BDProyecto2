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
import javax.persistence.TypedQuery;

/**
 *
 * @author carlo
 */
public class PersonaDAO {
    
    EntityManagerFactory emf;
    EntityManager em;

    public PersonaDAO() {
    }
    
    public void abrirEntityManager(){
        emf = Persistence.createEntityManagerFactory("ConexionPU");
        em = emf.createEntityManager();
    }
    
    public void cerrarEntityManager(){
        em.close();
        emf.close();
    }

    public void registrar(PersonaDTO persona) {
        abrirEntityManager();
        
        em.getTransaction().begin();
        
        Persona personaARegisrar = new Persona(persona.getRfc(), persona.getNombre(), persona.getApellidoPaterno(),
                persona.getApellidoMaterno(), persona.getTelefono(),
                persona.getFechaNacimiento(), persona.isDiscapacidad());

        /*
        quise correr el proyecto y no me dejaba por una parte de aqui asi que lo cambie, igual segun yo no habia porque cambiarlo
        ya que se debe manejar con un DTO y no los atributos "sueltos". ademas esta parte es la menos importante porque es 'hardcodeado'
        ya que no hay registro de Personas
        */
        
        em.persist(personaARegisrar);

        em.getTransaction().commit();
        cerrarEntityManager();
    }

    public boolean consultarPersona(String rfc) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ConexionPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        try {
            String jpql = "SELECT COUNT(p) FROM Persona p WHERE p.rfc = :rfc";
            TypedQuery<Long> query = entityManager.createQuery(jpql, Long.class);
            query.setParameter("rfc", rfc);
            Long count = query.getSingleResult();
            
            entityManager.getTransaction().commit();
            
            return count > 0;
        } catch(Exception e) {
            entityManager.getTransaction().rollback();
            throw e;
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }
    
    public PersonaDTO obtenerPersona(String rfc) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ConexionPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        
        try {
            String jpql = "SELECT p FROM Persona p WHERE p.rfc = :rfc";
            TypedQuery<Persona> query = entityManager.createQuery(jpql, Persona.class);
            query.setParameter("rfc", rfc);
            Persona personaBuscada = query.getSingleResult();
            entityManager.getTransaction().commit();
            
            PersonaDTO personaDTO = new PersonaDTO();
            personaDTO.setRfc(personaBuscada.getRfc());
            personaDTO.setNombre(personaBuscada.getNombre());
            personaDTO.setApellidoPaterno(personaBuscada.getApellidoPaterno());
            personaDTO.setApellidoMaterno(personaBuscada.getApellidoMaterno());
            personaDTO.setTelefono(personaBuscada.getTelefono());
            personaDTO.setFechaNacimiento(personaBuscada.getFechaNacimiento());
            personaDTO.setDiscapacidad(personaBuscada.isDiscapacidad());
            
            return personaDTO;
        } catch(Exception e) {
            entityManager.getTransaction().rollback();
            throw e;
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }   
    }
    
    public Persona buscarPersonaPorRFC(String rfc) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ConexionPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        
        try {
            
            String jpql = "SELECT p FROM Persona p WHERE p.rfc = :rfc";
            TypedQuery<Persona> query = entityManager.createQuery(jpql, Persona.class);
            query.setParameter("rfc", rfc);
            return query.getSingleResult();
        } catch(Exception e) {
            entityManager.getTransaction().rollback();
            throw e;
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }  
    }
}
