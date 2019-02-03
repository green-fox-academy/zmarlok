// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
import java.io.File;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        fileNameAsString();
    }
        public static void fileNameAsString (){
            try { // Required by Files.readAllLines(filePath);
                // Reads the content from `lorem-psum.txt` in the `assets` folder line by line to a String List
                Path filePath = Paths.get("random.txt");
                ArrayList<String> lines= new ArrayList<>();
                lines.addAll(Files.readAllLines(filePath));
                //Files.readAllLines(filePath);
                System.out.println(lines.size()); // Prints out te number of lines
            } catch (Exception e) {
                System.out.println("ZERO");
            }
    }
}
