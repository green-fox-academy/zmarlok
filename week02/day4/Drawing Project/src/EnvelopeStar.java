import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics) {
        // Draw lines as shown on picture: https://github.com/green-fox-academy/teaching-materials/blob/master/project/drawing/r1.png
        // 15 horizontal, 15 vertical, curved lines from the bottom left and from upper right corner

        graphics.setColor(Color.RED);
        drawQ1part(160,160,graphics);
        drawQ2part(160,160,graphics);
        drawQ3part(160,160,graphics);
        drawQ4part(160,160,graphics);

    }

    public static void drawQ1part(int x0, int y1, Graphics graphics) {
        int x1 = 160; // decrease by 10
        int y0 = 0; // increase by 10


        for (int i = 0; i < 16; i++) {
            x1 = x1 - 10;
            y0 = y0 + 10;
            graphics.drawLine(x0, y0, x1, y1);
        }
    }
    public static void drawQ2part(int x0, int y1, Graphics graphics){
        int x1 = 160; // increase by 10
        int y0 = 0; // increase by 10


        for (int i = 0; i < 16; i++) {
            x1 = x1 + 10;
            y0 = y0 + 10;
            graphics.drawLine(x0, y0, x1, y1);
            }
        }
    public static void drawQ3part(int x0, int y1, Graphics graphics){
        int x1 = 160; // increase by 10
        int y0 = 320; // decrease by 10


        for (int i = 0; i < 16; i++) {
            x1 = x1 - 10;
            y0 = y0 - 10;
            graphics.drawLine(x0, y0, x1, y1);
                }
            }
    public static void drawQ4part(int x0, int y1, Graphics graphics){
        int x1 = 160; // increase by 10
        int y0 = 320; // decrease by 10


        for (int i = 0; i < 16; i++) {
            x1 = x1 + 10;
            y0 = y0 - 10;
            graphics.drawLine(x0, y0, x1, y1);
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

