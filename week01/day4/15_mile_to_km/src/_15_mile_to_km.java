import java.util.Scanner;

public class _15_mile_to_km {
    public static void main(String[] args) {

        System.out.println("Please enter a distance in miles: ");
        Scanner scanner = new Scanner(System.in);
        String userInput1 = scanner.nextLine();

        int i = Integer.parseInt(userInput1);
        double convRate = 1.609344;


        // Write a program that asks for an integer that is a distance in miles,
        // then it converts that value to kilometers and prints it

         System.out.println("The finish is " + i * convRate + "km away.");

}
}
