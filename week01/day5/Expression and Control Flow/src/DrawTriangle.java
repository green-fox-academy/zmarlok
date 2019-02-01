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

public class DrawTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many lines high will be the triangle?");
        int linesOfTriangle = scanner.nextInt();

        for (int linesToBeCreated = 1; linesToBeCreated <= linesOfTriangle; linesToBeCreated++) {
            for (int rowsToBeCreated = 1; rowsToBeCreated <= linesToBeCreated; rowsToBeCreated++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

