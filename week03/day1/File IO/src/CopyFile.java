// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

// NEEDS TO BE UPDATED, TO RETURN THE BOOLEAN???

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class CopyFile {

    public static void main(String[] args) {


        System.out.println("Please enter an existing filename: ");
        Scanner currentFile = new Scanner(System.in);
        String fileNameToCopy = currentFile.next();

        System.out.println("Please enter a new filename for the copy: ");
        Scanner newFile = new Scanner(System.in);
        String newFileName = newFile.next();

        isCopyDone(fileNameToCopy, newFileName);

    }
    public static boolean isCopyDone(String fileToCopy, String newFile) {

        Path filePath = Paths.get(fileToCopy);// Paths.get("FileToBeCopied.txt");
        Path newFilePath = Paths.get(newFile);

        try {
            ArrayList<String> contentToBeCopied = new ArrayList<>();
            contentToBeCopied.addAll(Files.readAllLines(filePath));
            Files.write(newFilePath, contentToBeCopied);
            return true;


        } catch (Exception ex) {
            System.err.println("File can not be copied");
            return false;

        }
    }
}






