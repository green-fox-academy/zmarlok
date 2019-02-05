// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

package numberadder;

public class Main {

    public static void main(String[] args) {

        int result = addOneUntilThisNumber(3);
        System.out.println(result);
    }

    public static int addOneUntilThisNumber(int n){
        if(n > 0){
            return n+addOneUntilThisNumber(n-1);
            //addOneUntilThisNumber(n-1);
        }
        return 0;
    }
}
