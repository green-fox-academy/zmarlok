// Write a method that joins the two lists by matching one girl with one boy into a new list
// If someone has no pair, he/she should be the element of the list too
// Exepected output: "Eve", "Joe", "Ashley", "Fred"...


import java.util.ArrayList;
import java.util.Arrays;

public class Matchmaking {
    public static void main(String... args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));

        ArrayList<String> makingMatches = new ArrayList<>();

        for (int i = 0; i < boys.size(); i++) {
            if (i < girls.size()) {
                makingMatches.add(girls.get(i));
            }
            if (i < boys.size()) {
                makingMatches.add(boys.get(i));
            }
        }
        System.out.println(makingMatches.toString());

    }
}
