// Create a recursive function called `refactorio`
// that returns it's input's factorial

package refactorio;

public class Main {
    public static void main(String[] args) {

        System.out.println(factorial(5));
    }

    public static int factorial (int n){
        if (n ==0) {
            return 1;
        }else {
            return factorial(n-1) *n;
        }

    }

}
