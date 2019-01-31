// Write a recursive function that takes one parameter: n and counts down from n.

package counter;

public class main {

    public static void main(String[] args) {
        countToZero(10);
    }

    public static void countToZero(int n){
        if(n > 0){
            System.out.println(n);
            countToZero(n-1);

        } return;
    }
}
