import java.util.ArrayList;
import java.util.Arrays;

public class SolarSystem {
    public static void main(String... args) {
        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune"));

        System.out.println("Missing Saturn: " + planetList);

        // Saturn is missing from the planetList
        // Insert it into the correct position
        // Create a method called putSaturn() which has list parameter and returns the correct list.

        // planetList.set(5, "Saturn");
        // System.out.println("With Saturn: " + planetList);
        //System.out.println(putSaturn(planetList));
        // Expected output: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"

        planetList.add(5, "Saturn");
        System.out.println("With Saturn:" + planetList);

    }
}




    /* Practicing the for cycle:

        String[] planetArray = planetList.toArray(new String[planetList.size() + 1]);
        planetArray[5] = "Saturn";
        planetArray[6] = "Uranus";
        planetArray[7] = "Neptune";

        for (int i = 0; i < planetArray.length ; i++) {
            System.out.print(planetArray[i] + " ");
        }


    }
} */