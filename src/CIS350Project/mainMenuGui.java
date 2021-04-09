package CIS350Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainMenuGui extends JFrame implements ActionListener {

  private final JFrame frame;

    private final JButton startButton;
  private final JButton leaderButton;
  private final JButton loadButton;

    public ERoom room;
  public StopWatch timer;


    public mainMenuGui() {

       frame = new JFrame("SPACE ESCAPE");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Insets insets = frame.getInsets();
        frame.setSize(1200 + insets.left + insets.right,
                1000 + insets.top + insets.bottom);

      //JPanel s = new starsGui();
       //starsGui s = new starsGui();
       JLabel bg = new JLabel();
      bg.setIcon(new ImageIcon("stars.gif"));
       //s.setLayout(null);
      // s.setVisible(true);
       //frame.getContentPane().add(s);


        JPanel panel = new JPanel();

        panel.setLayout(null);
        //panel.add(bg);
        panel.setBackground(new Color(0, 0, 0, 255));
        panel.add(bg);
        //panel.add(s);
        //frame.add(s);
        //frame.getContentPane().add(s);

        JLabel label = new JLabel("SPACE ESCAPE");
       label.setFont(new Font("Monospace", Font.ITALIC, 50));
       label.setForeground(Color.white);
       label.setSize(400,200);
       label.setLocation(395,100);



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
        startButton.setBounds(500 + insets.left, 400 + insets.top,
                size.width + 50, size.height + 20);
        size = leaderButton.getPreferredSize();
        leaderButton.setBounds(495 + insets.left, 450 + insets.top,
                size.width + 50, size.height + 20);
        size = loadButton.getPreferredSize();
        loadButton.setBounds(500 + insets.left, 500 + insets.top,
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



    public void actionPerformed(ActionEvent e) {
        Object selc = e.getSource();

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

        if (leaderButton == selc){
        }

        if (loadButton == selc){
        }

    }
    public static void main(String[] args) {
        new mainMenuGui();

    }

}


