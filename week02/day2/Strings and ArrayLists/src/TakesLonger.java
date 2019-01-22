import java.util.ArrayList;
import java.util.Arrays;

public class TakesLonger {
    public static void main(String... args){
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        String quotePart1 = quote.substring(0,20);
        String quotePart2 = quote.substring(21, quote.length());


        String missingPart = " always takes longer than ";
        String newQuote = (quotePart1 + missingPart + quotePart2);
        System.out.println(newQuote);
    }
}
