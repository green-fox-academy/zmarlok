// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8

import java.util.Scanner;

public class _33_guess_the_number {

    public static void main(String[] args) {

        System.out.println("Guess my number");
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();


        int myNumber = 8; // the number, what should be guessed

         if (userNumber == myNumber) {
            System.out.println("You found the number: " + myNumber);
        } else if (userNumber < myNumber) {
            System.out.println("The tried number is lower");

        } else if (userNumber > myNumber) {
            System.out.println("The tried number is higher");
        }
    }
}




