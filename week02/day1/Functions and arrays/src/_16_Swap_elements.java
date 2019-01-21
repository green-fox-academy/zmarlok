// - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`

public class _16_Swap_elements {

    public static void main(String[] args) {

        String[] abc = {"first", "second", "third"};

        String temp = "third";
        abc[2] = abc[0];
        abc[0] = temp;

        for (int i = 0; i < abc.length; i++) {
            System.out.print(abc[i] + " ");

        }
    }
}
