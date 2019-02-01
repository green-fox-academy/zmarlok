package recursivesquares;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {
    public static void mainDraw(Graphics g) {

        g.setColor(Color.yellow);
        g.fillRect(0, 0, 450, 450);


       // int indexOfRowsAndColumns = WIDTH / size;

       /* for (int rows = 0; rows < indexOfRowsAndColumns; rows++) {
            for (int columns = 0; columns < indexOfRowsAndColumns; columns++) {
                g.setColor(Color.BLACK);
                //drawRectLines(rows * size, columns * size, size, g);                                //külső keret
                drawRectLines(size+ (rows*size/3), columns*size/3, size/3, g);                  //4es
                drawRectLines(rows*size/3, size+(columns*size/3), size/3, g);                   //2es
                drawRectLines(size + (rows*size/3), size*2 + (columns*size/3), size/3, g);      //6os
                drawRectLines(size*2 + (rows*size/3), size + (columns*size/3), size/3, g);      //8as
            }
        } */
        //drawRectLines(0,0,size,g);


       /* drawRectLines(size+ (0*size/3), 0*size/3, size/3, g);                  //4es
        drawRectLines(0*size/3, size+(1*size/3), size/3, g);                   //2es
        drawRectLines(size + (1*size/3), size*2 + (0*size/3), size/3, g);      //6os
        drawRectLines(size*2 + (1*size/3), size + (1*size/3), size/3, g);      //8as*/
       int size = 150;
       g.setColor(Color.black);

      /*g.drawLine(size,0, size, size*3);
       g.drawLine(size*2,0,size*2,size*3);
       g.drawLine(0, size, size*3, size);
       g.drawLine(0,size*2,size*3,size*2); */
      drawHashtag(g);
    }

    public static void drawHashtag (Graphics g){
       // int indexOfRowsAndColumns = WIDTH / size;  // 3!
        int size = 50;
        g.drawLine(size*3,0, size*3, size*9);
        g.drawLine(size*6,0,size*6,size*9);
        g.drawLine(0, size*3, size*9, size*3);
        g.drawLine(0,size*6,size*9,size*6);

       /* g.drawLine(0,size*4,size*3,size*4);
        g.drawLine(0,size*5,size*3,size*5);
        g.drawLine(size,size*3,size, size*6);
        g.drawLine(size*2,size*3,size*2, size*6); */

        /*for (int rows = 0; rows < indexOfRowsAndColumns; rows++) {
            for (int columns = 0; columns < indexOfRowsAndColumns; columns++) {
                g.setColor(Color.BLACK); */
                //g.drawRect(rows * size, columns * size, size, size);
                //g.drawRect(x0, y0, size, size);



    }















    // CANVAS BELOW
        static int WIDTH = 450;
        static int HEIGHT = 450;

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
