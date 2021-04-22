package CIS350Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainMenuGui extends JFrame implements ActionListener {


/** final for frame **/
  private final JFrame frame;

 /** final for startButton */
  private final JButton startButton;

  /** creates object room */
  public ERoom room;


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




        JPanel panel = new JPanel(){
            public void paintComponent(Graphics g) {
               Image bg = new ImageIcon("main menu.png").getImage();
               g.drawImage(bg,0,0,this);
            }
        };

        panel.setLayout(null);
        //JLabel background = new JLabel(new ImageIcon("main menu.png"));
        panel.setBackground(new Color(0, 0, 0, 255));


        JLabel label = new JLabel("SPACE ESCAPE");
       label.setFont(new Font("Monospace", Font.ITALIC, 50));
       label.setForeground(Color.white);
       label.setSize(400,200);
       label.setLocation(275,100);



        startButton = new JButton("start game");



        panel.add(label);
        panel.add(startButton);


     insets = panel.getInsets();

        Dimension size = startButton.getPreferredSize();
        startButton.setBounds(375 + insets.left, 300 + insets.top,
                size.width + 50, size.height + 20);

        startButton.addActionListener(this);

        //0panel.add(background);
        frame.add(panel);


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
        if (startButton == selc) {
            room = new ERoom();
            room.setVisible(true);

            Insets insets = frame.getInsets();
            room.setSize(1200 + insets.left + insets.right,
                    1000 + insets.top + insets.bottom);
            frame.dispose();

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


