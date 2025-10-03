package edu.estatuas.storage;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.estatuas.model.Pokemon;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class PokemonStorageJson implements PokemonsStorage {

    /**
     * Lee pokemons desde un fichero CSV
     * @param file Fichero CSV
     * @return Lista de pokemons
     */
    @Override
    public List<Pokemon> readFromFile(File file) {
        if (!file.exists() || !file.isFile() || !file.canRead()) {
            throw new IllegalArgumentException("El archivo no existe en el sistema o se puede leer: " + file);
        }

        try {
            ObjectMapper mapper = new ObjectMapper();
            List<Pokemon> listaPokemons = mapper.readValue(
                    file,
                    new TypeReference<List<Pokemon>>() {}
            );
            return listaPokemons;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return List.of();
    }
}
