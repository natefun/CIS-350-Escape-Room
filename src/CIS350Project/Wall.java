package CIS350Project;

import javax.swing.*;
import java.awt.*;

public class Wall extends JPanel {
    int visWall = 1;
    boolean note = true;
    boolean coldOneWall = true;
    int centerConsole1 = 1;
    int centerConsole2 = 2;
    int centerConsole3 = 3;
    int num1 = 0;
    int num2 = 0;
    int num3 = 0;

    boolean passedG = false;

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

    //for wall 2
    public void setNum1(int newNum1){
        this.num1 = newNum1;
    }
    public int getNum1(){
        return this.num1;
    }

    public void setNum2(int newNum2){
        this.num2 = newNum2;
    }
    public int getNum2(){
        return this.num2;
    }

    public void setNum3(int newNum3){
        this.num3 = newNum3;
    }
    public int getNum3(){
        return this.num3;
    }

    public void passedGreen(boolean passed){
       if (passed){
           passedG = true;
       }else{
           passedG = false;
       }
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
            } else if (centerConsole3 == 4) {
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
            } else if (centerConsole2 == 4) {
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
            } else if (centerConsole1 == 4) {
                Image image1 = new ImageIcon("CenterPic41.png").getImage();
                g.drawImage(image1, 258, 17, this);
            }
            if (centerConsole1 == 2 && centerConsole2 == 2 && centerConsole3 == 2) {
                Image image4 = new ImageIcon("ConsoleCode.png").getImage();
                g.drawImage(image4, 258, 17, this);
            }

            //for wall 2
        }else if (visWall == -3) {
            Image image = new ImageIcon("clockZoom.png").getImage();
            g.drawImage(image, 0, 0, this);
        }

        else if(visWall == -4){
            Image blank = new ImageIcon("blank.png").getImage();
            Image n1 = new ImageIcon("num1.png").getImage();
            Image n2 = new ImageIcon("num2.png").getImage();
            Image n3 = new ImageIcon("num3.png").getImage();
            Image n4 = new ImageIcon("num4.png").getImage();
            Image n5 = new ImageIcon("num5.png").getImage();
            Image n6 = new ImageIcon("num6.png").getImage();
            Image n7 = new ImageIcon("num7.png").getImage();
            Image n8 = new ImageIcon("num8.png").getImage();
            Image n9 = new ImageIcon("num9.png").getImage();

            Image image = new ImageIcon("greenbutZoom.png").getImage();
            g.drawImage(image, 0, 0, this);

            if (num1 == 0) {
                g.drawImage(blank, 180, 45, this);
            }else if(num1 == 1){
                g.drawImage(n1, 180, 45, this);
            }else if(num1 == 2){
                g.drawImage(n2, 180, 45, this);
            }else if(num1 == 3){
                g.drawImage(n3, 180, 45, this);
            }else if(num1 == 4){
                g.drawImage(n4, 180, 45, this);
            }else if(num1 == 5){
                g.drawImage(n5, 180, 45, this);
            }else if(num1 == 6){
                g.drawImage(n6, 180, 45, this);
            }else if(num1 == 7){
                g.drawImage(n7, 180, 45, this);
            }else if(num1 == 8){
                g.drawImage(n8, 180, 45, this);
            }else if(num1 == 9){
                g.drawImage(n9, 180, 45, this);
            }


            if (num2 == 0) {
                g.drawImage(blank, 450, 45, this);
            }else if(num2 == 1){
                g.drawImage(n1, 450, 45, this);
            }else if(num2 == 2){
                g.drawImage(n2, 450, 45, this);
            }else if(num2 == 3){
                g.drawImage(n3, 450, 45, this);
            }else if(num2 == 4){
                g.drawImage(n4, 450, 45, this);
            }else if(num2 == 5){
                g.drawImage(n5, 450, 45, this);
            }else if(num2 == 6){
                g.drawImage(n6, 450, 45, this);
            }else if(num2 == 7){
                g.drawImage(n7, 450, 45, this);
            }else if(num2 == 8){
                g.drawImage(n8, 450, 45, this);
            }else if(num2 == 9){
                g.drawImage(n9, 450, 45, this);
            }


            if (num3 == 0){
                g.drawImage(blank, 720, 45, this);
            }else if(num3 == 1){
                g.drawImage(n1, 720, 45, this);
            }else if(num3 == 2){
                g.drawImage(n2, 720, 45, this);
            }else if(num3 == 3){
                g.drawImage(n3, 720, 45, this);
            }else if(num3 == 4){
                g.drawImage(n4, 720, 45, this);
            }else if(num3 == 5){
                g.drawImage(n5, 720, 45, this);
            }else if(num3 == 6){
                g.drawImage(n6, 720, 45, this);
            }else if(num3 == 7){
                g.drawImage(n7, 720, 45, this);
            }else if(num3 == 8){
                g.drawImage(n8, 720, 45, this);
            }else if(num3 == 9){
                g.drawImage(n9, 720, 45, this);
            }

            if(passedG){
                Image pass = new ImageIcon("greenbutpassed.png").getImage();
                g.drawImage(pass, 0, 0, this);
            }

        }

        else if(visWall % 4 == 1) {
            Image image = new ImageIcon("placeholderwall.png").getImage();
            g.drawImage(image, 0, 0, this);
            if(note) {
                Image note = new ImageIcon("noteHidden.png").getImage();
                g.drawImage(note, 355, 300, this);
            }
            if(coldOneWall) {
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
