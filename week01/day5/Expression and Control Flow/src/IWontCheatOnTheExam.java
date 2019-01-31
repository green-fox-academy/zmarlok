// Create a program that writes this line 100 times:
// "I won't cheat on the exam!"

public class IWontCheatOnTheExam {

    public static void main(String[] args) {
        int a = 0;
        while (a <= 99) {
            System.out.println("I won't cheat on the exam!");
            // System.out.println(a + 1);
            a += 1;
        }
    }
}