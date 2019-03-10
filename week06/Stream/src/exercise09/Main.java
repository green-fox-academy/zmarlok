package exercise09;

import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        //Write a Stream Expression to find the frequency of characters in a given string!

        String randomString = "asfélsakfésamcésamcpieacméaeéceao";

        Map<Character, Long> frequencyOfCharacters = randomString.chars()
                .mapToObj(x -> (char) x)
                .filter(x -> !x.equals(' '))
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        System.out.println(frequencyOfCharacters.toString());
    }
}
