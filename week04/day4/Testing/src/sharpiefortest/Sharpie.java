//Create Sharpie class
//
//    We should know about each sharpie their color (which should be a string), width (which will be a floating point number),
//    inkAmount (another floating point number)
//    When creating one, we need to specify the color and the width
//    Every sharpie is created with a default 100 as inkAmount
//    We can use() the sharpie objects
//        which decreases inkAmount

package sharpiefortest;

public class Sharpie {

    String color;
    float width;
    float inkAmount = 100;

    public Sharpie(String color, float width){
        this.inkAmount = inkAmount;
        this.color = color;
        this.width = width;
    }


    public void use(int linesToBeHighlighted){
        //for (int i = 0; i <  ; i++) {
        inkAmount = inkAmount - (linesToBeHighlighted*width);
    }


    public void remainingInkAmount(){
        System.out.println("The remaining ink amount is: " + inkAmount);
    }

}
