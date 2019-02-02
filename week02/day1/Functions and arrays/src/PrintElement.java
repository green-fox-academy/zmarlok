// - Create an array variable named `numbers`
//   with the following content: `[4, 5, 6, 7]`
// - Print all the elements of `numbers`

import java.util.Arrays;

public class PrintElement {


    public static void main(String[] args) {

        int[] numbers = {4, 5, 6, 7};

        //prints out the elements with the brackets
        System.out.println(Arrays.toString(numbers));

        //prints out the elements without the brackets
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}