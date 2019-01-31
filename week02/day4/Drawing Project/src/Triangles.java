import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {
        // Draw lines as shown on picture: https://github.com/green-fox-academy/teaching-materials/blob/master/project/drawing/r1.png


        drawLine(320, 320, 160, 0, graphics);
        drawLine(0, 320, 160, 0, graphics);
        drawLine(0,320,320,320,graphics);
        drawLine(20,320, 160, 20, graphics);


    }


    public static void drawLine(int x0, int y0, int x1, int y1, Graphics graphics) {


               graphics.drawLine(x0, y0, x1, y1);

    }

        // Don't touch the code below
        static int WIDTH = 320;
        static int HEIGHT = 320;

        public static void main (String[]args){
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



