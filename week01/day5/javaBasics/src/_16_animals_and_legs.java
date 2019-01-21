// Write a program that asks for two integers
// The first represents the number of chickens the farmer has
// The second represents the number of pigs owned by the farmer
// It should print how many legs all the animals have
import java.util.Scanner;

public class _16_animals_and_legs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many chickens do you have?");
                int userInput1 = scanner.nextInt();

        System.out.println("How many pigs do you have?");
                int userInput2 = scanner.nextInt();

        int legs  = (userInput1 * 2) + (userInput2 *4);
        System.out.println("These animals have overall " + legs + " legs.");

    }
}
