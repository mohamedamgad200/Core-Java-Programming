package threads.example3;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class DateAndTimeApp extends JFrame implements Runnable {
    Thread th;
    Date d = new Date();
    JLabel label = new JLabel();

    public DateAndTimeApp() {
        this.setTitle("Date Time App");
        this.add(label);
        label.setFont(new Font("Times Roman", Font.BOLD, 18));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        th = new Thread(this);
        th.start();
    }

    @Override
    public void run() {
        while (true) {
            d = new Date();
            this.label.setText(d.toString());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
               throw new RuntimeException(e);
            }
        }
    }
}
