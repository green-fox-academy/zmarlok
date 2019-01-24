import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
        public static void mainDraw(Graphics graphics) {
            // Draw lines as shown on picture: https://github.com/green-fox-academy/teaching-materials/blob/master/project/drawing/r1.png
            // 14 horizontal, 14 vertical, curved lines from the bottom left and from upper right corner


            drawLeftLine(0,320, graphics);
            drawRightLine(320, 0, graphics);

            /* drawLeftLine(0,300,300, 320, graphics);
            drawRightLine(0, 280,280, 320, graphics);
              drawLeftLine(0,260,260, 320, graphics);
            drawRightLine(0, 240,240, 320, graphics);
              drawLeftLine(0,200,200, 320, graphics);
            drawRightLine(0, 180,180, 320, graphics);
              drawLeftLine(0,160,160, 320, graphics);
            drawRightLine(0, 140,140, 320, graphics);
              drawLeftLine(0,140,140, 320, graphics);
            drawRightLine(0, 120,120, 320, graphics);
             drawLeftLine(0,100,100, 320, graphics);
            drawRightLine(0, 80,80, 320, graphics);
             drawLeftLine(0,60,60, 320, graphics);
            drawRightLine(0, 40,40, 320, graphics);
             drawLeftLine(0,20,20, 320, graphics);
            drawRightLine(0, 0,0, 320, graphics); */


           /* drawLeftLine(300,0,320, 300, graphics);
            drawRightLine(280, 0,320, 280, graphics);
            drawLeftLine(260,0,320, 260, graphics);
            drawRightLine(240, 0,320, 240, graphics);
            drawLeftLine(220,0,320, 220, graphics);
            drawRightLine(200, 0,320, 200, graphics);
            drawLeftLine(180,0,320, 180, graphics);
            drawRightLine(160, 0,320, 160, graphics);
            drawLeftLine(140,0,320, 140, graphics);
            drawRightLine(120, 0,320, 120, graphics);
            drawLeftLine(100,0,320, 100, graphics);
            drawRightLine(80, 0,320, 80, graphics);
            drawLeftLine(60,0,320, 60, graphics);
            drawRightLine(40, 0,320, 40, graphics);
            drawLeftLine(20,0,320, 20, graphics);
            drawRightLine(0, 0,320, 0, graphics); */

        }

        public static void drawLeftLine(int x0, int y1, Graphics graphics){
            graphics.setColor(Color.GREEN);

            int x1 = 300; // decrease by 20
            int y0 = 300; // decrease by 20


            for (int i = 0; i <16 ; i++) {
                x1 =  x1-20;
                y0 =  y0-20;
                graphics.drawLine(x0,y0,x1,y1);
            }

        }
       public static void drawRightLine(int x1, int y0, Graphics graphics){
            graphics.setColor(Color.BLUE);

            int x0 = 300; // decrease by 20
            int y1 = 300; // decrease by 20

           for (int j = 0; j <16 ; j++) {
               x0 = x0 - 20;
               y1 = y1 - 20;
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

