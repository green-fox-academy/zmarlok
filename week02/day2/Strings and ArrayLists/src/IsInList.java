
import java.util.*;

public class IsInList{
    public static void main(String... args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));

        // Check if list contains all of the following elements: 4,8,12,16
        // Create a method that accepts list as an input
        // it should return "true" if it contains all, otherwise "false"
        System.out.println(checkNums(list));
    }
    public static Boolean checkNums (ArrayList<Integer> inspectedList){

        ArrayList<Integer> checkTheseNums = new ArrayList<>(Arrays.asList(4,8,12,16,21));

            if (inspectedList.containsAll(checkTheseNums)){
                return true;
            }
            else {
                return false;
            }
    }
}

