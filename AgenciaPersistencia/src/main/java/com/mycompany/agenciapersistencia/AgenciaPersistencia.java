/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.agenciapersistencia;

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
public class AgenciaPersistencia {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ConexionPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        
        Calendar fecha1 = Calendar.getInstance();
        fecha1.set(2024, Calendar.APRIL, 22);
        Persona persona = entityManager.find(Persona.class, 2L);
        Licencia licencia1 = new Licencia(fecha1, 600, "Activa", fecha1, persona);
        entityManager.persist(licencia1); 
        
        
//        
//        
//        Persona persona1 = new Persona("1234567891234", "Carlos", "Sanchez", "Meneses", "6443018817", fecha1, false);
//        
//        Automovil auto1 = new Automovil("12345678912345678", "Mazda", "3", "rojo", persona1);
//        
//        Placa placa1 = new Placa(fecha1, "123-ASD", auto1, 600, "Activa", fecha1, persona1);
//        
//        Licencia licencia1 = new Licencia(fecha1, 600, "Activa", fecha1, persona1);
//        
//        entityManager.persist(persona1);
//        entityManager.persist(auto1);
//        entityManager.persist(placa1);
//        entityManager.persist(licencia1);        
        
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
