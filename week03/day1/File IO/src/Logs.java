// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Logs {
    public static void main(String[] args) {

        getVsPostRatio();


    }
    public static void getVsPostRatio(){
        try {
            Path pathOfLog = Paths.get("log.txt");
            ArrayList<String> contentOfLog = new ArrayList<>();
            contentOfLog.addAll(Files.readAllLines(pathOfLog));

            int sumOfGETs = 0;
            int sumOfPOSTs = 0;


            for (int i = 0; i < contentOfLog.size(); i++) {
                if (contentOfLog.get(i).contains("GET")) {
                    sumOfGETs++;
                } else if (contentOfLog.get(i).contains("POST")) {
                    sumOfPOSTs++;
                }

            }
            System.out.println("The GET/POST Ratio is: " + sumOfGETs + " / " + sumOfPOSTs);

             }catch(Exception ex){
        }
    }
}
