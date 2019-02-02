
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
public class DrawDiagonal {
    public static void main(String[] args) {

        System.out.println("Please enter a number:");
        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < lines; j++) {
                if (i == 0 | i == lines-1) {
                    System.out.print('%');
                }
                else {
                    if (j == 0 | j == lines - 1 | j == i) {
                        System.out.print('%');
                    }
                    else {
                        System.out.print(' ');
                    }
                }
            }
            System.out.println();
        }
    }
}
