// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5
import java.util.Scanner;

public class _26_count_from_to {
    public static void main(String[] args) {

        System.out.println("Please enter your first number: ");
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());

        System.out.println("Please enter your second number: ");
        Scanner scanner2 = new Scanner(System.in);
        int b = Integer.parseInt(scanner2.nextLine());


        while(a < b){
            int counter = a;
            System.out.println(counter);
            a+= 1;
        }
    }
}
