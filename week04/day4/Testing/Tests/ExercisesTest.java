import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ExercisesTest {

    @Test // Apples test
    public void getApple_test() {
        Apples apple = new Apples();
        String actualInput = apple.getApple("apple");
        assertEquals("apple", actualInput);
    }

    @Test
    public void sumOfNumbers_EmptyArray(){
        ArrayList<Integer>emptyArrayList = new ArrayList<Integer>();
        Sum emptyArray = new Sum();

        emptyArray.sumOf(emptyArrayList);
        int sum = emptyArray.sumOf(emptyArrayList);
        assertEquals((Integer)0, (Integer)sum);
    }

    @Test
    public void sumOfNumbers_OneElementArray(){
        ArrayList<Integer>oneElementArray = new ArrayList<Integer>();
        int element = 2;
        oneElementArray.add(element);

        Sum oneElement = new Sum();
        oneElement.sumOf(oneElementArray);
        int sum = oneElement.sumOf(oneElementArray);
        assertEquals((Integer)2, (Integer)sum);
    }

    @Test
    public void sumOfNumbers_MultipleElementArray(){
        ArrayList<Integer>multipleElementarray = new ArrayList<Integer>();
        int elementOne = 2;
        int elementTwo = 3;
        int elementThree = 5;
        int elementFour = (-3);

        multipleElementarray.add(elementOne);
        multipleElementarray.add(elementTwo);
        multipleElementarray.add(elementThree);
        multipleElementarray.add(elementFour);

        Sum multipleElementTest = new Sum();
        int sum = multipleElementTest.sumOf(multipleElementarray);
        assertEquals((Integer)7, (Integer)sum);
    }

    @Test (expected = NullPointerException.class)
    public void sumOfNumbers_nullTest(){

        Sum nullTest = new Sum();
        int sum = nullTest.sumOf(null);
    }

    @Test
    public void isAnagram_RandomTest() {
        Anagram testAnagram = new Anagram();
        String word1 = "alma";
        String word2 = "lmaa";
        char[] word1Chars = word1.replaceAll("[\\s]", "").toCharArray();
        char[] word2Chars = word2.replaceAll("[\\s]", "").toCharArray();
        Arrays.sort(word1Chars);
        Arrays.sort(word2Chars);
        System.out.println(word1Chars);
        System.out.println(word2Chars);

        System.out.println(testAnagram.isAnagram(word1,word2));
        assertEquals(true, testAnagram.isAnagram(word1,word2));
    }
}
