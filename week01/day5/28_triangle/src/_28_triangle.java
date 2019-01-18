// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was
import java.util.Scanner;

public class _28_triangle {
    public static void main(String[] args) {

        System.out.println("How many lines of asterisks shall I draw?");
        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();


        for (int i = 1; i <= lines; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
