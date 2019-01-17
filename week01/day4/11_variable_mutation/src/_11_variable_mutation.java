import com.sun.deploy.util.StringUtils;

public class _11_variable_mutation {
    public static void main(String[] args) {
        int a = 3;
        // make the "a" variable's value bigger by 10
        a = a + 10;

        System.out.println(a);

        int b = 100;
        // make b smaller by 7
        b = b - 7;

        System.out.println(b);

        int c = 44;
        // please double c's value
        c = c * 2;

        System.out.println(c);

        int d = 125;
        // please divide by 5 d's value
        d = 125 / 5;

        System.out.println(d);

        int e = 8;
        // please cube of e's value
        e = e * e * e;

        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)

        boolean biggerThanF2 = f1 > f2;
        System.out.println("f1 is bigger than f2. This statement is " + biggerThanF2);

        int g1 = 350;
        int g2 = 200;
        // tell if the double of g2 is bigger than g1 (print as a boolean)
        boolean biggerThanG1 = (g2 * 2) > g1;
        System.out.println("The double of g2 is bigger than g1. This statement is " + biggerThanG1);

        int h = 135798745;
        // tell if it has 11 as a divisor (print as a boolean)
        boolean divisorOfH = h % 11 == 0;
            System.out.println("11 is a divisor of h. This statement is " + divisorOfH);


        int i1 = 10;
        int i2 = 3;
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
        int squareI2 = (int) Math.pow(i2, 2);
        int cubedI2 = (int) Math.pow(i2, 3);
        boolean compareI1AndI2 = i1 > squareI2 && i1 < cubedI2;
        System.out.println("i1 is higher than i2 squared and smaller than i2 cubed. This statement is " + compareI1AndI2);

        int j = 1521;
        // tell if j is dividable by 3 or 5 (print as a boolean)
        boolean inspectJ = j % 3 == 0 || j % 5 == 0;
        System.out.println("j is dividable by 3 or 5 without remainder. This statement is " +inspectJ);

        String k = "Apple";
        //fill the k variable with its content 4 times
        k = k + k + k + k;

        System.out.println(k);
    }
}
