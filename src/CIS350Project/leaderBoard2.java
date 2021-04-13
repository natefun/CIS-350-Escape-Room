package CIS350Project;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.text.*;
import java.io.IOException;

public class leaderBoard2 extends JFrame implements ActionListener {

    private JFrame frame;

    public mainMenuGui main;

    /**
     * number formate to add commas
     */
    NumberFormat com = NumberFormat.getNumberInstance(Locale.US);

    /**
     * Buttons to initiate each action
     */
    private JButton mainMenu, submit;

    /**
     * Results
     */
    JTextArea results;

    /**
     * Data entry fields: month, day, state, and minimum
     */
    JTextField name, time;

    /**
     * menu items
//     */
//    JMenuBar menus;
//    JMenu fileMenu;
//    JMenuItem quitItem;
//    JMenuItem stats;
//    JMenuItem open;

    /*****************************************************************
     * Main Method
     ****************************************************************/
    public static void main(String args[]) {
        new leaderBoard2();

    }

    /*****************************************************************
     * constructor installs all of the GUI components
     ****************************************************************/
    public leaderBoard2() {

        frame = new JFrame("SPACE ESCAPE leaderboard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Insets insets = frame.getInsets();
        frame.setSize(1200 + insets.left + insets.right,
                1000 + insets.top + insets.bottom);

        JPanel panel = new JPanel();

        panel.setLayout(null);
        panel.setBackground(new Color(0, 0, 0, 255));


        // create results area to span one column and 11 rows
       results = new JTextArea(20, 40);
        JScrollPane scrollPane = new JScrollPane(results);
        Dimension size = scrollPane.getPreferredSize();
        scrollPane.setBounds(600 + insets.left, 150 + insets.top,
                size.width + 100, size.height + 400);
        panel.add(scrollPane);

        // create Results label
        JLabel label = new JLabel ("SPACE ESCAPE leaderboard");
        label.setFont(new Font("Monospace", Font.ITALIC, 20));
        label.setForeground(Color.white);
        label.setSize(400,200);
        label.setLocation(725,25);
        panel.add(label);


        JLabel nameL = new JLabel ("Your name here");
        nameL.setFont(new Font("Monospace", Font.ITALIC, 20));
        nameL.setForeground(Color.white);
        nameL.setSize(400,200);
        nameL.setLocation(200,100);
        panel.add(nameL);

        name = new JTextField();
        name.setBounds(100 + insets.left, 150 + insets.top,
                size.width + -10, size.height + -10);
        panel.add(name);
//
//        //time Label and text feild
//        loc = new GridBagConstraints();
//        loc.gridheight = 1;
//        loc.gridx = 1;
//        loc.gridy = 2;
//        loc.anchor = GridBagConstraints.LINE_START;
//        frame.add(new JLabel("your time"), loc);
//
//        time = new JTextField(4);
//        loc.gridx = 2;
//        loc.gridy = 2;
//        frame.add(time, loc);
//
//        mainMenu = new JButton("main Menu");
//        loc = new GridBagConstraints();
//        loc.anchor = GridBagConstraints.CENTER;
//        loc.gridwidth = 2;
//        loc.gridx = 1;
//        loc.gridy = 9;
//        frame.add(mainMenu, loc);
//
//        mainMenu = new JButton("submit");
//        loc = new GridBagConstraints();
//        loc.anchor = GridBagConstraints.CENTER;
//        loc.gridwidth = 2;
//        loc.gridx = 1;
//        loc.gridy = 8;
//        frame.add(submit, loc);


        // register the button listeners
//        mainMenu.addActionListener(this);
//        submit.addActionListener(this);

        frame.add(panel);

        frame.setResizable(false);
        frame.setVisible(true);
    }



    public void actionPerformed(ActionEvent e) {

        //user selects open
        if (e.getSource() == mainMenu) {
          main = new mainMenuGui();
          main.setVisible(true);

            Insets insets = frame.getInsets();
            main.setSize(1200 + insets.left + insets.right,
                    1000 + insets.top + insets.bottom);
            frame.dispose();
        }
//        if (e.getSource() == submit) {
//            results.setText(name);
//        }
    }
}

