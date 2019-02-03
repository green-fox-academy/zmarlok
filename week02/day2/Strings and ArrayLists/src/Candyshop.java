import java.util.ArrayList;

public class Candyshop{
    public static void main(String... args){
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("Cupcake");

        arrayList.add("Brownie");
        arrayList.add(false);
        arrayList.add(2);


        // Accidentally we added "2" and "false" to the list.
        // Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
        // No, don't just remove the lines
        // Create a method called sweets() which takes the list as a parameter.

        // Expected output: "Cupcake", "Croissant", "Brownie", "Ice cream"
        System.out.println(sweets(arrayList));

    }

    public static String sweets(ArrayList<Object> sweetsList) {

        ArrayList<Object> lista = new ArrayList<Object>();

        for (int i = 0; i < sweetsList.size(); i++) {
            if (sweetsList.get(i).equals(2)) {
                sweetsList.set(i, "Croissant");
            } else if (sweetsList.get(i).equals(false)) {
                sweetsList.set(i, "Ice Cream");
            }
            lista.add(sweetsList.get(i));
        }
        return lista.toString();
    }
}

