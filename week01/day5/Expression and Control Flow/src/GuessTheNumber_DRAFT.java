//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Scanner;
public class GuessTheNumber_DRAFT {


    public static void main(String[] args) {
        System.out.println("Guess my number");
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();
        int myNumber = 8;
        if (userNumber == myNumber) {
            System.out.println("You found the number: " + myNumber);
        } else if (userNumber < myNumber) {
            System.out.println("The tried number is lower");
        } else if (userNumber > myNumber) {
            System.out.println("The tried number is higher");
        }

    }
}