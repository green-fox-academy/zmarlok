//Write a function that takes a filename as a parameter.
//Return the most common character of the file's content.
//If the file does not exist throw an exception with the following message:
//"File does not exist!"

package mostcommoncharacter;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class Main{

    public static void main(String[] args) {


    mostCommonChar();


    }
    public static void mostCommonChar() {

        ArrayList<String> contentOfFile = new ArrayList<>();

            try {
                Path filePath = Paths.get("./exam-trial-basics/countchar.txt");
                contentOfFile.addAll(Files.readAllLines(filePath));

                ArrayList<Charcounter> charsOfContent = new ArrayList<>();

                for (int i = 0; i <contentOfFile.size() ; i++) {
                    contentOfFile.toString().charAt(i);
                }
                // System.out.println(contentOfFile.toString());

            }catch (Exception ex) {
                System.out.println("File does not exist!");
            }

    }
}

