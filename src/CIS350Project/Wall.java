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
    int visWall = 1;
    boolean note = true;
    boolean coldOneWall = true;
    int centerConsole1 = 1;
    int centerConsole2 = 2;
    int centerConsole3 = 3;

    public void setVisWall(int visWall) {
        this.visWall = visWall;
    }
    public void setCenterConsole1() {
        if(centerConsole1 == 4)
            centerConsole1 = 1;
        else
            centerConsole1 = centerConsole1 + 1;
    }
    public void setCenterConsole2() {
        if(centerConsole2 == 4)
            centerConsole2 =1;
        else
            centerConsole2 = centerConsole2 + 1;
    }
    public void setCenterConsole3() {
        if(centerConsole3 == 4)
            centerConsole3 = 1;
        else
            centerConsole3 = centerConsole3 + 1;
    }


    public int getVisWall() {
        return visWall;
    }
    public void setNote() {
        note = false;
    }
    public void setOne() {
        coldOneWall = false;
    }



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

        if (visWall == -1) {
            Image image = new ImageIcon("ScreenCloseUp.png").getImage();
            g.drawImage(image, 0, 0, this);
            if (centerConsole3 == 1) {
                Image image3 = new ImageIcon("CenterPic1.png").getImage();
                g.drawImage(image3, 258, 17, this);
            } else if (centerConsole3 == 2) {
                Image image3 = new ImageIcon("CenterPic2.png").getImage();
                g.drawImage(image3, 258, 17, this);
            } else if (centerConsole3 == 3) {
                Image image3 = new ImageIcon("CenterPic3.png").getImage();
                g.drawImage(image3, 258, 17, this);
            }else if (centerConsole3 == 4) {
                Image image3 = new ImageIcon("CenterPic4.png").getImage();
                g.drawImage(image3, 258, 17, this);
            }
            if (centerConsole2 == 1) {
                Image image2 = new ImageIcon("CenterPic12.png").getImage();
                g.drawImage(image2, 258, 17, this);
            } else if (centerConsole2 == 2) {
                Image image2 = new ImageIcon("CenterPic22.png").getImage();
                g.drawImage(image2, 258, 17, this);
            } else if (centerConsole2 == 3) {
                Image image2 = new ImageIcon("CenterPic32.png").getImage();
                g.drawImage(image2, 258, 17, this);
            }else if (centerConsole2 == 4) {
                Image image2 = new ImageIcon("CenterPic42.png").getImage();
                g.drawImage(image2, 258, 17, this);
            }
            if (centerConsole1 == 1) {
                Image image1 = new ImageIcon("CenterPic11.png").getImage();
                g.drawImage(image1, 258, 17, this);
            } else if (centerConsole1 == 2) {
                Image image1 = new ImageIcon("CenterPic21.png").getImage();
                g.drawImage(image1, 258, 17, this);
            } else if (centerConsole1 == 3) {
                Image image1 = new ImageIcon("CenterPic31.png").getImage();
                g.drawImage(image1, 258, 17, this);
            }else if (centerConsole1 == 4) {
                Image image1 = new ImageIcon("CenterPic41.png").getImage();
                g.drawImage(image1, 258, 17, this);
            }
            if (centerConsole1 ==2 && centerConsole2 ==2 && centerConsole3 ==2) {
                Image image4 = new ImageIcon("ConsoleCode.png").getImage();
                g.drawImage(image4, 258, 17, this);
            }
        }else if(visWall % 4 == 1) {
            Image image = new ImageIcon("placeholderwall.png").getImage();
            g.drawImage(image, 0, 0, this);
            if(note == true) {
                Image note = new ImageIcon("noteHidden.png").getImage();
                g.drawImage(note, 355, 300, this);
            }
            if(coldOneWall == true) {
                Image note = new ImageIcon("coldOneWall.png").getImage();
                g.drawImage(note, 700, 159, this);
            }


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
