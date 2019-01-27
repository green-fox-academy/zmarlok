import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
        public static void mainDraw(Graphics graphics) {
            // Draw lines as shown on picture: https://github.com/green-fox-academy/teaching-materials/blob/master/project/drawing/r1.png
            // 15 horizontal, 15 vertical, curved lines from the bottom left and from upper right corner

            int canvasSize = 320;
            int step = 15;
            int cycle = canvasSize / step;

            for (int i = 0; i < cycle; i++) {
                graphics.setColor(Color.BLUE);
                graphics.drawLine(0, HEIGHT-step*i, HEIGHT-step*i, HEIGHT  );
                graphics.setColor(Color.GREEN);
                graphics.drawLine(WIDTH-step*i, 0, WIDTH, WIDTH-step*i  );
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

