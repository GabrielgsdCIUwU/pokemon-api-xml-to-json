package edu.estatuas;

import edu.estatuas.model.Pokemon;
import edu.estatuas.repository.PokemonsRepositoryImpl;
import edu.estatuas.service.PokemonService;
import edu.estatuas.service.PokemonServiceImpl;
import edu.estatuas.storage.PokemonStorageJson;

import java.util.List;

public class AppPokemons {
    public static void main(String[] args) {
        System.out.println("Hola pokemons");

        PokemonService service = new PokemonServiceImpl(
                new PokemonStorageJson(),
                new PokemonsRepositoryImpl()
        );

        service.importFromFile("data/pokemon.json");

        List<Pokemon> pokemons = service.getAll();

        System.out.println("Todos los pokemons:");
        pokemons.forEach(System.out::println);

        //pokemons que tengan tipo Grass
        System.out.println("\nPokemon tipo Grass");
        pokemons.stream()
                .filter(pokemon -> {
                    return pokemon.getType().contains("Grass");
                }).forEach(System.out::println);


        //Pokemons que tengan menos de 50hp
        System.out.println("\nPokemons que tengan menos de 50hp");
        pokemons.stream()
                .filter(pokemon -> {
                    return pokemon.getStats().get("hp") < 50;
                }).forEach(System.out::println);

        //Obtener todas las descripciones de los pokemons
        System.out.println("\nObtener todas las descripciones de los pokemons");
        pokemons.forEach(pokemon -> {
                    System.out.println(pokemon.getDescription());
                });
    }
}
