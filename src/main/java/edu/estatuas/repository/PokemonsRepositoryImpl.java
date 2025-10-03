package edu.estatuas.repository;

import edu.estatuas.model.Pokemon;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PokemonsRepositoryImpl implements PokemonsRepository {
    private final Map<Integer, Pokemon> pokemons = new HashMap<>();
    /**
     * Obtiene todos los pokemons
     *
     * @return Lista de pokemons
     */
    @Override
    public List<Pokemon> getAll() {
        return  pokemons.values().stream().toList();
    }

    /**
     * Obtiene un pokemon por su id
     *
     * @param integer Identificador del pokemon
     * @return El pokemon o null si no se encuentra
     */
    @Override
    public Pokemon getById(Integer integer) {
        return pokemons.get(integer);
    }

    /**
     * Guarda un pokemon
     *
     * @param item El pokemon a guardar
     * @return El pokemon guardado
     */
    @Override
    public Pokemon save(Pokemon item) {
        int id = pokemons.keySet().stream().mapToInt(Integer::intValue).max().orElse(0) +1;
        pokemons.put(id, item);
        return item;
    }

    /**
     * Actualiza un pokemon
     *
     * @param integer Identificador del pokemon
     * @param item    El pokemon con los datos actualizados
     * @return El pokemon actualizado o null si no se encuentra
     */
    @Override
    public Pokemon update(Integer integer, Pokemon item) {
        return  pokemons.put(integer, item);
    }

    /**
     * Elimina una entidad
     *
     * @param integer Identificador del pokemon
     * @return El pokemon eliminado o null si no se encuentra
     */
    @Override
    public Pokemon delete(Integer integer) {
        return  pokemons.remove(integer);
    }
}
