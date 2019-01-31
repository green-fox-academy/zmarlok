public class PrintEven {
    public static void main(String[] args) {

        /* Solution with while:
        int a = 0;

        while (a <= 501) {
            System.out.println(a);
            a += 2;

        }
         */
        // Soultion with for cycle:
        for (int i = 0; i < 501; i=i+2) {
            System.out.println(i);
        }
    }
}
