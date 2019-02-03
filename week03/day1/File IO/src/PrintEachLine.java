// Write a program that opens a file called "my-file.txt", then prints
// each line from the file.
// If the program is unable to read the file (for example it does not exist),
// then it should print the following error message: "Unable to read file: my-file.txt"

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class PrintEachLine {
    public static void main(String[] args) {

        try {
            Path path = Paths.get("my-file.txt");
            Files.readAllLines(path);
        } catch (IOException IOex) {
            System.err.println("Unable to read file: my-file.txt");
        }

    }
}
