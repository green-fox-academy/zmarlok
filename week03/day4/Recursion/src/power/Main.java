// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

package power;

public class Main {

    public static void main(String[] args) {

        int base = 5;
        int pow = 2;
        int resultOfPower = power(base, pow);
        System.out.println(base + "^" + pow + " = " + resultOfPower);

    }

    public static int power(int baseNum, int powNum) {
        if (powNum != 0) {
            return (baseNum * power(baseNum, powNum - 1));
        } else {
            return 1;
        }

    }
}

