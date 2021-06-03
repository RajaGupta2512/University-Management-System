package university_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login  extends JFrame implements ActionListener {

    JLabel l1;
    JLabel l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1;
    JButton b2;

    Login() {
        super("Login");
        this.setBackground(Color.white);
        this.setLayout((LayoutManager)null);

        this.l1 = new JLabel("Username");
        this.l1.setBounds(40, 20, 100, 30);
        this.add(this.l1);

        this.l2 = new JLabel("Password");
        this.l2.setBounds(40, 70, 100, 30);
        this.add(this.l2);

        this.t1 = new JTextField();
        this.t1.setBounds(150, 20, 150, 30);
        this.add(this.t1);

        this.t2 = new JPasswordField();
        this.t2.setBounds(150, 70, 150, 30);
        this.add(this.t2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("university_management_system/icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, 1);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(350, 20, 150, 150);
        this.add(l3);

        this.b1 = new JButton("Login");
        this.b1.setBounds(40, 140, 120, 30);
        this.b1.setFont(new Font("serif", 1, 15));
        this.b1.addActionListener(this);
        this.b1.setBackground(Color.BLACK);
        this.b1.setForeground(Color.WHITE);
        this.add(this.b1);

        this.b2 = new JButton("Cancel");
        this.b2.setBounds(180, 140, 120, 30);
        this.b2.setFont(new Font("serif", 1, 15));
        this.b2.setBackground(Color.BLACK);
        this.b2.setForeground(Color.WHITE);
        this.add(this.b2);

        this.b2.addActionListener(this);

        this.getContentPane().setBackground(Color.WHITE);
        this.setVisible(true); //600 300
        this.setBounds(450, 100, 600, 300);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {
            try {
                conn c1 = new conn();
                String u = this.t1.getText();
                String v = this.t2.getText();
                String q = "select * from login where username='" + u + "' and password='" + v + "'";
                ResultSet rs = c1.s.executeQuery(q);
                if (rs.next()) {
                    (new Project()).setVisible(true);
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog((Component) null, "Invalid login");
                    this.setVisible(false);
                }

            } catch (Exception var7) {
                var7.printStackTrace();
            }
        }
        else if (ae.getSource() == b2) {
            System.exit(0);
        }
    }

    public static void main(String[] arg) {
        new Login();
    }
}
