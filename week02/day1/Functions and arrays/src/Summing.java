//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer

import java.util.Scanner;

public class Summing {

    public static void main(String[] args) {

        System.out.println("How many numbers do you would like to sum? ");
        Scanner scanner = new Scanner(System.in);
        int amountOfNumbers = scanner.nextInt();



        sum(amountOfNumbers);
    }
    public static void sum(int amountOfNumbers){

        Scanner numberScanner = new Scanner(System.in);
        int sumOfnumbers = 0;

        for (int i = 0; i <amountOfNumbers ; i++) {
            System.out.println("Enter your " + (i + 1) + ". number: ");
            sumOfnumbers += numberScanner.nextInt();
        }
        System.out.println("The sum of the entered numbers is: " + sumOfnumbers);

    }
}
