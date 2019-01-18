// Write a program that prints the numbers from 1 to 100.
// But for multiples of three print “Fizz” instead of the number
// and for the multiples of five print “Buzz”.
// For numbers which are multiples of both three and five print “FizzBuzz”.

public class _27_fizz_buzz {
    public static void main(String[] args) {
        int a = 0;
        while (a <= 99) {
            a += 1;
            if (a % 3 == 0) {
                System.out.println("Fizz");
            } else if (a % 5 == 0) {
                System.out.println("Buzz");
            } else if (a % 3 != 0 && a % 5 !=0) {
                System.out.println(a);
            }
        }
    }
}
