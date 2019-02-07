// Create a sum method in your class which has an ArrayList of Integers as parameter
//    It should return the sum of the elements in the list
//    Follow these steps:
//        Add a new test case
//        Instantiate your class
//        create a list of integers
//        use the assertEquals to test the result of the created sum method
//    Run them
//    Create different tests where you test your method with:
//        an empyt list
//        a list that has one element in it
//        a list that has multiple elements in it
//        a null
//    Run them
//    Fix your code if needed

import java.util.ArrayList;

public class Sum {

    public int sumOf(ArrayList<Integer> inputList){
        if (inputList.equals(null)) {
            throw new NullPointerException();
        }
        int sum = 0;
        for (int number : inputList) {
            sum += number;
        }
        return sum;
    }
}
