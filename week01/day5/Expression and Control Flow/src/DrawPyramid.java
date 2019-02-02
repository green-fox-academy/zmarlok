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

public class DrawPyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many lines high will be the pyramid?");
        int lines = scanner.nextInt();

       for (int i = 0; i < lines; i++)
        {
            for (int j = 0; j < lines-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
        System.out.println();
        }
    }
}
//          for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5 - i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k <= i; k++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//
//Read more: http://www.java67.com/2015/10/how-to-print-pyramid-pattern-in-java-example.html#ixzz5eNF0kpd0

