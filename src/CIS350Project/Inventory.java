package CIS350Project;

import javax.swing.*;
import java.awt.*;


public class Inventory extends JPanel {
    JLabel clue1;
    boolean noteInv,  clueOne, clueTwo, clueThree, clueFour, clueFive, clueSix, cardInv = false;

    public void setNoteInv() {
        noteInv = true;
    }

    public void setClueOne() {
        clueOne = true;
    }

    public void setClueTwo() {
        clueTwo = true;
    }

    public void setClueThree() {
        clueThree = true;
    }

    public void setClueFour() {
        clueFour = true;
    }

    public void setClueFive() {
        clueFive = true;
    }

    public void setClueSix() {
        clueSix = true;
    }

    //Sets the value that determines if the access card is in the inventory
    public void setCardInv() {
        cardInv = true;
    }

    //removes the card from inventory
    public void removeCardInv() {
        cardInv = false;
    }



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
        g.fillRect(10, 10, 550, 300);

        g.setColor(new Color(198, 111, 89, 67));
        g.fillRect(570, 10, 550, 300);

        Font heading = new Font("Arial", Font.BOLD, 40);
        Font clues = new Font("Arial", Font.PLAIN, 20);
        g.setColor(Color.WHITE);
        g.setFont(heading);
        g.drawString("Clues", 230, 40);
        g.setFont(clues);
        if (clueOne)
            g.drawString("The exit code includes the digits 3, 7, and 9.", 20, 80);
        if (clueTwo)
            g.drawString("The exit code includes the digits 8, 5, and 5.", 20, 110);
        if (clueThree)
            g.drawString("The exit code includes the digits 8, 7, and 4.", 20, 140);
        if (clueFour)
            g.drawString("The first five digits are entered in ascending order.", 20, 170);
        if (clueFive)
            g.drawString("The last four digits are in descending order.", 20, 200);
        if (clueSix)
            g.drawString("The first five digits are prime numbers.", 20, 230);


        g.setColor(Color.BLACK);

        g.setFont(heading);
        g.drawString("Inventory", 580, 50);
        if (noteInv) {
            Image note = new ImageIcon("noteInv.png").getImage();
            g.drawImage(note, 680, 60, this);
        }
        //Show the access card in the inventory
        if (cardInv) {
            Image note = new ImageIcon("cardInv.png").getImage();
            g.drawImage(note, 880, 60, this);
        }


    }

    public void redrawInv() {
        repaint();
    }
}
