// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

package bunny1;

public class Main {

    public static void main(String[] args) {
        int bunnies = 10;
        int ears = 2;
        int earsOfBunnies = bunnies*ears;
        bunnyEarsCounter(earsOfBunnies);
    }

    public static void bunnyEarsCounter(int n){
        if(n > 0){
            bunnyEarsCounter(n-2);
            System.out.println(n);

        } return;
    }
}
