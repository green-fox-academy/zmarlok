// - Create an array variable named `numList`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Double all the values in the array

public class _13_Double_items {

    public static void main(String[] args) {

        int[] numlist = {3, 4, 5, 6, 7};

        for (int i = 0; i <numlist.length ; i++) {
            System.out.print((numlist[i]*2) + " "); // prints the value, which is set to its double

        }
    }
}
