//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Scanner;
public class GuessTheNumber {


    public static void main(String[] args) {
        System.out.println("Guess my number: ");
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();
        int myNumber = 8;

        while (userNumber != myNumber) {
             if (userNumber < myNumber) {
                System.out.println("The entered number is lower");
                  System.out.println("Guess my number: ");
                  userNumber = scanner.nextInt();

            } else if (userNumber > myNumber) {
                System.out.println("The entered number is higher");
                  System.out.println("Guess my number: ");
                  userNumber = scanner.nextInt();
              }
        }
        System.out.println("You are AWESOME! You found the number: " + myNumber);
    }
}