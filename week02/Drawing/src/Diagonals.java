import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Diagonals {
    public static void mainDraw(Graphics graphics) {
        // Draw the canvas' diagonals.


        // If it starts from the upper-left corner it should be green, otherwise it should be red.
        //graphics.drawLine(320,0,0,320);

        drawDiagonal(0,0,320,320,graphics);
        drawDiagonal(320,0,0,320,graphics);

        }


    public static void drawDiagonal(int x1, int y1, int x2, int y2, Graphics graphics){

        graphics.drawLine(x1,y1,x2,y2);
        if (y1 == 0){
            graphics.setColor(Color.GREEN);
        } else {
            graphics.setColor(Color.GREEN);
        }

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