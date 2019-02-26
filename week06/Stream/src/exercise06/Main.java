package exercise06;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Write a Stream Expression to find the uppercase characters in a string!

        String testString = "MaNyUppErCaSeLetteRS";

        testString.chars()
                .filter(Character::isUpperCase)
                .mapToObj(character -> (char)character)
                .forEach(System.out::print);
    }
}
