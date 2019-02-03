import java.lang.reflect.Array;
import java.util.*;

public class QuoteSwap{
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
        // Create a method called quoteSwap().

        // Also, print the sentence to the output with spaces in between.
        System.out.println(quoteSwap(list));
        // Expected output: "What I cannot create I do not understand."

    }
    public static String quoteSwap(ArrayList<String> list){

        int placeOfDo = list.indexOf("do");
        int placeOfCannot = list.indexOf("cannot");

        list.set(placeOfCannot, "do");
        list.set(placeOfDo, "cannot");
        
        return list.toString();



       // listToSwap.set(copyList.indexOf("do"), "cannot");
      //  listToSwap.set(copyList.indexOf("cannot"), "do");


    }
}