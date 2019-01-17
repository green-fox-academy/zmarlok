import java.util.Scanner;

public class _14_hello_user {
    public static void main(String[] args) {
        System.out.println("Please enter your user name: ");
        Scanner scanner = new Scanner(System.in);
        String userInput1 = scanner.nextLine();

                    // Modify this program to greet user instead of the World!
            // The program should ask for the name of the user
            System.out.println("Hello, " + userInput1 + "!" );
        }

}
