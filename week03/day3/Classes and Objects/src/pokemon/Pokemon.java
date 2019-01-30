//Every pokemon has a name and a type. Certain types are effective against others, e.g. water is effective against fire.
//
//You have a Pokemon class with a method called isEffectiveAgainst().
//
//Ash has a few pokemon. Help Ash decide which Pokemon to use against the wild one.
//
//You can use the already created pokemon files.

package pokemon;

public class Pokemon {
    String name;
    String type;
    String effectiveAgainst;

    public Pokemon(String name, String type, String effectiveAgainst) {
        this.name = name;
        this.type = type;
        this.effectiveAgainst = effectiveAgainst;
    }

    boolean isEffectiveAgainst(Pokemon anotherPokemon) {
        return this.effectiveAgainst.equals(anotherPokemon.type);
    }
}