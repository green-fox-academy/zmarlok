import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.

        for (int rows = 0; rows < WIDTH / 40; rows++) {
            for (int columns = 0; columns < HEIGHT / 40; columns++) {
                if (rows %2 ==0 ^ columns %2 ==0){
                    graphics.setColor(Color.BLACK);
                }else{
                    graphics.setColor(Color.WHITE);
                } graphics.fillRect(columns * HEIGHT/8, rows * WIDTH/8, WIDTH/8, HEIGHT /8);

            }
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