// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was

import java.util.Scanner;
public class _32_draw_diagonal {
    public static void main(String[] args) {

        System.out.println("Please enter a number:");
        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();

        for (int i = 1; i <= lines; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("");
            }
            System.out.println("");
        }


    }
}
