package CIS350Project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class starsGui extends JPanel implements ActionListener {
    final Timer time = new Timer(5,this);
    final int x = 450;
    final int y = 400;
    final int speed = 4;
    int x1 = x, x2 = x;
    int y1 = y, y2 = y;

    /**
     * create the stars
     * @param g
     */
    public void paintComponent(Graphics g){
       super.paintComponent(g);
        setBackground(Color.BLACK);
        g.setColor(Color.WHITE);
        g.fillOval(x1,y,10,10);
        g.fillOval(x2,y,10,10);
        g.fillOval(x,y1,10,10);
        g.fillOval(x,y2,10,10);

        time.start();

    }

    /**
     * changes the directions of the stars
     * @param e
     */
    public void actionPerformed(ActionEvent e){
        if (x1 > 0 && x1 < 900) {
                x1 = x1 + speed;
                repaint();
        }
        if (x1 >= 900) {
                x1 = x;
                x1 = x1 + speed;
                repaint();
       }
        if (x2 > 0 && x2 < 900) {
            x2 = x2 - speed;
            repaint();
        }
        if (x2 <= 0) {
            x2 = x;
            x2 = x2 - speed;
            repaint();
        }
        if (y1 > 0 && y1 < 800) {
            y1 = y1 + speed;
            repaint();
        }
        if (y1 >= 800) {
            y1 = y;
            y1 = y1 + speed;
            repaint();
        }
        if (y2 > 0 && y2 < 800) {
            y2 = y2 - speed;
            repaint();
        }
        if (y2 <= 0) {
            y2 = y;
            y2 = y2 - speed;
            repaint();
        }
    }

    /**
     * the main that creates the GUI
     * @param args
     */
    public static void main (String[] args){
        starsGui s = new starsGui();
        JFrame frame = new JFrame();
        frame.setSize(900,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(s);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
