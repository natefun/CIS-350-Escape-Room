package CIS350Project;

import javax.swing.*;
import java.awt.event.*;

public class ERoom extends JFrame implements ActionListener {

    private JPanel panel;
    private final Wall wall;
    private final Inventory inv;
    private StopWatch timer;

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

    private final JButton clock;
    private final JButton greenButs;
    private final JButton g1, g2, g3, g4, g5, g6, g7, g8, g9;
    private final JButton arrow;

    //private final JLabel userWords;
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


    ERoom() {
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

//        timer = new StopWatch();
//        timer.setBounds(1000,800,165,115);
//        panel.add(timer);

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

        arrow = new JButton("->");
        arrow.setBounds(996, 332, 120, 39);
        panel.add(arrow);
        arrow.setOpaque(false);
        arrow.addActionListener(this);

        g4 = new JButton(".");
        g4.setBounds(95, 430, 58, 58);
        panel.add(g4);
        g4.setOpaque(false);
        g4.addActionListener(this);

        g9 = new JButton(".");
        g9.setBounds(217, 432, 58, 58);
        panel.add(g9);
        g9.setOpaque(false);
        g9.addActionListener(this);

        g7 = new JButton(".");
        g7.setBounds(339, 432, 58, 58);
        panel.add(g7);
        g7.setOpaque(false);
        g7.addActionListener(this);

        g1 = new JButton(".");
        g1.setBounds(461, 430, 58, 58);
        panel.add(g1);
        g1.setOpaque(false);
        g1.addActionListener(this);

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

        g3 = new JButton(".");
        g3.setBounds(815, 426, 58, 58);
        panel.add(g3);
        g3.setOpaque(false);
        g3.addActionListener(this);

        g8 = new JButton(".");
        g8.setBounds(938, 427, 58, 58);
        panel.add(g8);
        g8.setOpaque(false);
        g8.addActionListener(this);

        g2 = new JButton(".");
        g2.setBounds(1062, 420, 58, 58);
        panel.add(g2);
        g2.setOpaque(false);
        g2.addActionListener(this);

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
        if (event.getSource() == turnRight) {
            wall.setVisWall(wall.getVisWall() + 5);
            wall.redraw();
        }

        //Buttons on wall 1
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

        if (event.getSource() == viewBoard) {
            if (wall.getVisWall() == 1) {
                wall.setVisWall(-2);
                wall.redraw();
            }
        }

        //Buttons on wall -1
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

            //buttons on wall -2
            if (event.getSource() == exitScreen2) {
                if (wall.getVisWall() == -2) {
                    wall.setVisWall(1);
                    wall.redraw();
                }
            }

            if (event.getSource() == arrow) {
                if (wall.getVisWall() == -4) {
                    if (wall.getNum1() == 1 && wall.getNum2() == 2 &&
                            wall.getNum3() == 3) {
                        wall.passedGreen(true);
                    } else {
                        wall.setNum1(0);
                        wall.setNum2(0);
                        wall.setNum3(0);
                    }
                    wall.redraw();
                }
            }

            if (event.getSource() == g1) {
                if (wall.getVisWall() == -4) {
                    if (wall.getNum1() == 0) {
                        wall.setNum1(1);
                    } else if (wall.getNum2() == 0) {
                        wall.setNum2(1);
                    } else if (wall.getNum3() == 0) {
                        wall.setNum3(1);
                    }
                    wall.redraw();
                }
            }
            if (event.getSource() == g2) {
                if (wall.getVisWall() == -4) {
                    if (wall.getNum1() == 0) {
                        wall.setNum1(2);
                    } else if (wall.getNum2() == 0) {
                        wall.setNum2(2);
                    } else if (wall.getNum3() == 0) {
                        wall.setNum3(2);
                    }
                    wall.redraw();
                }
            }
            if (event.getSource() == g3) {
                if (wall.getVisWall() == -4) {
                    if (wall.getNum1() == 0) {
                        wall.setNum1(3);
                    } else if (wall.getNum2() == 0) {
                        wall.setNum2(3);
                    } else if (wall.getNum3() == 0) {
                        wall.setNum3(3);
                    }
                    wall.redraw();
                }
            }
            if (event.getSource() == g4) {
                if (wall.getVisWall() == -4) {
                    if (wall.getNum1() == 0) {
                        wall.setNum1(4);
                    } else if (wall.getNum2() == 0) {
                        wall.setNum2(4);
                    } else if (wall.getNum3() == 0) {
                        wall.setNum3(4);
                    }
                    wall.redraw();
                }
            }

            if (event.getSource() == g5) {
                if (wall.getVisWall() == -4) {
                    if (wall.getNum1() == 0) {
                        wall.setNum1(5);
                    } else if (wall.getNum2() == 0) {
                        wall.setNum2(5);
                    } else if (wall.getNum3() == 0) {
                        wall.setNum3(5);
                    }

                    wall.redraw();
                }
            }
            if (event.getSource() == g6) {
                if (wall.getVisWall() == -4) {
                    if (wall.getNum1() == 0) {
                        wall.setNum1(6);
                    } else if (wall.getNum2() == 0) {
                        wall.setNum2(6);
                    } else if (wall.getNum3() == 0) {
                        wall.setNum3(6);
                    }
                    wall.redraw();
                }
            }
            if (event.getSource() == g7) {
                if (wall.getVisWall() == -4) {
                    if (wall.getNum1() == 0) {
                        wall.setNum1(7);
                    } else if (wall.getNum2() == 0) {
                        wall.setNum2(7);
                    } else if (wall.getNum3() == 0) {
                        wall.setNum3(7);
                    }
                    wall.redraw();
                }
            }
            if (event.getSource() == g8) {
                if (wall.getVisWall() == -4) {
                    if (wall.getNum1() == 0) {
                        wall.setNum1(8);
                    } else if (wall.getNum2() == 0) {
                        wall.setNum2(8);
                    } else if (wall.getNum3() == 0) {
                        wall.setNum3(8);
                    }
                    wall.redraw();
                }
            }
            if (event.getSource() == g9) {
                if (wall.getVisWall() == -4) {
                    if (wall.getNum1() == 0) {
                        wall.setNum1(9);
                    } else if (wall.getNum2() == 0) {
                        wall.setNum2(9);
                    } else if (wall.getNum3() == 0) {
                        wall.setNum3(9);
                    }
                    wall.redraw();
                }
            }

        if (event.getSource() == fleet1) {
            if (wall.getVisWall() == -2) {
                wall.setFleet(1);
                wall.redraw();
            }
        }

            if (event.getSource() == fleet2) {
                if (wall.getVisWall() == -2) {
                    wall.setFleet(2);
                    wall.redraw();
                }
            }
            if (event.getSource() == fleet3) {
                if (wall.getVisWall() == -2) {
                    wall.setFleet(3);
                    wall.redraw();
                }
            }
            if (event.getSource() == fleet4) {
                if (wall.getVisWall() == -2) {
                    wall.setFleet(4);
                    wall.redraw();
                }
            }
            if (event.getSource() == fleet5) {
                if (wall.getVisWall() == -2) {
                    wall.setFleet(5);
                    wall.redraw();
                }
            }
            if (event.getSource() == fleet6) {
                if (wall.getVisWall() == -2) {
                    wall.setFleet(6);
                    wall.redraw();
                }
            }
            if (event.getSource() == fleet7) {
                if (wall.getVisWall() == -2) {
                    wall.setFleet(7);
                    wall.redraw();
                }
            }
            if (event.getSource() == fleet8) {
                if (wall.getVisWall() == -2) {
                    wall.setFleet(8);
                    wall.redraw();
                }
            }
            if (event.getSource() == fleet9) {
                if (wall.getVisWall() == -2) {
                    wall.setFleet(9);
                    wall.redraw();
                }
            }
            if (event.getSource() == fleet11) {
                if (wall.getVisWall() == -2) {
                    wall.setFleet(11);
                    wall.redraw();
                }
            }
            if (event.getSource() == fleet12) {
                if (wall.getVisWall() == -2) {
                    wall.setFleet(12);
                    wall.redraw();
                }
            }
            if (event.getSource() == fleet13) {
                if (wall.getVisWall() == -2) {
                    wall.setFleet(13);
                    wall.redraw();
                }
            }
            if (event.getSource() == fleet14) {
                if (wall.getVisWall() == -2) {
                    wall.setFleet(14);
                    wall.redraw();
                }
            }
            if (event.getSource() == fleet16) {
                if (wall.getVisWall() == -2) {
                    wall.setFleet(16);
                    wall.redraw();
                }
            }
            if (event.getSource() == clearFleet) {
                if (wall.getVisWall() == -2) {
                    wall.clearFleet();
                    wall.redraw();
                }
            }
            if (wall.getFleetPuzzle())
                inv.setClueOne();
            if (wall.getConsolePuzzle())
                inv.setClueFour();
            inv.redrawInv();


        }
    }



