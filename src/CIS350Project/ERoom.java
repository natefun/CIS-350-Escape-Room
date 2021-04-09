package CIS350Project;

import javax.swing.*;
import java.awt.event.*;

public class ERoom extends JFrame implements ActionListener {
    private final Wall wall;
    private final Inventory inv;

    private JMenuBar menus;
    private JMenu fileMenu;
    private final JMenuItem exit;

    private final JButton turnRight;
    private final JButton turnLeft;
    private JButton askForHint;
    private final JButton pickNote;
    private final JButton coldOne;
    private final JButton accessCard; //button for picking up access card
    private final JButton viewScreen;
    private final JButton exitScreen;
    private final JButton consoleOne;
    private final JButton consoleTwo;
    private final JButton consoleThree;
    private final JButton clock;
    private final JButton greenButs;
    private final JButton g1, g2, g3, g4, g5, g6, g7, g8, g9;

    public static void main(String[] args) {
        ERoom gui = new ERoom();
        gui.setUndecorated(false);
        gui.setVisible(true);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setTitle("Escape Room");
        gui.pack();
        gui.setSize(1200, 1000);
    }


    ERoom() {
        setSize(1000, 600);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        add(panel);
        panel.setLayout(null);

        wall = new Wall();
        wall.setBounds(50, 10, 1100, 600);
        panel.add(wall);

        inv = new Inventory();
        inv.setBounds(50, 620, 1100, 300);
        panel.add(inv);

        StopWatch timer = new StopWatch();
        timer.setBounds(1000, 800, 165, 115);
        panel.add(timer);

        JMenuBar menus = new JMenuBar();
        setJMenuBar(menus);
        JMenu fileMenu = new JMenu("File");
        menus.add(fileMenu);
        JMenuItem open = new JMenuItem("Open");
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
        pickNote.setBounds(405, 325, 60, 60);
        panel.add(pickNote);
        pickNote.setOpaque(false);
        pickNote.addActionListener(this);

        coldOne = new JButton(".");
        coldOne.setBounds(765, 174, 30, 80);
        panel.add(coldOne);
        coldOne.setOpaque(false);
        coldOne.addActionListener(this);

        //button to pick up the access card
        accessCard = new JButton(".");
        accessCard.setBounds(350, 410, 60, 60);
        panel.add(accessCard);
        accessCard.setOpaque(false);
        accessCard.addActionListener(this);

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

        //for wall 2
        clock = new JButton("clock");
        clock.setBounds(760, 147, 58, 58);
        panel.add(clock);
        clock.setOpaque(false);
        clock.addActionListener(this);

        greenButs = new JButton("Buts");
        greenButs.setBounds(533, 261, 120, 57);
        panel.add(greenButs);
        greenButs.setOpaque(false);
        greenButs.addActionListener(this);

        g1 = new JButton(".");
        g1.setBounds(95, 430, 58, 58);
        panel.add(g1);
        g1.setOpaque(false);
        g1.addActionListener(this);

        g2 = new JButton(".");
        g2.setBounds(217, 432, 58, 58);
        panel.add(g2);
        g2.setOpaque(false);
        g2.addActionListener(this);

        g3 = new JButton(".");
        g3.setBounds(339, 432, 58, 58);
        panel.add(g3);
        g3.setOpaque(false);
        g3.addActionListener(this);

        g4 = new JButton(".");
        g4.setBounds(461, 430, 58, 58);
        panel.add(g4);
        g4.setOpaque(false);
        g4.addActionListener(this);

        g5 = new JButton(".");
        g5.setBounds(577, 428, 58, 58);
        panel.add(g5);
        g5.setOpaque(false);
        g5.addActionListener(this);

        g6 = new JButton(".");
        g6.setBounds(698, 429, 58, 58);
        panel.add(g6);
        g6.setOpaque(false);
        g6.addActionListener(this);

        g7 = new JButton(".");
        g7.setBounds(815, 426, 58, 58);
        panel.add(g7);
        g7.setOpaque(false);
        g7.addActionListener(this);

        g8 = new JButton(".");
        g8.setBounds(938, 427, 58, 58);
        panel.add(g8);
        g8.setOpaque(false);
        g8.addActionListener(this);

        g9 = new JButton(".");
        g9.setBounds(1062, 420, 58, 58);
        panel.add(g9);
        g9.setOpaque(false);
        g9.addActionListener(this);
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
            if (wall.getVisWall() % 4 == 1) {
                wall.setNote();
                wall.redraw();
                inv.setNoteInv();
                inv.redrawInv();
            }
        }
        if (event.getSource() == coldOne) {
            if (wall.getVisWall() % 4 == 1) {
                wall.setOne();
                wall.redraw();
                inv.setColdOneInv();
                inv.redrawInv();
            }
        }
        //action listener for picking up the access card
        if (event.getSource() == accessCard) {
            if (wall.getVisWall() % 4 == 3) {
                wall.setOne();
                wall.redraw();
                inv.setCardInv();
                inv.redrawInv();
            }
        }

        if (event.getSource() == viewScreen) {
            if (wall.getVisWall() % 4 == 1) {
                wall.setVisWall(-1);
                wall.redraw();
            }
        }

        if (event.getSource() == exitScreen) {
            if (wall.getVisWall() == -1) {
                wall.setVisWall(1);
                wall.redraw();
            }
        }
        if (event.getSource() == consoleOne) {
            if (wall.getVisWall() == -1) {
                wall.setCenterConsole1();
                wall.redraw();
            }
        }
        if (event.getSource() == consoleTwo) {
            if (wall.getVisWall() == -1) {
                wall.setCenterConsole2();
                wall.redraw();
            }
        }
        if (event.getSource() == consoleThree) {
            if (wall.getVisWall() == -1) {
                wall.setCenterConsole3();
                wall.redraw();
            }
        }

        //actions for wall 2
        if (event.getSource() == clock) {
            if (wall.getVisWall() % 4 == 2) {
                wall.setVisWall(-3);
                wall.redraw();
            }
        }
        if (event.getSource() == greenButs) {
            if (wall.getVisWall() % 4 == 2) {
                wall.setVisWall(-4);
                wall.redraw();
            }
        }
        if (event.getSource() == g1) {
            if (wall.getVisWall() == -4) {
                wall.redraw();
            }
        }
        if (event.getSource() == g2) {
            if (wall.getVisWall() == -4) {
                wall.redraw();
            }
        }
        if (event.getSource() == g3) {
            if (wall.getVisWall() == -4) {
                wall.redraw();
            }
        }
        if (event.getSource() == g4) {
            if (wall.getVisWall() == -4) {
                wall.redraw();
            }
        }
        if (event.getSource() == g5) {
            if (wall.getVisWall() == -4) {
                wall.redraw();
            }
        }
        if (event.getSource() == g6) {
            if (wall.getVisWall() == -4) {
                wall.redraw();
            }
        }
        if (event.getSource() == g7) {
            if (wall.getVisWall() == -4) {
                wall.redraw();
            }
        }
        if (event.getSource() == g8) {
            if (wall.getVisWall() == -4) {
                wall.redraw();
            }
        }
        if (event.getSource() == g9) {
            if (wall.getVisWall() == -4) {
                wall.redraw();
            }
        }

    }
}
