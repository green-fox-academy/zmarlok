//Write a function, that takes two strings and returns a boolean value based on if the two strings are Anagramms or not.
//            Create a test for that.


import java.util.Arrays;

public class Anagram {

    public boolean isAnagram(String stringOne, String stringTwo){
        char[] word1 = stringOne.replaceAll("[\\s]", "").toCharArray();
        char[] word2 = stringTwo.replaceAll("[\\s]", "").toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);

        return Arrays.equals(word1, word2);
    }
}
