// - Create an array variable named `animals`
//   with the following content: `["koal", "pand", "zebr"]`
// - Add all elements an `"a"` at the end

public class _15_Append_A_array {

    public static void main(String[] args) {
        String[] animals= {"koal", "pand", "zebr"};

        for (int i = 0; i <animals.length ; i++) {
            System.out.println(animals[i] + "a");

        }

    }
}
