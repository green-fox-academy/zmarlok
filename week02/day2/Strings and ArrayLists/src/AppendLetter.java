import java.util.*;

public class AppendLetter{
    public static void main(String... args) {
        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.
        appendA(far);

    }
    public static void appendA(List<String> listWithoutA){

        ArrayList<String> listWithA = new ArrayList<>();

        for (int i = 0; i < listWithoutA.size() ; i++) {
            listWithA.add(listWithoutA.get(i) + "a");
        }
        System.out.println(listWithA);
    }
}

// The output should be: "boa", "anaconda", "koala", "panda", "zebra"