// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was


import java.util.Scanner;

public class _29_draw_pyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many lines high will be the pyramid?");
        int pyramidLines = scanner.nextInt();

        for (int i = 0; i < pyramidLines; i++) {
            for (int j = 1; j <= pyramidLines -i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
