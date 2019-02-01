// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4


import java.util.Scanner;

public class ParametricAverage {

    public static void main(String[] args) {
        System.out.println("How many numbers do you want to summarize and calculate theirs AVG? ");
        Scanner scanner = new Scanner(System.in);
        int amountOfInputs = scanner.nextInt();

        int inputNumbers = 0;


        for (int i = 0; i <amountOfInputs ; i++) {
            System.out.println("Please enter your " + (i+1) + ". number: ");
            inputNumbers += scanner.nextInt();
            System.out.println("Current sum: " + inputNumbers);
        }

        float avg = (float)inputNumbers / amountOfInputs;

        System.out.println("Total SUM: " + inputNumbers + "\nAVG: " + avg);
    }
}
