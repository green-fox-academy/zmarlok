/*Create an array variable named `t`
  with the following content: `[1, 2, 3, 4, 5]`
- Increment the third element
- Print the third element */

public class _10_Increment_element {
    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5};

        t[2] += 1;

        System.out.println("The third element is: " + t[2]);

    }
}
