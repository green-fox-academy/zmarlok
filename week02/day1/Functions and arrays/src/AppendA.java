//  Create the usual class wrapper
//  and main method on your own.

// - Create a string variable named `typo` and assign the value `Chinchill` to it
// - Write a function called `appendAFunc` that gets a string as an input,
//   appends an 'a' character to its end and returns with a string
//
// - Print the result of `appendAFunc(typo)`

public class AppendA {

    static String typo = "Chinchill";

    public static void main(String[] args) {
        appendAFunc("a");
    }

    public static void appendAFunc(String a){
        System.out.println(typo + a);

    }
}
