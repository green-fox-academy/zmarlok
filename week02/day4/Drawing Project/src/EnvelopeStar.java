import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics g) {
        // Draw lines as shown on picture: https://github.com/green-fox-academy/teaching-materials/blob/master/project/drawing/r1.png
        // 15 horizontal, 15 vertical, curved lines from the bottom left and from upper right corner


        g.setColor(Color.black);
        g.fillRect(0,0,WIDTH,HEIGHT);

        int canvasSize = WIDTH;
        int halfOfCanvas = canvasSize /2;
        int step = 10;
        int cycle = canvasSize / step / 2;

        for (int i = 0; i <cycle ; i++) {
            g.setColor(Color.GREEN);
            g.drawLine(halfOfCanvas, step *i, halfOfCanvas-(step*i), halfOfCanvas); // x1-10; y0+10
            g.drawLine(halfOfCanvas, step*i, halfOfCanvas+(step*i), halfOfCanvas); // x1+10; y0+10
            g.drawLine(halfOfCanvas, canvasSize-(step*i), halfOfCanvas-(step*i), halfOfCanvas); // x1-10; y0-10
            g.drawLine(halfOfCanvas, canvasSize-(step*i), halfOfCanvas+(step*i), halfOfCanvas); // x1+10; y0-10

        }


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


