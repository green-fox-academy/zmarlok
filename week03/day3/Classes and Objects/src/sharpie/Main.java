//Create Sharpie class
//
//    We should know about each sharpie their color (which should be a string), width (which will be a floating point number), inkAmount (another floating point number)
//    When creating one, we need to specify the color and the width
//    Every sharpie is created with a default 100 as inkAmount
//    We can use() the sharpie objects
//        which decreases inkAmount

package sharpie;

public class Main {

    public static void main(String[] args) {
        Sharpie sharpie1 = new Sharpie("blue", 0.7f);
        Sharpie sharpie2 = new Sharpie("yellow", 0.5f);

        sharpie1.use(3);

        sharpie1.remainingInkAmount();
    }
}
