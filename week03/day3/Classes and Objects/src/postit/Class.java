//Create a PostIt class that has
//a backgroundColor
//a text on it
//a textColor
//Create a few example post-it objects:
//an orange with blue text: "Idea 1"
//a pink with black text: "Awesome"
//a yellow with green text: "Superb!"
package postit;

public class Class {

    public static void main(String[] args){

        PostIt firstPostIt = new PostIt();
        firstPostIt.textColor = "blue";
        firstPostIt.text =  "Idea 1";
        firstPostIt.backgroundColor = "orange";
        firstPostIt.showPostIt();

        PostIt secondPostIt = new PostIt();
        secondPostIt.textColor = "black";
        secondPostIt.text = "Awesome";
        secondPostIt.backgroundColor = "Superb!";
        secondPostIt.showPostIt();

        PostIt thirdPostIt = new PostIt();
        thirdPostIt.textColor = "green";
        thirdPostIt.text = "Superb!";
        thirdPostIt.backgroundColor = "yellow";
        thirdPostIt.showPostIt();

        System.out.println("I have now " + PostIt.numberOfPostIts + " post its.");

    }

}