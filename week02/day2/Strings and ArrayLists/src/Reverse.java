import java.util.ArrayList;

public class Reverse {
    public static void main(String... args) {
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.

        //solution one with ArrayList
        ArrayList<String> revertedSentence = new ArrayList<>();

        for (int i = reversed.length() - 1; i >= 0; i--) {
            //reversedString.add(reversed.charAt(i));

            revertedSentence.add(Character.toString(reversed.charAt(i)));
        }

        for (int i = 0; i < revertedSentence.size(); i++) {
            System.out.print(revertedSentence.get(i));
        }

        //solution two

        String correctedSentence = "";

        for (int i = 0; i < reversed.length() ; i++) {
            correctedSentence += reversed.charAt(i);
        }
        System.out.println(correctedSentence);

    }
}