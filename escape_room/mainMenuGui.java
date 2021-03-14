package escape_room;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainMenuGui extends JFrame implements ActionListener {

  private JButton startButton;
  private JButton leaderButton;
  private JButton loadButton;
  private JLabel label;


    public mainMenuGui() {

        JFrame frame = new JFrame("SPACE ESCAPE");
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



    public void actionPerformed(ActionEvent e) {
        Object selc = e.getSource();

        if (startButton == selc){
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


