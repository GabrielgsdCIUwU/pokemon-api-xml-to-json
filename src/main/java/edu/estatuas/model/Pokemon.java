package edu.estatuas.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Pokemon {
    @JsonProperty("id")
    private final Integer id;
    @JsonProperty("name")
    private final String name;
    @JsonProperty("type")
    private final List<String> type;
    @JsonProperty("ability")
    private final String ability;
    @JsonProperty("exp")
    private final Integer exp;
    @JsonProperty("stats")
    private final HashMap<String, Integer> stats;
    @JsonProperty("evolutions")
    private final JsonNode evolutions;
    @JsonProperty("ratio")
    private final HashMap<String, Double> ratio;
    @JsonProperty("egg-group")
    private final List<String> eggGroup;
    @JsonProperty("species")
    private final List<String> species;
    @JsonProperty("height")
    private final Double height;
    @JsonProperty("weight")
    private final Double weight;
    @JsonProperty("description")
    private final String description;
    @JsonProperty("moves")
    private final JsonNode moves;



    public Pokemon(
            @JsonProperty("id") Integer id,
            @JsonProperty("name") String name,
            @JsonProperty("type")  List<String> type,
            @JsonProperty("ability") String ability,
            @JsonProperty("exp") Integer exp,
            @JsonProperty("stats")  HashMap<String, Integer> stats,
            @JsonProperty("evolutions") JsonNode evolutions,
            @JsonProperty("ratio") HashMap<String, Double> ratio,
            @JsonProperty("egg-group") List<String> eggGroup,
            @JsonProperty("species") List<String> species,
            @JsonProperty("height")  Double height,
            @JsonProperty("weight") Double weight,
            @JsonProperty("description")  String description,
            @JsonProperty("moves") JsonNode moves

    ) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.ability = ability;
        this.exp = exp;
        this.stats = stats;
        this.evolutions = evolutions;
        this.ratio = ratio;
        this.eggGroup = eggGroup;
        this.species = species;
        this.height = height;
        this.weight = weight;
        this.description = description;
        this.moves = moves;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Pokemon pokemon) {
            return  this.getId().equals(pokemon.getId());
        }
        return false;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + getId() + "\n" +
                "name=" + getName() + "\n" +
                "type=" + getType() + "\n" +
                "ability=" + getAbility() + "\n" +
                "exp=" + getExp() + "\n" +
                "stats=" + getStats() + "\n" +
                "evolutions=" + getEvolutions() + "\n" +
                "ratio=" + getRatio() + "\n" +
                "egg-group=" + getEggGroup() + "\n" +
                "species=" + getSpecies() + "\n" +
                "height=" + getHeight() + "\n" +
                "weight=" + getWeight() + "\n" +
                "description=" + getDescription() + "\n" +
                "moves=" + getMoves() + "\n";
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getType() {
        return type;
    }

    public String getAbility() {
        return ability;
    }

    public Integer getExp() {
        return exp;
    }

    public HashMap<String, Integer> getStats() {
        return stats;
    }

    public JsonNode getEvolutions() {
        return evolutions;
    }

    public HashMap<String, Double> getRatio() {
        return ratio;
    }

    public List<String> getEggGroup() {
        return eggGroup;
    }

    public List<String> getSpecies() {
        return species;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWeight() {
        return weight;
    }

    public String getDescription() {
        return description;
    }

    public JsonNode getMoves() {
        return moves;
    }
}
