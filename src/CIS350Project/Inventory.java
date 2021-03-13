package CIS350Project;

import javax.swing.*;
import java.awt.*;
import javax.swing.JLabel;
import java.util.*;
import java.text.*;


public class Inventory extends JPanel {
    JLabel clue1;

    public static void main(String[] args) {
        JFrame f = new JFrame();
        Inventory l_inv = new Inventory();
        f.setContentPane(l_inv);
        f.setSize(1100, 300);
        f.setVisible(true);
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(10,10, 550,300);

        g.setColor(new Color(198, 111, 89, 67));
        g.fillRect(570,10, 550, 300);

        g.setColor(Color.WHITE);
        g.drawString("The exit code include the digits 1, 4, and 2", 10, 30);
        g.drawString("The digits are entered in decending order", 10, 70);


        g.setColor(Color.BLACK);
        Font heading = new Font("Arial", Font.BOLD, 40);
        g.setFont(heading);
        g.drawString("Inventory", 580,50);
        Image item = new ImageIcon("coldOne.png").getImage();
        g.drawImage(item, 580, 60, this);

        g.setColor(Color.RED);
        Font clock = new Font("Baskerville Old Face", Font.BOLD, 50);
        g.setFont(clock);
        g.drawString("8:34", 1000, 290);




//        clue1 = new JLabel("The exit code include the digits 5, 4, and 2");
//        clue1.setBounds(10, 10, 500, 250);


    }
}
