import java.util.ArrayList;
import java.util.Arrays;

public class Matchmaking {
    public static void main(String... args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));

        // ArrayList<String> makingMatches = new ArrayList<>();

        String[] girlsArray = girls.toArray(new String[girls.size() + 1]);
        String[] boysArray = boys.toArray(new String[boys.size()]);

        for (int i = 0; i < girlsArray.length; i++) {

            if (girlsArray[i] == null){
                girlsArray[i] = "";
            } else
                girlsArray[i] = girlsArray[i];
            System.out.println(i + " " + girlsArray[i] + ", "+ boysArray[i]);


            // Write a method that joins the two lists by matching one girl with one boy into a new list
            // If someone has no pair, he/she should be the element of the list too
            // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

            // System.out.println(makingMatches(girls, boys));
        }
    }
}