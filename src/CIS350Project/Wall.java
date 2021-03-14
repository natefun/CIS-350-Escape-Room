package CIS350Project;

import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
import java.util.ArrayList;
import java.awt.event.*;
import java.awt.geom.*;

public class Wall extends JPanel {
    public void setVisWall(int visWall) {
        this.visWall = visWall;
    }

    public int getVisWall() {
        return visWall;
    }

    int visWall = 1;

    public static void main(String[] args) {
        JFrame f = new JFrame();
        Wall lWall = new Wall();
        f.setContentPane(lWall);
        f.setSize(1100, 600);
        f.setVisible(true);
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        setBackground(Color.GRAY);

        if(visWall % 4 == 1) {
            Image image = new ImageIcon("placeholderwall.png").getImage();
            g.drawImage(image, 0, 0, this);
        } else if (visWall % 4 == 2){
            Image image = new ImageIcon("placeholderwall2.png").getImage();
            g.drawImage(image, 0, 0, this);
        } else if (visWall % 4 == 3){
            Image image = new ImageIcon("placeholderwall3.png").getImage();
            g.drawImage(image, 0, 0, this);
        } else {
            Image image = new ImageIcon("placeholderwall0.png").getImage();
            g.drawImage(image, 0, 0, this);
        }
    }
    public void redraw() {
        repaint();
    }

}
