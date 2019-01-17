public class _08_swap {
    public static void main(String[] args) {
        // Swap the values of the variables
        int a = 123;
        int b = 526;

        int temp = a;
        a = b;
        b = temp;
        // Added a temporary integer

        System.out.println(a);
        System.out.println(b);
    }
}
