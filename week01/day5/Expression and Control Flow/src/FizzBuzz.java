// Write a program that prints the numbers from 1 to 100.
// But for multiples of three print “Fizz” instead of the number
// and for the multiples of five print “Buzz”.
// For numbers which are multiples of both three and five print “FizzBuzz”.

public class FizzBuzz {
    public static void main(String[] args) {

        /* A solution with WHILE
            int a = 0;
            while (a <= 99) {

            a += 1;
            if (a % 3 == 0) {
                System.out.println("Fizz");
            } else if (a % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(a);
            }
        } */

        for (int i = 0; i <101 ; i++) {
            if (i % 3 == 0 && i %5 == 0) {
                System.out.println("Fizz-Buzz");
            } else if (i % 3 ==0){
                System.out.println("Fizz");
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }


        }
    }
}
