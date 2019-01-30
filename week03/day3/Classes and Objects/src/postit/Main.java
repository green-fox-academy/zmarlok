//Create a PostIt class that has
//a backgroundColor
//a text on it
//a textColor
//Create a few example post-it objects:
//an orange with blue text: "Idea 1"
//a pink with black text: "Awesome"
//a yellow with green text: "Superb!"
package postit;

public class Main {

    public static void main(String[] args){

        PostIt firstPostIt = new PostIt();
        firstPostIt.textColor = "blue";
        firstPostIt.text =  "Idea 1";
        firstPostIt.backgroundColor = "orange";
        firstPostIt.showPostIt();

        PostIt secondPostIt = new PostIt("black", "Awesome", "pink");
        secondPostIt.showPostIt();

        PostIt thirdPostIt = new PostIt("green", "Superb!", "yellow");
        thirdPostIt.showPostIt();

        PostIt fourthPostIt = new PostIt("white", "content", "black");
        fourthPostIt.showPostIt();

        System.out.println("I have now " + PostIt.numberOfPostIts + " post its.");

    }

}