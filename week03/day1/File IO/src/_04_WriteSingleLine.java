// Write a function that is able to manipulate a file
// By writing your name into it as a single line
// The file should be named "my-file.txt"
// In case the program is unable to write the file,
// It should print the following error message: "Unable to write file: my-file.txt"

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class _04_WriteSingleLine {
    public static void main(String[] args) {
        List<String> firstLine = new ArrayList();
        firstLine.add("Zoltan Marlok");
        try {
            Path filePath = Paths.get("my-file.txt");
            Files.write(filePath, firstLine);
            System.out.println("New file created with following content: " + firstLine);
        } catch (Exception e) {
            System.out.println("Unable to write file: my-file.txt");
        }



    }
}
