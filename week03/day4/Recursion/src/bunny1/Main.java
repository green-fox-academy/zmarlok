// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

package bunny1;

public class Main {

    public static void main(String[] args) {
        bunnyEarsCounter(2);

    }

    public static int bunnyEarsCounter(int numberOfBunnies){

        if(0 < numberOfBunnies){
            bunnyEarsCounter(numberOfBunnies-1);
            System.out.println(numberOfBunnies+numberOfBunnies);
            return numberOfBunnies;

        } return 0;
    }
}
