// Create a function that takes 3 parameters: a path, a word and a number
// and is able to write into a file.
// The path parameter should be a string that describes the location of the file you wish to modify
// The word parameter should also be a string that will be written to the file as individual lines
// The number parameter should describe how many lines the file should have.
// If the word is 'apple' and the number is 5, it should write 5 lines
// into the file and each line should read 'apple'
// The function should not raise any errors if it could not write the file.

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class _05_WriteMultipleLines {
    public static void main(String[] args) {


        System.out.println("Please enter a string:");
        Scanner scannerWord = new Scanner(System.in);
        String word = scannerWord.next();

        System.out.println("Please, enter how many lines do you want?");
        Scanner scannerNumber = new Scanner(System.in);
        int lines = scannerNumber.nextInt();


        try {
            Path path = Paths.get("MultipleLines.txt");
            ArrayList<String> newLine = new ArrayList<>();

            for (int i = 0; i < lines; i++) {

                newLine.add(word);
            }
            Files.write(path, newLine);

        } catch (Exception ex) {
                    }
    }
}