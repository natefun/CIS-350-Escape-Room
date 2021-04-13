package CIS350Project;

import javax.swing.*;
import java.awt.event.*;

public class ERoom extends JFrame implements ActionListener{
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
    private final JButton viewScreen;
    private final JButton viewBoard;
    private final JButton exitScreen;
    private final JButton consoleOne;
    private final JButton consoleTwo;
    private final JButton consoleThree;
    private final JButton exitScreen2;
    private final JButton fleet1;
    private final JButton fleet2;
    private final JButton fleet3;
    private final JButton fleet4;
    private final JButton fleet5;
    private final JButton fleet6;
    private final JButton fleet7;
    private final JButton fleet8;
    private final JButton fleet9;
    private final JButton fleet11;
    private final JButton fleet12;
    private final JButton fleet13;
    private final JButton fleet14;
    private final JButton fleet16;
    private final JButton clearFleet;
    private final JButton accessCard; //button for picking up access card

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
        JPanel panel = new JPanel();
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

        viewBoard = new JButton("x");
        viewBoard.setBounds(790, 220, 170, 100);
        panel.add(viewBoard);
        viewBoard.setOpaque(false);
        viewBoard.addActionListener(this);

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

        //for board close up
        exitScreen2 = new JButton("x");
        exitScreen2.setBounds(1090, 30, 30, 30);
        panel.add(exitScreen2);
        exitScreen2.setOpaque(false);
        exitScreen2.addActionListener(this);

        fleet1 = new JButton();
        fleet1.setBounds(459, 161, 10, 10);
        panel.add(fleet1);
        fleet1.setOpaque(false);
        fleet1.addActionListener(this);

        fleet2 = new JButton();
        fleet2.setBounds(557, 161, 10, 10);
        panel.add(fleet2);
        fleet2.setOpaque(false);
        fleet2.addActionListener(this);

        fleet3 = new JButton();
        fleet3.setBounds(651, 161, 10, 10);
        panel.add(fleet3);
        fleet3.setOpaque(false);
        fleet3.addActionListener(this);

        fleet4 = new JButton();
        fleet4.setBounds(748, 161, 10, 10);
        panel.add(fleet4);
        fleet4.setOpaque(false);
        fleet4.addActionListener(this);

        fleet5 = new JButton();
        fleet5.setBounds(459, 266, 10, 10);
        panel.add(fleet5);
        fleet5.setOpaque(false);
        fleet5.addActionListener(this);

        fleet6 = new JButton();
        fleet6.setBounds(557, 266, 10, 10);
        panel.add(fleet6);
        fleet6.setOpaque(false);
        fleet6.addActionListener(this);

        fleet7 = new JButton();
        fleet7.setBounds(651, 266, 10, 10);
        panel.add(fleet7);
        fleet7.setOpaque(false);
        fleet7.addActionListener(this);

        fleet8 = new JButton();
        fleet8.setBounds(748, 266, 10, 10);
        panel.add(fleet8);
        fleet8.setOpaque(false);
        fleet8.addActionListener(this);

        fleet9 = new JButton();
        fleet9.setBounds(459, 375, 10, 10);
        panel.add(fleet9);
        fleet9.setOpaque(false);
        fleet9.addActionListener(this);

        fleet11 = new JButton();
        fleet11.setBounds(651, 375, 10, 10);
        panel.add(fleet11);
        fleet11.setOpaque(false);
        fleet11.addActionListener(this);

        fleet12 = new JButton();
        fleet12.setBounds(748, 375, 10, 10);
        panel.add(fleet12);
        fleet12.setOpaque(false);
        fleet12.addActionListener(this);

        fleet13 = new JButton();
        fleet13.setBounds(459, 479, 10, 10);
        panel.add(fleet13);
        fleet13.setOpaque(false);
        fleet13.addActionListener(this);

        fleet14 = new JButton();
        fleet14.setBounds(557, 479, 10, 10);
        panel.add(fleet14);
        fleet14.setOpaque(false);
        fleet14.addActionListener(this);

        fleet16 = new JButton();
        fleet16.setBounds(748, 479, 10, 10);
        panel.add(fleet16);
        fleet16.setOpaque(false);
        fleet16.addActionListener(this);

        clearFleet = new JButton();
        clearFleet.setBounds(83, 180, 155, 50);
        panel.add(clearFleet);
        clearFleet.setOpaque(false);
        clearFleet.addActionListener(this);


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
<<<<<<< HEAD
        }
