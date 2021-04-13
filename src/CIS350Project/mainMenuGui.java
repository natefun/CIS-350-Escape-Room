package CIS350Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainMenuGui extends JFrame implements ActionListener {


/** final for frame **/
  private final JFrame frame;

    /** final for startButton **/
  private final JButton startButton;
    /** final for leaderButton **/

  private final JButton leaderButton;
    /** final for loadButton **/
  private final JButton loadButton;


  /** creates object room **/
  public ERoom room;

    /** creates object timer **/
  public StopWatch timer;

  private final JLabel label;



    /**
     * constructor mainMenuGui that create frame and panel
     * where JButtons are created
     *
     */
    public mainMenuGui() {

       frame = new JFrame("SPACE ESCAPE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Insets insets = frame.getInsets();
        frame.setSize(900 + insets.left + insets.right,
                800 + insets.top + insets.bottom);

      //JPanel s = new starsGui();
       starsGui s = new starsGui();
       //s.setLayout(null);
      // s.setVisible(true);
       //frame.getContentPane().add(s);


        JPanel panel = new JPanel();

        panel.setLayout(null);
        panel.setBackground(new Color(0, 0, 0, 255));
        //panel.add(s);
        //frame.add(s);
        //frame.getContentPane().add(s);

       label = new JLabel("SPACE ESCAPE");
       label.setFont(new Font("Monospace", Font.ITALIC, 50));
       label.setForeground(Color.white);
       label.setSize(400,200);
       label.setLocation(275,100);



        startButton = new JButton("start game");
        leaderButton = new JButton("leader board");
        loadButton = new JButton("load Game");


        panel.add(label);
        panel.add(startButton);
        panel.add(leaderButton);
        panel.add(loadButton);
        //panel.add(s);
        //frame.add(s);

     insets = panel.getInsets();

        Dimension size = startButton.getPreferredSize();
        startButton.setBounds(375 + insets.left, 300 + insets.top,
                size.width + 50, size.height + 20);
        size = leaderButton.getPreferredSize();
        leaderButton.setBounds(370 + insets.left, 350 + insets.top,
                size.width + 50, size.height + 20);
        size = loadButton.getPreferredSize();
        loadButton.setBounds(375 + insets.left, 400 + insets.top,
                size.width + 50, size.height + 20);



        startButton.addActionListener(this);
        leaderButton.addActionListener(this);
        loadButton.addActionListener(this);

        //s.add(panel);
        //frame.add(s);
        frame.add(panel);
        //frame.add(s);
        //frame.getContentPane().add(s);

        frame.setResizable(false);
        frame.setVisible(true);


    }

    /**
     * action perform method
     *
     * @param e for button click
     */

    public void actionPerformed(ActionEvent e) {
        Object selc = e.getSource();

//if the start button to start game and starts stopwatch
        if (startButton == selc){
            room = new ERoom();
            room.setVisible(true);

            Insets insets = frame.getInsets();
            room.setSize(1200 + insets.left + insets.right,
                    1000 + insets.top + insets.bottom);
            frame.dispose();

            timer = new StopWatch();
            timer.start();
        }
// shows leaderboard
        if (leaderButton == selc){
        }

        // allows the user to load a saved game
        if (loadButton == selc){
        }

    }

    /**
     * create the GUI
     * @param args
     */
    public static void main(String[] args) {
        new mainMenuGui();

    }

}


