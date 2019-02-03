// - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`

import java.util.Arrays;

public class SwapElements {

    public static void main(String[] args) {

        String[] abc = {"first", "second", "third"};

        String temp = "third";
        abc[2] = abc[0];
        abc[0] = temp;

        // System.out.println(Arrays.toString(abc));

        for (int i = 0; i < abc.length; i++) {
            System.out.print(abc[i] + " ");

        }
    }
}
