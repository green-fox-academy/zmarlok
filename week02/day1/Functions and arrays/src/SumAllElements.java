// - Create an array variable named `ai`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Print the sum of the elements in `ai`

public class SumAllElements {

    public static void main(String[] args) {

        int[] ai = {3, 4, 5, 6, 7};

        //solution with for loop
        int sumOfAi = 0;
        for (int i = 0; i <ai.length ; i++) {
            sumOfAi += ai[i];
        }
        System.out.println(sumOfAi);

        //solution with for each loop
        int sumOfAi2 = 0;
        for (int elementOfAi: ai) {
            sumOfAi2 += elementOfAi;
        }
        System.out.println(sumOfAi2);
    }
}
