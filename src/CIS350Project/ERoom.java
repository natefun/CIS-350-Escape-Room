package CIS350Project;

import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.*;
import java.text.*;

public class ERoom extends JFrame implements ActionListener{
    private JPanel panel;
    private Wall wall;
    private Inventory inv;

    private JMenuBar menus;
    private JMenu fileMenu;
    private JMenuItem open;
    private JMenuItem exit;

    private JButton turnRight, turnLeft, askForHint, pickNote, coldOne, viewScreen, exitScreen,
        consoleOne, consoleTwo, consoleThree;

    public static void main(String[] args) {
        ERoom gui = new ERoom();
        gui.setUndecorated(false);
        gui.setVisible(true);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setTitle("Escape Room");
        gui.pack();
        gui.setSize(1200, 1000);
    }



    private ERoom(){
        setSize(1000, 600);
        setLocationRelativeTo(null);
        panel = new JPanel();
        add(panel);
        panel.setLayout(null);

        wall = new Wall();
        wall.setBounds(50, 10, 1100, 600);
        panel.add(wall);

        inv = new Inventory();
        inv.setBounds(50, 620, 1100, 300);
        panel.add(inv);

        JMenuBar menus = new JMenuBar();
        setJMenuBar(menus);
        JMenu fileMenu = new JMenu("File");
        menus.add(fileMenu);
        open = new JMenuItem("Open");
        open.addActionListener(this);
        fileMenu.add(open);
        exit = new JMenuItem("Exit");
        exit.addActionListener(this);
        fileMenu.add(exit);

        turnRight = new JButton(">");
        turnRight.setBounds(1150, 300, 50, 50);
        panel.add(turnRight);
        turnRight.setVisible(true);
        turnRight.addActionListener(this);

        turnLeft = new JButton("<");
        turnLeft.setBounds(1, 300, 50, 50);
        panel.add(turnLeft);
        turnLeft.addActionListener(this);

        //For wall one//
        pickNote = new JButton(".");
        pickNote.setBounds(405,325,60,60);
        panel.add(pickNote);
        pickNote.setOpaque(false);
        pickNote.addActionListener(this);

        coldOne = new JButton(".");
        coldOne.setBounds(765,174,30,80);
        panel.add(coldOne);
        coldOne.setOpaque(false);
        coldOne.addActionListener(this);

        viewScreen = new JButton("x");
        viewScreen.setBounds(275, 120, 100, 100);
        panel.add(viewScreen);
        viewScreen.setOpaque(false);
        viewScreen.addActionListener(this);

        //for screen close up//
        exitScreen = new JButton("x");
        exitScreen.setBounds(1120, 10, 30, 30);
        panel.add(exitScreen);
        exitScreen.setOpaque(false);
        exitScreen.addActionListener(this);

        consoleOne = new JButton();
        consoleOne.setBounds(390, 540, 60, 60);
        panel.add(consoleOne);
        consoleOne.setOpaque(false);
        consoleOne.addActionListener(this);

        consoleTwo = new JButton();
        consoleTwo.setBounds(560, 540, 60, 60);
        panel.add(consoleTwo);
        consoleTwo.setOpaque(false);
        consoleTwo.addActionListener(this);

        consoleThree = new JButton();
        consoleThree.setBounds(720, 540, 60, 60);
        panel.add(consoleThree);
        consoleThree.setOpaque(false);
        consoleThree.addActionListener(this);
    }




// Something like this eventually
//    private void openFile(){
//
//        // create File Chooser so that it starts at the current directory
//        String userDir = System.getProperty("user.dir");
//        JFileChooser fc = new JFileChooser(userDir);
//
//        // show File Chooser and wait for user selection
//        int returnVal = fc.showOpenDialog(this);
//
//        // did the user select a file?
//        if (returnVal == JFileChooser.APPROVE_OPTION) {
//            String filename = fc.getSelectedFile().getName();
//            // FIX ME: use your database object
//            game.readSheet(filename);
//
//            plot(false);
//
//        }

//    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {

            if (event.getSource() == exit) {
                System.exit(0);
            }
            if (event.getSource() == turnLeft) {
                wall.setVisWall(wall.getVisWall() + 3);
                wall.redraw();
            }
            if (event.getSource() == turnRight) {
                wall.setVisWall(wall.getVisWall() + 5);
                wall.redraw();
            }
            if (event.getSource() == pickNote) {
                if(wall.getVisWall()%4==1) {
                    wall.setNote();
                    wall.redraw();
                    inv.setNoteInv();
                    inv.redrawInv();
                }
            }
            if (event.getSource() == coldOne) {
                if(wall.getVisWall()%4==1) {
                    wall.setOne();
                    wall.redraw();
                    inv.setColdOneInv();
                    inv.redrawInv();
                }
            }

            if (event.getSource() == viewScreen) {
                if(wall.getVisWall()%4==1) {
                    wall.setVisWall(-1);
                    wall.redraw();
                }
            }

            if (event.getSource() == exitScreen) {
                if(wall.getVisWall()==-1) {
                    wall.setVisWall(1);
                    wall.redraw();
                }
            }
            if (event.getSource() == consoleOne) {
                if(wall.getVisWall() == -1) {
                    wall.setCenterConsole1();
                    wall.redraw();
                }
            }
            if (event.getSource() == consoleTwo) {
                if(wall.getVisWall() == -1) {
                    wall.setCenterConsole2();
                    wall.redraw();
                }
            }
            if (event.getSource() == consoleThree) {
                if(wall.getVisWall() == -1) {
                    wall.setCenterConsole3();
                    wall.redraw();
                }
            }


        }
//    }
}
