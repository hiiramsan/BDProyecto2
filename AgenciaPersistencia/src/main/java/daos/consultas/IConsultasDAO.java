/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos.consultas;

import entidadesJPA.Persona;
import java.util.Date;
import java.util.List;

/**
 *
 * @author carlo
 */
public interface IConsultasDAO {
    public List<Persona> buscarPersonaPorRFC(String rfc);
    public List<Persona> buscarPersonaPorNombreSimilar(String nombre);
    public List<Persona> buscarPersonaPorFechaNacimiento(Date fechaNacimiento);
}
