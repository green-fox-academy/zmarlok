// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

package numberadder;

public class Main {

    public static void main(String[] args) {
            addOneUntilThisNumber(10);
        }

        public static void addOneUntilThisNumber(int n){
            if(n > 0){
                addOneUntilThisNumber(n-1);
                System.out.println(n);

            } return;
        }
}
