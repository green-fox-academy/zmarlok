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


      /*  arrayList.set(1, "Croissant");
        arrayList.set(3, "Ice cream");

        System.out.println(arrayList); */
        ArrayList<Object> correctedSweets = sweets(arrayList);
        System.out.println(correctedSweets.toString());
        System.out.println(arrayList.toString());
        }

    public static ArrayList<Object> sweets(ArrayList<Object> sweetsList){

        ArrayList<Object> lista = new ArrayList<Object>();

        for (int i = 0; i <sweetsList.size() ; i++) {
            if (sweetsList.get(i).equals(2)){
                sweetsList.set(i, "Croissant");
            }else if (sweetsList.get(i).equals(false)){
                sweetsList.set(i, "Ice Cream");
            }
            lista.add(sweetsList.get(i));
        }

        return lista;

    }
        //System.out.println(sweets(arrayList));
        // Expected output: "Cupcake", "Croissant", "Brownie", "Ice cream"
}

