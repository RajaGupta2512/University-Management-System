package university_management_system;

import javax.swing.*;
import java.awt.*;

public class AboutUs extends JFrame {

    private JPanel contentPane;

    public static void main(String[] args) {
        (new AboutUs()).setVisible(true);
    }

    public AboutUs() {

        super("About Us - Dr. APJ Abdul Kalam Technical University");
        this.setBackground(new Color(173, 216, 230));
        this.setBounds(400, 100, 700, 500);
        this.contentPane = new JPanel();
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout((LayoutManager)null);

        new JLabel("New label");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("university_management_system/icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(250, 100, 1);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(400, 40, 250, 100);
        this.contentPane.add(l1);

        JLabel l3 = new JLabel("University");
        l3.setForeground(new Color(0, 250, 154));
        l3.setFont(new Font("Trebuchet MS", 3, 34));
        l3.setBounds(140, 40, 200, 55);
        this.contentPane.add(l3);

        JLabel l4 = new JLabel("Mangement System");
        l4.setForeground(new Color(127, 255, 0));
        l4.setFont(new Font("Trebuchet MS", 3, 34));
        l4.setBounds(70, 90, 405, 40);
        this.contentPane.add(l4);

        JLabel l5 = new JLabel("v5.1");
        l5.setForeground(new Color(30, 144, 255));
        l5.setFont(new Font("Trebuchet MS", 1, 25));
        l5.setBounds(185, 140, 100, 21);
        this.contentPane.add(l5);

        JLabel l6 = new JLabel("Developed By : Raja Gupta");
        l6.setFont(new Font("Trebuchet MS", 1, 30));
        l6.setBounds(70, 198, 600, 35);
        this.contentPane.add(l6);

        JLabel l7 = new JLabel("Roll Number - 17492100XX");
        l7.setFont(new Font("Trebuchet MS", 1, 20));
        l7.setBounds(70, 260, 600, 34);
        this.contentPane.add(l7);

        JLabel l8 = new JLabel("Contact : raja.gupta2512@gmail.com");
        l8.setFont(new Font("Trebuchet MS", 1, 20));
        l8.setBounds(70, 290, 600, 34);
        this.contentPane.add(l8);

        JLabel l9 = new JLabel("Education - B.Tech (Computer Science and Engineering)");
        l9.setFont(new Font("Trebuchet MS", 1, 20));
        l9.setBounds(70, 320, 600, 34);
        this.contentPane.add(l9);

        JLabel l10 = new JLabel("Phone - +91 9999 999999");
        l10.setForeground(new Color(47, 79, 79));
        l10.setFont(new Font("Trebuchet MS", 3, 18));
        l10.setBounds(70, 400, 600, 34);
        this.contentPane.add(l10);
        this.contentPane.setBackground(Color.WHITE);
    }
}
