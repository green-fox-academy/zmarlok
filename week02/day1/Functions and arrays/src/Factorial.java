//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial

import java.util.Scanner;

public class Factorial {

   public static void main(String[] args) {

       System.out.println("F A C T O R I O \n--------------- \nEnter your number:");
       Scanner scanner = new Scanner(System.in);
       int inputNumber = scanner.nextInt();

       factorio (inputNumber);
   }

   public static void factorio(int inputNumber){

        int factorialOfInput = 1;

        for (int i = 1; i <= inputNumber ; i++) {
            factorialOfInput= factorialOfInput*i;
        }
       System.out.println("The factorial of your number is: " + factorialOfInput);



    }
}
