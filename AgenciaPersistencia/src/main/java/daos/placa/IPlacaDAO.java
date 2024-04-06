/*
 * Esta interfaz define los métodos para realizar operaciones relacionadas con la entidad Placa en la base de datos.
 */

package daos.placa;

import dtos.PlacaDTO;
import entidadesJPA.Automovil;
import entidadesJPA.Persona;
import entidadesJPA.Placa;

/**
 * Esta interfaz define los métodos para realizar operaciones relacionadas con la entidad Placa en la base de datos.
 * @author Carlos Sanchez
 */
public interface IPlacaDAO {

    /**
     * Registra una nueva placa en la base de datos.
     * @param automovil El automóvil asociado a la placa.
     * @param costo El costo de la placa.
     * @param claveNumerica La clave numérica de la placa.
     * @param persona La persona propietaria del automóvil.
     * @return Objeto PlacaDTO con los datos de la placa registrada.
     */
    public PlacaDTO registrarPlaca(Automovil automovil, float costo, String claveNumerica, Persona persona);

    /**
     * Obtiene la placa activa asociada a un automóvil.
     * @param automovil El automóvil para el cual se busca la placa activa.
     * @return La placa activa asociada al automóvil, o null si no se encuentra ninguna placa activa.
     */
    public Placa obtenerPlacaActiva(Automovil automovil);

    /**
     * Desactiva la placa asociada a un automóvil.
     * @param automovil El automóvil del cual se desactivará la placa.
     */
    public void desactivarPlaca(Automovil automovil);

    /**
     * Verifica si una placa con el mismo numeroAlfanumerico existe
     * @param numeroAlfanumerico
     * @return true si si existe, false si noooo
     */
    public boolean placaExiste(String numeroAlfanumerico);
}