=======
            if (event.getSource() == turnRight) {
                wall.setVisWall(wall.getVisWall() + 5);
                wall.redraw();
            }
>>>>>>> 2b132e6c8745ca8708ee6ec8d65d18602332b22a

            //Buttons on wall 1
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
                if(wall.getVisWall()%4==1) {
                    wall.setVisWall(-1);
                    wall.redraw();
                }
            }

            if (event.getSource() == viewBoard) {
                if(wall.getVisWall() == 1) {
                    wall.setVisWall(-2);
                    wall.redraw();
                }
            }

            //Buttons on wall -1
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

            //buttons on wall -2
            if (event.getSource() == exitScreen2) {
                if(wall.getVisWall()==-2) {
                    wall.setVisWall(1);
                    wall.redraw();
                }
            }
<<<<<<< HEAD
        }
        if (event.getSource() == greenButs) {
            if (wall.getVisWall() % 4 == 2) {
                   wall.setVisWall(-4);
                    wall.redraw();
=======

            if (event.getSource() == fleet1) {
                if(wall.getVisWall() == -2) {
                    wall.setFleet(1);
                    wall.redraw();
                }
>>>>>>> 2b132e6c8745ca8708ee6ec8d65d18602332b22a
            }
            if (event.getSource() == fleet2) {
                if(wall.getVisWall() == -2) {
                    wall.setFleet(2);
                    wall.redraw();
                }
            }
            if (event.getSource() == fleet3) {
                if(wall.getVisWall() == -2) {
                    wall.setFleet(3);
                    wall.redraw();
                }
            }
            if (event.getSource() == fleet4) {
                if(wall.getVisWall() == -2) {
                    wall.setFleet(4);
                    wall.redraw();
                }
            }
            if (event.getSource() == fleet5) {
                if(wall.getVisWall() == -2) {
                    wall.setFleet(5);
                    wall.redraw();
                }
            }
<<<<<<< HEAD
        } if (event.getSource() == g5) {
            if (wall.getVisWall() == -4) {
                wall.redraw();
            }
        } if (event.getSource() == g6) {
            if (wall.getVisWall() == -4) {
                wall.redraw();
            }
        } if (event.getSource() == g7) {
            if (wall.getVisWall() == -4) {
                wall.redraw();
            }
        } if (event.getSource() == g8) {
            if (wall.getVisWall() == -4) {
                wall.redraw();
            }
        } if (event.getSource() == g9) {
            if (wall.getVisWall() == -4) {
                wall.redraw();
=======
            if (event.getSource() == fleet6) {
                if(wall.getVisWall() == -2) {
                    wall.setFleet(6);
                    wall.redraw();
                }
            }
            if (event.getSource() == fleet7) {
                if(wall.getVisWall() == -2) {
                    wall.setFleet(7);
                    wall.redraw();
                }
            }
            if (event.getSource() == fleet8) {
                if(wall.getVisWall() == -2) {
                    wall.setFleet(8);
                    wall.redraw();
                }
            }
            if (event.getSource() == fleet9) {
                if(wall.getVisWall() == -2) {
                    wall.setFleet(9);
                    wall.redraw();
                }
            }
            if (event.getSource() == fleet11) {
                if(wall.getVisWall() == -2) {
                    wall.setFleet(11);
                    wall.redraw();
                }
            }
            if (event.getSource() == fleet12) {
                if(wall.getVisWall() == -2) {
                    wall.setFleet(12);
                    wall.redraw();
                }
>>>>>>> 2b132e6c8745ca8708ee6ec8d65d18602332b22a
            }
            if (event.getSource() == fleet13) {
                if(wall.getVisWall() == -2) {
                    wall.setFleet(13);
                    wall.redraw();
                }
            }
            if (event.getSource() == fleet14) {
                if(wall.getVisWall() == -2) {
                    wall.setFleet(14);
                    wall.redraw();
                }
            }
            if (event.getSource() == fleet16) {
                if(wall.getVisWall() == -2) {
                    wall.setFleet(16);
                    wall.redraw();
                }
            }
            if (event.getSource() == clearFleet) {
                if(wall.getVisWall() == -2) {
                    wall.clearFleet();
                    wall.redraw();
                }
            }
            if(wall.getFleetPuzzle())
                inv.setClueOne();
            if(wall.getConsolePuzzle())
                inv.setClueFour();
            inv.redrawInv();



        }

<<<<<<< HEAD
     }
=======
>>>>>>> 2b132e6c8745ca8708ee6ec8d65d18602332b22a
}
