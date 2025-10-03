package edu.estatuas.storage;

import edu.estatuas.model.Pokemon;

import java.io.File;
import java.util.List;

public interface PokemonsStorage {
    /**
     * Lee pokemons desde un archivo
     * @param file El archivo a leer
     * @return Lista de pokemons
     * */
    List<Pokemon> readFromFile(File file);
}
