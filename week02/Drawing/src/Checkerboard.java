import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        // The size of the canvas is 320x320 px.
        // One field should be 40x40 px.

        int indexOfRows = 8;
        int fieldSize = 40;
        int canvasSize = WIDTH;

        for (int rows = 0; rows < canvasSize / fieldSize; rows++) {
            for (int columns = 0; columns < canvasSize / fieldSize; columns++) {
                if (rows %2 !=0 ^ columns %2 !=0){
                    graphics.setColor(Color.BLACK);
                }else{
                    graphics.setColor(Color.WHITE);
                } graphics.fillRect(columns * canvasSize/indexOfRows, rows * canvasSize/indexOfRows, canvasSize/indexOfRows, canvasSize /indexOfRows);

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