package university_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class UpdateStudent implements ActionListener {

    JFrame f = new JFrame("Update Student details");
    JLabel id;
    JLabel id1;
    JLabel id2;
    JLabel id3;
    JLabel id4;
    JLabel id5;
    JLabel id6;
    JLabel id7;
    JLabel id8;
    JLabel id9;
    JLabel id10;
    JLabel id11;
    JLabel id12;
    JLabel id15;
    JLabel lab;
    JLabel lab1;
    JLabel lab2;
    JTextField t;
    JTextField t1;
    JTextField t2;
    JTextField t3;
    JTextField t4;
    JTextField t5;
    JTextField t6;
    JTextField t7;
    JTextField t8;
    JTextField t9;
    JTextField t10;
    JTextField t11;
    JTextField t12;
    JTextField t13;
    JTextField t14;
    JButton b;
    JButton b1;
    JButton b2;
    String id_emp;

    UpdateStudent() {
        this.f.setSize(900, 650);
        this.f.setLocation(300, 100);
        this.f.setBackground(Color.white);
        this.f.setLayout((LayoutManager)null);
        JLabel l1 = new JLabel("Enter roll number to update the data of student");
        l1.setBounds(50, 100, 500, 30);
        l1.setFont(new Font("serif", 2, 20));
        this.f.add(l1);
        this.t12 = new JTextField();
        this.t12.setBounds(500, 100, 200, 30);
        this.f.add(this.t12);
        this.b2 = new JButton("Update");
        this.b2.setBackground(Color.BLACK);
        this.b2.setForeground(Color.WHITE);
        this.b2.setBounds(720, 100, 100, 30);
        this.f.add(this.b2);
        this.b2.addActionListener(this);
        this.id8 = new JLabel("Update Student Details:");
        this.id8.setBounds(50, 10, 500, 50);
        this.id8.setFont(new Font("serif", 2, 40));
        this.id8.setForeground(Color.black);
        this.f.add(this.id8);
        this.id1 = new JLabel("Name");
        this.id1.setBounds(50, 170, 100, 30);
        this.id1.setFont(new Font("serif", 1, 20));
        this.f.add(this.id1);
        this.t1 = new JTextField();
        this.t1.setBounds(200, 170, 150, 30);
        this.f.add(this.t1);
        this.id2 = new JLabel("Father's Name");
        this.id2.setBounds(400, 170, 200, 30);
        this.id2.setFont(new Font("serif", 1, 20));
        this.f.add(this.id2);
        this.t2 = new JTextField();
        this.t2.setBounds(600, 170, 150, 30);
        this.f.add(this.t2);
        this.id3 = new JLabel("Age");
        this.id3.setBounds(50, 220, 100, 30);
        this.id3.setFont(new Font("serif", 1, 20));
        this.f.add(this.id3);
        this.t3 = new JTextField();
        this.t3.setBounds(200, 220, 150, 30);
        this.f.add(this.t3);
        this.id4 = new JLabel("DOB (dd/mm/yyyy)");
        this.id4.setBounds(400, 220, 200, 30);
        this.id4.setFont(new Font("serif", 1, 20));
        this.f.add(this.id4);
        this.t4 = new JTextField();
        this.t4.setBounds(600, 220, 150, 30);
        this.f.add(this.t4);
        this.id5 = new JLabel("Address");
        this.id5.setBounds(50, 270, 100, 30);
        this.id5.setFont(new Font("serif", 1, 20));
        this.f.add(this.id5);
        this.t5 = new JTextField();
        this.t5.setBounds(200, 270, 150, 30);
        this.f.add(this.t5);
        this.id6 = new JLabel("Phone");
        this.id6.setBounds(400, 270, 100, 30);
        this.id6.setFont(new Font("serif", 1, 20));
        this.f.add(this.id6);
        this.t6 = new JTextField();
        this.t6.setBounds(600, 270, 150, 30);
        this.f.add(this.t6);
        this.id7 = new JLabel("Email Id");
        this.id7.setBounds(50, 320, 100, 30);
        this.id7.setFont(new Font("serif", 1, 20));
        this.f.add(this.id7);
        this.t7 = new JTextField();
        this.t7.setBounds(200, 320, 150, 30);
        this.f.add(this.t7);
        this.id9 = new JLabel("Class X(%)");
        this.id9.setBounds(400, 320, 130, 30);
        this.id9.setFont(new Font("serif", 1, 20));
        this.f.add(this.id9);
        this.t8 = new JTextField();
        this.t8.setBounds(600, 320, 150, 30);
        this.f.add(this.t8);
        this.id10 = new JLabel("Class XII(%)");
        this.id10.setBounds(50, 370, 130, 30);
        this.id10.setFont(new Font("serif", 1, 20));
        this.f.add(this.id10);
        this.t9 = new JTextField();
        this.t9.setBounds(200, 370, 150, 30);
        this.f.add(this.t9);
        this.id11 = new JLabel("Aadhar No");
        this.id11.setBounds(400, 370, 100, 30);
        this.id11.setFont(new Font("serif", 1, 20));
        this.f.add(this.id11);
        this.t10 = new JTextField();
        this.t10.setBounds(600, 370, 150, 30);
        this.f.add(this.t10);
        this.id12 = new JLabel("Roll No");
        this.id12.setBounds(50, 420, 150, 30);
        this.id12.setFont(new Font("serif", 1, 20));
        this.f.add(this.id12);
        this.t11 = new JTextField();
        this.t11.setBounds(200, 420, 150, 30);
        this.f.add(this.t11);
        this.lab = new JLabel("Course");
        this.lab.setBounds(400, 420, 150, 30);
        this.lab.setFont(new Font("serif", 1, 20));
        this.f.add(this.lab);
        this.t13 = new JTextField();
        this.t13.setBounds(600, 420, 150, 30);
        this.f.add(this.t13);
        this.lab2 = new JLabel("Branch");
        this.lab2.setBounds(50, 470, 150, 30);
        this.lab2.setFont(new Font("serif", 1, 20));
        this.f.add(this.lab2);
        this.t14 = new JTextField();
        this.t14.setBounds(200, 470, 150, 30);
        this.f.add(this.t14);
        this.b = new JButton("Submit");
        this.b.setBackground(Color.BLACK);
        this.b.setForeground(Color.WHITE);
        this.b.setBounds(250, 520, 150, 40);
        this.f.add(this.b);
        this.b1 = new JButton("Cancel");
        this.b1.setBackground(Color.BLACK);
        this.b1.setForeground(Color.WHITE);
        this.b1.setBounds(450, 520, 150, 40);
        this.f.add(this.b1);
        this.b.addActionListener(this);
        this.b1.addActionListener(this);
        this.f.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        conn con;
        String str;
        if (ae.getSource() == this.b) {
            try {
                con = new conn();
                str = "update student set name='" + this.t1.getText() + "',fathers_name='" + this.t2.getText() + "',age='" + this.t3.getText() + "', dob='" + this.t4.getText() + "',address='" + this.t5.getText() + "',phone='" + this.t6.getText() + "',email='" + this.t7.getText() + "',class_x='" + this.t8.getText() + "',class_xii='" + this.t9.getText() + "',aadhar='" + this.t10.getText() + "',course='" + this.t13.getText() + "',branch='" + this.t14.getText() + "' where rollno='" + this.t12.getText() + "'";
                con.s.executeUpdate(str);
                JOptionPane.showMessageDialog((Component)null, "successfully updated");
                this.f.setVisible(false);
                new StudentDetails();
            } catch (Exception var6) {
                System.out.println("The error is:" + var6);
            }
        }

        if (ae.getSource() == this.b1) {
            this.f.setVisible(false);
            (new Project()).setVisible(true);
        }

        if (ae.getSource() == this.b2) {
            try {
                con = new conn();
                str = "select * from student where rollno = '" + this.t12.getText() + "'";
                ResultSet rs = con.s.executeQuery(str);
                if (rs.next()) {
                    this.f.setVisible(true);
                    this.t1.setText(rs.getString(1));
                    this.t2.setText(rs.getString(2));
                    this.t3.setText(rs.getString(3));
                    this.t4.setText(rs.getString(4));
                    this.t5.setText(rs.getString(5));
                    this.t6.setText(rs.getString(6));
                    this.t7.setText(rs.getString(7));
                    this.t8.setText(rs.getString(8));
                    this.t9.setText(rs.getString(9));
                    this.t10.setText(rs.getString(10));
                    this.t11.setText(rs.getString(11));
                    this.t13.setText(rs.getString(12));
                    this.t14.setText(rs.getString(13));
                }
            } catch (Exception var5) {
            }

            this.f.setVisible(true);
            this.f.setSize(900, 650);
            this.f.setLocation(450, 250);
        }

    }

    public static void main(String[] arg) {
        (new UpdateStudent()).f.setVisible(true);
    }
}
