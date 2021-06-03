package university_management_system;

import javax.swing.*;
import java.awt.*;

public class Home {

    public Home() {

    }

    public static void main(String[] s) {

        Frame f = new Frame("Dr. APJ Abdul Kalam University");
        f.setVisible(true);

        int x = 1;

        for(int i = 2; i <= 600; ++x) {
            f.setLocation(650 - (i + x) / 2, 350 - i / 2);
            f.setSize(i + 3 * x, i + x / 2);

            try {
                Thread.sleep(10L);
            } catch (Exception var5) {
            }

            i += 4;
        }

    }
}

class Frame extends JFrame implements Runnable {
    Thread t1;

    Frame(String s) {

        super(s);
        this.setLayout(new FlowLayout());

        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("university_management_system/icons/first.jpg"));
        Image i1 = c1.getImage().getScaledInstance(1000, 700, 1);
        ImageIcon i2 = new ImageIcon(i1);
        JLabel m1 = new JLabel(i2);
        this.add(m1);

        this.t1 = new Thread(this);
        this.t1.start();
    }

    public void run() {

        try {
            Thread.sleep(5000L);

            this.setVisible(false);
            new Login();
        } catch (Exception var2) {
            var2.printStackTrace();
        }

    }
}
