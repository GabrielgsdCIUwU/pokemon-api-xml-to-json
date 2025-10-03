package edu.estatuas.service;

import edu.estatuas.model.Pokemon;

import java.util.List;

public interface PokemonService {
    /**
     * Lee pokemons desde un archivo
     * @param filePath Ruta del archivo
     * @return Lista de pokemons
     * */

    List<Pokemon> readFromFile(String filePath);

    /**
     * Importa pokemons desde un archivo y los almacena en el repositorio
     * @param filePath Ruta del archivo
     * */
    void importFromFile(String filePath);

    /**
     * Obtiene todos los pokemons
     * @return Lista de pokemons
     * */
    List<Pokemon> getAll();
}
