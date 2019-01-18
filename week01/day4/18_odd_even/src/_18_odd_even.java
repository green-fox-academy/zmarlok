import java.util.Scanner;

public class _18_odd_even {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.
        System.out.println("Please, enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int userInput1 = Integer.parseInt(scanner.nextLine());

        if (userInput1 % 2 == 0) {
            System.out.println("The given number is even");
        } else if (userInput1 % 2 != 0){
            System.out.println("The given number is odd");
        }


    }
}