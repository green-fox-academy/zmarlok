package exercise10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//    //Create a Fox class with 3 properties (name, color, age) Fill a list with at least 5 foxes and:
//    //
//
//
//
//
public class Main {

    public static void main(String[] args) {

        List<Fox> foxes = new ArrayList<>();

        foxes.add(new Fox("Béla", "green", 2));
        foxes.add(new Fox("Sanya", "white", 8));
        foxes.add(new Fox("Petike", "yellow", 2));
        foxes.add(new Fox("Lujza", "red", 3));
        foxes.add(new Fox("Wilson", "green", 5));

//    Write a Stream Expression to find the foxes with green color!
        List<Fox>greenFoxes = foxes.stream()
                .filter(fox -> fox.getColor() == "green")
                .collect(Collectors.toList());

        for (int i = 0; i < greenFoxes.size(); i++) {
            System.out.println(greenFoxes.get(i).getName());
        }
//    Write a Stream Expression to find the foxes with green color, and age less then 5 years!
        List<Fox>youngGreenFoxes = foxes.stream()
                .filter(fox -> fox.getColor() == "green" && fox.getAge()<5)
                .collect(Collectors.toList());

        for (int i = 0; i < youngGreenFoxes.size(); i++) {
            System.out.println(youngGreenFoxes.get(i).getName());
        }
//    Write a Stream Expression to find the frequency of foxes by color!

        Map<String, Long> frequencyOfFoxes = foxes.stream()
                .collect(Collectors.groupingBy(fox -> fox.getColor(), Collectors.counting()));
        System.out.println(frequencyOfFoxes);







    }
}
