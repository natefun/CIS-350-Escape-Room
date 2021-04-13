package CIS350Project;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.GregorianCalendar;

public class LeaderBoard {

    private JFrame frame;

    private JButton mainMenu;

    private JPanel panel;

    private JTable jTable;

    private JScrollPane scroll;

    private String[] currentLeaderBoard = {"player", "time"};

    public LeaderBoard(){

        frame = new JFrame("SPACE ESCAPE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Insets insets = frame.getInsets();
        frame.setSize(1200 + insets.left + insets.right,
                1000 + insets.top + insets.bottom);

        mainMenu = new JButton("Main Menu");

        frame.add(mainMenu);

        Dimension size = mainMenu.getPreferredSize();
        mainMenu.setBounds(500 + insets.left, 400 + insets.top,
                size.width + 50, size.height + 20);

        frame.setResizable(false);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new LeaderBoard();

    }

}
