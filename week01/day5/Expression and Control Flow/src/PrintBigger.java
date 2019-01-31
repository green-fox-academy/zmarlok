// Write a program that asks for two numbers and prints the bigger one

import java.util.Scanner;
public class PrintBigger {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your 1st number to compare: ");
        int userInput1 = scanner.nextInt();

        System.out.println("Enter your 2nd number to compare: ");
        int userInput2 = scanner.nextInt();

        if (userInput1 > userInput2) {
            System.out.println(userInput1 + " is bigger");
        } else
            System.out.println(userInput2 + " is bigger");
    }
}
