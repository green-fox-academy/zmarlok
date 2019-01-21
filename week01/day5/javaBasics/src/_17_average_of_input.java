// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4
import java.util.Scanner;

public class _17_average_of_input {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        int userInput1 = scanner.nextInt();

        System.out.println("Enter your second number: ");
        int userInput2 = scanner.nextInt();

        System.out.println("Enter your third number: ");
        int userInput3 = scanner.nextInt();

        System.out.println("Enter your fourth number: ");
        int userInput4 = scanner.nextInt();

        System.out.println("Enter your fifth number: ");
        int userInput5 = scanner.nextInt();

       float avg = (userInput1 + userInput2 + userInput3 + userInput4 + userInput5) / 5;
       int sum = (userInput1 + userInput2 + userInput3 + userInput4 + userInput5);

        System.out.println("Sum: " + sum + " Average: " + avg);
    }
}
