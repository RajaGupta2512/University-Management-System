package university_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class AddStudent implements ActionListener {

    JFrame f;
    JLabel id1, id2, id3, id4, id5, id6, id7, id8, id9, id10, id11, id12, id15, lab1, lab2;
    JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11;
    JButton b1, b2;
    JComboBox c1, c2;

    Random ran = new Random();
    long first4;
    long first;

    public AddStudent() {

        this.first4 = this.ran.nextLong() % 9000L + 1000L;
        this.first = Math.abs(this.first4);

        this.f = new JFrame("Add Student");
        this.f.setBackground(Color.white);
        this.f.setLayout((LayoutManager) null);

        this.id15 = new JLabel();
        this.id15.setBounds(0, 0, 900, 700);
        this.id15.setLayout((LayoutManager) null);

        this.id8 = new JLabel("New Student Details");
        this.id8.setBounds(320, 30, 500, 50);
        this.id8.setFont(new Font("serif", 2, 25));
        this.id8.setForeground(Color.black);
        this.id15.add(this.id8);
        this.f.add(this.id15);

        this.id1 = new JLabel("Name");
        this.id1.setBounds(50, 150, 100, 30);
        this.id1.setFont(new Font("serif", 1, 20));
        this.id15.add(this.id1);

        this.t1 = new JTextField();
        this.t1.setBounds(200, 150, 150, 30);
        this.id15.add(this.t1);

        this.id2 = new JLabel("Father's Name");
        this.id2.setBounds(400, 150, 200, 30);
        this.id2.setFont(new Font("serif", 1, 20));
        this.id15.add(this.id2);

        this.t2 = new JTextField();
        this.t2.setBounds(600, 150, 150, 30);
        this.id15.add(this.t2);

        this.id3 = new JLabel("Age");
        this.id3.setBounds(50, 200, 100, 30);
        this.id3.setFont(new Font("serif", 1, 20));
        this.id15.add(this.id3);

        this.t3 = new JTextField();
        this.t3.setBounds(200, 200, 150, 30);
        this.id15.add(this.t3);

        this.id4 = new JLabel("DOB (dd/mm/yyyy)");
        this.id4.setBounds(400, 200, 200, 30);
        this.id4.setFont(new Font("serif", 1, 20));
        this.id15.add(this.id4);

        this.t4 = new JTextField();
        this.t4.setBounds(600, 200, 150, 30);
        this.id15.add(this.t4);

        this.id5 = new JLabel("Address");
        this.id5.setBounds(50, 250, 100, 30);
        this.id5.setFont(new Font("serif", 1, 20));
        this.id15.add(this.id5);

        this.t5 = new JTextField();
        this.t5.setBounds(200, 250, 150, 30);
        this.id15.add(this.t5);

        this.id6 = new JLabel("Phone");
        this.id6.setBounds(400, 250, 100, 30);
        this.id6.setFont(new Font("serif", 1, 20));
        this.id15.add(this.id6);

        this.t6 = new JTextField();
        this.t6.setBounds(600, 250, 150, 30);
        this.id15.add(this.t6);

        this.id7 = new JLabel("Email Id");
        this.id7.setBounds(50, 300, 100, 30);
        this.id7.setFont(new Font("serif", 1, 20));
        this.id15.add(this.id7);

        this.t7 = new JTextField();
        this.t7.setBounds(200, 300, 150, 30);
        this.id15.add(this.t7);

        this.id9 = new JLabel("Class X(%)");
        this.id9.setBounds(400, 300, 130, 30);
        this.id9.setFont(new Font("serif", 1, 20));
        this.id15.add(this.id9);

        this.t8 = new JTextField();
        this.t8.setBounds(600, 300, 150, 30);
        this.id15.add(this.t8);

        this.id10 = new JLabel("Class XII(%)");
        this.id10.setBounds(50, 350, 130, 30);
        this.id10.setFont(new Font("serif", 1, 20));
        this.id15.add(this.id10);

        this.t9 = new JTextField();
        this.t9.setBounds(200, 350, 150, 30);
        this.id15.add(this.t9);

        this.id11 = new JLabel("Aadhar No");
        this.id11.setBounds(400, 350, 100, 30);
        this.id11.setFont(new Font("serif", 1, 20));
        this.id15.add(this.id11);

        this.t10 = new JTextField();
        this.t10.setBounds(600, 350, 150, 30);
        this.id15.add(this.t10);

        this.id12 = new JLabel("Roll No");
        this.id12.setBounds(50, 400, 150, 30);
        this.id12.setFont(new Font("serif", 1, 20));
        this.id15.add(this.id12);

        this.t11 = new JTextField();
        this.t11.setBounds(200, 400, 150, 30);
        this.t11.setText("1533" + this.first);
        this.id15.add(this.t11);

        this.lab1 = new JLabel("Course");
        this.lab1.setBounds(400, 400, 150, 30);
        this.lab1.setFont(new Font("serif", 1, 20));
        this.id15.add(this.lab1);

        String[] course = new String[]{"B.Tech", "BBA", "BCA", "Bsc", "Msc", "MBA", "MCA", "BA", "BCom"};
        this.c1 = new JComboBox(course);
        this.c1.setBackground(Color.WHITE);
        this.c1.setBounds(600, 400, 150, 30);
        this.id15.add(this.c1);

        this.lab2 = new JLabel("Branch");
        this.lab2.setBounds(50, 450, 150, 30);
        this.lab2.setFont(new Font("serif", 1, 20));
        this.id15.add(this.lab2);

        String[] branch = new String[]{"Computer Science", "Electronics", "Electrical", "Mechanical", "Civil"};

        this.c2 = new JComboBox(branch);
        this.c2.setBackground(Color.WHITE);
        this.c2.setBounds(200, 450, 150, 30);
        this.id15.add(this.c2);

        this.b1 = new JButton("Submit");
        this.b1.setBackground(Color.BLACK);
        this.b1.setForeground(Color.WHITE);
        this.b1.setBounds(250, 550, 150, 40);
        this.id15.add(this.b1);

        this.b2 = new JButton("Cancel");
        this.b2.setBackground(Color.BLACK);
        this.b2.setForeground(Color.WHITE);
        this.b2.setBounds(450, 550, 150, 40);
        this.id15.add(this.b2);

        this.b1.addActionListener(this);
        this.b2.addActionListener(this);

        this.f.setVisible(true);
        this.f.setBounds(300, 50, 900, 700);
    }

    public void actionPerformed (ActionEvent ae) {

        String a = this.t1.getText();
        String bb = this.t2.getText();
        String c = this.t3.getText();
        String d = this.t4.getText();
        String e = this.t5.getText();
        String ff = this.t6.getText();
        String g = this.t7.getText();
        String h = this.t8.getText();
        String i = this.t9.getText();
        String j = this.t10.getText();
        String k = this.t11.getText();
        String l = (String)this.c1.getSelectedItem();
        String m = (String)this.c2.getSelectedItem();

        if (ae.getSource() == this.b1) {
            try {
                conn cc = new conn();
                String q = "insert into student values('" + a + "','" + bb + "','" + c + "','" + d + "','" + e +
                        "','" + ff + "','" + g + "','" + h + "','" + i + "','" + j + "','" + k + "','" + l + "','"
                        + m + "')";
                cc.s.executeUpdate(q);
                JOptionPane.showMessageDialog((Component)null, "Student Details Inserted Successfully");
                this.f.setVisible(false);
            } catch (Exception var17) {
                System.out.println("The error is:" + var17);
            }
        }
        else if (ae.getSource() == this.b2) {
            this.f.setVisible(false);
            (new Project()).setVisible(true);
        }

    }

    public static void main(String[] arg) {
        (new AddStudent()).f.setVisible(true);
    }

}
