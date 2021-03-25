package CIS350Project;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StopWatch extends JPanel implements ActionListener{

    JFrame frame = new JFrame();
    JButton startButton = new JButton("START");
    JLabel timeLabel = new JLabel();
    int elapsedTime = 0;
    int seconds =0;
    int minutes =0;
    boolean started = false;
    String seconds_string = String.format("%02d", seconds);
    String minutes_string = String.format("%02d", minutes);

    Timer timer = new Timer(1000, new ActionListener() {

        public void actionPerformed(ActionEvent e) {

            elapsedTime=elapsedTime+1000;
            minutes = (elapsedTime/60000) % 60;
            seconds = (elapsedTime/1000) % 60;
            seconds_string = String.format("%02d", seconds);
            minutes_string = String.format("%02d", minutes);
            timeLabel.setText(minutes_string+":"+seconds_string);

        }

    });


    StopWatch(){


        timeLabel.setText(minutes_string+":"+seconds_string);
        timeLabel.setBounds(5,5,140,65);
        timeLabel.setFont(new Font("Verdana",Font.PLAIN,35));
        timeLabel.setBorder(BorderFactory.createBevelBorder(1));
        timeLabel.setOpaque(true);
        timeLabel.setHorizontalAlignment(JTextField.CENTER);

        startButton.setBounds(100,200,100,50);
        startButton.setFont(new Font("Ink Free",Font.PLAIN,20));
        startButton.setFocusable(false);
        startButton.addActionListener(this);

        //frame.add(startButton);
        frame.add(timeLabel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(165,115);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==startButton) {

            if(started==false) {
                started=true;
                startButton.setText("STOP");
                start();
            }
            else {
                started=false;
                startButton.setText("START");
                stop();
            }

        }
    }

    void start() {
        timer.start();
    }

    void stop() {
        timer.stop();
    }

    void reset() {
        timer.stop();
        elapsedTime=0;
        seconds =0;
        minutes=0;
        seconds_string = String.format("%02d", seconds);
        minutes_string = String.format("%02d", minutes);
      timeLabel.setText(minutes_string+":"+seconds_string);
    }

        public static void main(String[] args) {
            StopWatch stopwatch = new StopWatch();

        }

}

