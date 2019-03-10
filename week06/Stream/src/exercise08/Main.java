package exercise08;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {

    //Write a Stream Expression to concatenate a Character list to a string!
    public static void main(String[] args) {

        List<Character> characterList = Arrays.asList('w', 'o', 'r', 'd');

        String charactersToString = characterList.stream()
                .map(Objects::toString)
                .collect(Collectors.joining());

        System.out.println(charactersToString);
    }
}
