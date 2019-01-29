// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0
import java.io.IOException;
import java.rmi.ServerError;
import java.util.Scanner;

public class _01_DivideByZero {
    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        Scanner scanner = new Scanner(System.in);

        try{
            int divisor = scanner.nextInt();
            int firstNum = 10;
            int result = firstNum / divisor;
            System.out.println("Ten divided by " + divisor + " = " + result);
        } catch (Exception ex){
            System.err.println("FAIL"); // if the user enters 0
        }


    }

}
