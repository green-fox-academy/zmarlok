import java.util.Scanner;

public class _21_party_indicator {
    public static void main(String[] args) {
// Write a program that asks for two numbers
// The first number represents the number of girls that comes to a party, the
// second the boys
// It should print: The party is excellent!
// If the the number of girls and boys are equal and 20 or more people are coming to the party
//
// It should print: Quite cool party!
// If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
//
// It should print: Average party...
// If there are less people coming than 20
//
// It should print: Sausage party
// If no girls are coming, regardless the count of the people

        System.out.println("How many girls are coming to the party? ");
        Scanner scanner = new Scanner(System.in);
        int countGirls = Integer.parseInt(scanner.nextLine());

        System.out.println("How many boys are coming to the party? ");
        Scanner scanner2 = new Scanner(System.in);
        int countBoys = Integer.parseInt(scanner2.nextLine());

        int countTotal = countBoys + countGirls; // represents the total number of the attendees

        if (countTotal >= 20 && countBoys == countGirls) {
            System.out.println("The party is excellent!11");

        } else if (countTotal >= 20 && countBoys != countGirls) {
            System.out.println("Quite cool party");


        } else if (countTotal < 20 && countGirls != 0) {
            System.out.println("Average party...");

        } else if (countGirls == 0) {
            System.out.println("Sausage party...");
        }
    }
}


