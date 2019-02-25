package exercise06;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Write a Stream Expression to find the uppercase characters in a string!

        String testString = "MaNyUppErCaSeLetteRS";

        ArrayList<Character> characterList = new ArrayList<Character>();
        for (char c : testString.toCharArray()) {
            characterList.add(c);
        }

        characterList.stream()
                .filter(Character::isUpperCase)
                .forEach(System.out::print);
    }
}
