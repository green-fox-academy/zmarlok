import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
    public static void mainDraw(Graphics graphics) {


        // Create a line drawing function that takes 3 parameters:



        // The x and y coordinates of the line's starting point and the graphics

        // and draws a line from that point to the center of the canvas.
        // CENTER: x: 160, y: 160

        // Draw 3 lines with that function. Use loop for that.

        drawLine(0, 0, graphics);
        // int x = 0;
        // int y = 0;

        for (int i = 0; i <201 ; i+= 100) {
            drawLine(i, 0, graphics);
        }

    }
    public static void drawLine(int x, int y, Graphics graphics){

        graphics.drawLine(x,y,160,160);

    }
    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}