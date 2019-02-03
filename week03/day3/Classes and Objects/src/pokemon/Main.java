//Every pokemon has a name and a type. Certain types are effective against others, e.g. water is effective against fire.
//
//You have a Pokemon class with a method called isEffectiveAgainst().
//
//Ash has a few pokemon. Help Ash decide which Pokemon to use against the wild one.
//
//You can use the already created pokemon files.

package pokemon;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pokemon> pokemonOfAsh = initializePokemons();

        // Every pokemon has a name and a type.
        // Certain types are effective against others, e.g. water is effective against fire.

        // Ash has a few pokemon.
        // A wild pokemon appeared!

        Pokemon wildPokemon = new Pokemon("Oddish", "leaf", "water");

        // Which pokemon should Ash use?


        String effectivePokemon = "OMG, you don't have any Pokemon, which is effective against the wild one";

        for (Pokemon pokemon:   // search for pokemon : in pokemonOfAsh arraylist
             pokemonOfAsh) {
            if(pokemon.isEffectiveAgainst(wildPokemon)){
                effectivePokemon = pokemon.name;
                break;         // this will stop at the first correct item, if there is no break, it will give back the last correct item
            }

        }

        System.out.print("I choose you, " + effectivePokemon);
    }


    private static List<Pokemon> initializePokemons() {
        List<Pokemon> pokemon = new ArrayList<>();

        pokemon.add(new Pokemon("Balbasaur", "leaf", "water"));
        pokemon.add(new Pokemon("Pikatchu", "electric", "water"));
        pokemon.add(new Pokemon("Charizard", "fire", "leaf"));
        pokemon.add(new Pokemon("Balbasaur", "water", "fire"));
        pokemon.add(new Pokemon("Kingler", "water", "fire"));

        return pokemon;
    }

}