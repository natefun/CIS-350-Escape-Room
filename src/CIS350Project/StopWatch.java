package CIS350Project;


import java.awt.*;
import javax.swing.*;

public class StopWatch extends JPanel{

    final JFrame frame = new JFrame();
    final JButton startButton = new JButton("START");
    final JLabel timeLabel = new JLabel();
    int elapsedTime = 0;
    int seconds =0;
    int minutes =0;
    boolean started = false;
    String seconds_string = String.format("%02d", seconds);
    String minutes_string = String.format("%02d", minutes);


    //create the time for minutes and seconds
    final Timer timer = new Timer(1000, e -> {
        elapsedTime=elapsedTime+1000;
        minutes = (elapsedTime/60000) % 60;
        seconds = (elapsedTime/1000) % 60;
        seconds_string = String.format("%02d", seconds);
        minutes_string = String.format("%02d", minutes);
        timeLabel.setText(minutes_string+":"+seconds_string);

    });

    /**
     * constructor for the stopwatch
     */
    StopWatch(){


        timeLabel.setText(minutes_string+":"+seconds_string);
        timeLabel.setBounds(5,5,140,65);
        timeLabel.setFont(new Font("Verdana",Font.PLAIN,35));
        timeLabel.setBorder(BorderFactory.createBevelBorder(1));
        timeLabel.setOpaque(false);
        timeLabel.setHorizontalAlignment(JTextField.CENTER);


        frame.add(timeLabel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(165,115);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    /**
     * start the timer
     */
    void start() {
        timer.start();
    }

    /**
     * stops the timer
     */
    void stop() {
        timer.stop();
    }

    /**
     * resets the timer
     */
    void reset() {
        timer.stop();
        elapsedTime=0;
        seconds =0;
        minutes=0;
        seconds_string = String.format("%02d", seconds);
        minutes_string = String.format("%02d", minutes);
      timeLabel.setText(minutes_string+":"+seconds_string);
    }

    public String getMins(){
        return this.minutes_string;
    }

    public String getSec(){
        return this.seconds_string;
    }

    /**
     * creates the timer GUI
     * @param args
     */
        public static void main(String[] args) {
            StopWatch stopwatch = new StopWatch();

        }

}

