package university_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EnterMarks extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4;
    JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11;
    JButton b;

    EnterMarks() { //500 550

        this.setBounds(450, 50, 500, 550);
        this.setLayout((LayoutManager)null);

        this.l1 = new JLabel("Enter marks of Student");
        this.l1.setFont(new Font("serif", 1, 30));
        this.l1.setBounds(50, 0, 500, 80);
        this.add(this.l1);

        this.l2 = new JLabel("Enter Roll Number");
        this.l2.setBounds(50, 70, 200, 40);
        this.add(this.l2);

        this.t1 = new JTextField();
        this.t1.setBounds(180, 80, 200, 20);
        this.add(this.t1);

        this.l3 = new JLabel("Enter Subject");
        this.l3.setBounds(50, 150, 200, 40);
        this.add(this.l3);

        this.l4 = new JLabel("Enter Marks");
        this.l4.setBounds(250, 150, 200, 40);
        this.add(this.l4);

        this.t2 = new JTextField();
        this.t2.setBounds(50, 200, 200, 20);
        this.add(this.t2);

        this.t3 = new JTextField();
        this.t3.setBounds(250, 200, 200, 20);
        this.add(this.t3);

        this.t4 = new JTextField();
        this.t4.setBounds(50, 230, 200, 20);
        this.add(this.t4);

        this.t5 = new JTextField();
        this.t5.setBounds(250, 230, 200, 20);
        this.add(this.t5);

        this.t6 = new JTextField();
        this.t6.setBounds(50, 260, 200, 20);
        this.add(this.t6);

        this.t7 = new JTextField();
        this.t7.setBounds(250, 260, 200, 20);
        this.add(this.t7);

        this.t8 = new JTextField();
        this.t8.setBounds(50, 290, 200, 20);
        this.add(this.t8);

        this.t9 = new JTextField();
        this.t9.setBounds(250, 290, 200, 20);
        this.add(this.t9);

        this.t10 = new JTextField();
        this.t10.setBounds(50, 320, 200, 20);
        this.add(this.t10);

        this.t11 = new JTextField();
        this.t11.setBounds(250, 320, 200, 20);
        this.add(this.t11);

        this.b = new JButton("Submit");
        this.b.setBounds(50, 360, 100, 30);
        this.b.setBackground(Color.BLACK);
        this.b.setForeground(Color.WHITE);
        this.add(this.b);

        this.b.addActionListener(this);

        this.getContentPane().setBackground(Color.WHITE);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == this.b) {
                conn c1 = new conn();
                String s1 = "insert into subject values('" + this.t1.getText() + "','" +
                        this.t2.getText() + "','" + this.t4.getText() + "','" + this.t6.getText() +
                        "','" + this.t8.getText() + "','" + this.t10.getText() + "')";
                String s2 = "insert into marks values('" + this.t1.getText() + "','" +
                        this.t3.getText() + "','" + this.t5.getText() + "','" + this.t7.getText() +
                        "','" + this.t9.getText() + "','" + this.t11.getText() + "')";
                c1.s.executeUpdate(s1);
                c1.s.executeUpdate(s2);
                JOptionPane.showMessageDialog((Component)null, "Marks Inserted Successfully");
                this.setVisible(false);
            }
        } catch (Exception var5) {
        }

    }

    public static void main(String[] args) {
        (new EnterMarks()).setVisible(true);
    }
}
