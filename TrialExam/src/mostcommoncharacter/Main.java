//Write a function that takes a filename as a parameter.
//Return the most common character of the file's content.
//If the file does not exist throw an exception with the following message:
//"File does not exist!"

package mostcommoncharacter;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main{

    public static void main(String[] args) {


    mostCommonChar();


    }
    public static void mostCommonChar() {

            try {
                Path filePath = Paths.get("./exam-trial-basics/countchar.txt");
                ArrayList<String> contentOfFile = new ArrayList<>();
                contentOfFile.addAll(Files.readAllLines(filePath));
                String abc = contentOfFile.toString();
                System.out.println(abc);

                String characters = "";




                ArrayList<Character> charsOfContent = new ArrayList<>();

                for (int i = 0; i <abc.length() ; i++) {
                    System.out.println(abc.charAt(i));
                }
                // System.out.println(contentOfFile.toString());

            }catch (Exception ex) {
                System.out.println("File does not exist!");
            }

    }
}

