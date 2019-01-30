//Create a PostIt class that has
//a backgroundColor
//a text on it
//a textColor
//Create a few example post-it objects:
//an orange with blue text: "Idea 1"
//a pink with black text: "Awesome"
//a yellow with green text: "Superb!"

package postit;

public class PostIt {
    static int numberOfPostIts;

    String backgroundColor;
    String text;
    String textColor;

    public PostIt() {
        numberOfPostIts++;
    }
    /*public PostIt(String backgroundColor, String text, String textColor) {
        this.backgroundColor = backgroundColor;
        this.text = text;
        this.textColor = textColor;
    } */

    public void showPostIt(){
        System.out.println("The background color of the post it is: " + backgroundColor);
        System.out.println("It shows the following text: " + text);
        System.out.println("And the color of the text is: " + textColor + "\n");


    }
}