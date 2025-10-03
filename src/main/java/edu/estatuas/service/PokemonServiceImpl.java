package edu.estatuas.service;

import edu.estatuas.model.Pokemon;
import edu.estatuas.repository.PokemonsRepository;
import edu.estatuas.storage.PokemonsStorage;

import java.io.File;
import java.util.List;

public class PokemonServiceImpl implements PokemonService {

    private final PokemonsStorage storage;
    private final PokemonsRepository repository;

    /**
     * Contructor del servicio de pokemons
     * @param storage Almacenamiento de pokemons, para leer y escribir en ficheros
     * @param repository Repositorio de pokemons, para almacenar y gestionar pokemons en memoria
     * */
    public PokemonServiceImpl(PokemonsStorage storage, PokemonsRepository repository) {
        this.storage = storage;
        this.repository = repository;
    }

    /**
     * Lee pokemons desde un archivo
     *
     * @param filePath Ruta del archivo
     * @return Lista de pokemons
     *
     */
    @Override
    public List<Pokemon> readFromFile(String filePath) {
        return storage.readFromFile(new File(filePath));
    }

    /**
     * Importa pokemons desde un archivo y los almacena en el repositorio
     *
     * @param filePath Ruta del archivo
     *
     */
    @Override
    public void importFromFile(String filePath) {
        List<Pokemon> pokemons = readFromFile(filePath);
        pokemons.forEach(repository::save);
    }

    /**
     * Obtiene todos los pokemons
     *
     * @return Lista de pokemons
     *
     */
    @Override
    public List<Pokemon> getAll() {
        return repository.getAll();
    }

    public Pokemon save(Pokemon pokemon) {
        return  repository.save(pokemon);
    }
}
