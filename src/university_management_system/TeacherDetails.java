package university_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class TeacherDetails extends JFrame implements ActionListener {

    JLabel l1, l2, l3;
    JTable t1;
    JButton b1, b2, b3;
    JTextField t2;
    String[] x = new String[]{"Name", "Father's Name", "Age", "Date of Birth", "Address", "Phone", "Email", "Class X(%)", "Class XII(%)", "Aadhar No", "Course", "Department", "Employee Id"};
    String[][] y = new String[20][13];
    int i = 0;
    int j = 0;

    TeacherDetails() {
        super("Teacher Details");
        this.setSize(1260, 650);
        this.setLocation(100, 100);
        this.setLayout((LayoutManager)null);

        this.l1 = new JLabel("Enter Emp Id to delete Teacher : ");
        this.l1.setBounds(50, 360, 400, 30);
        this.l1.setFont(new Font("serif", 1, 20));
        this.add(this.l1);

        this.t2 = new JTextField();
        this.t2.setBounds(400, 360, 200, 30);
        this.add(this.t2);

        this.b1 = new JButton("Delete");
        this.b1.setBackground(Color.BLACK);
        this.b1.setForeground(Color.WHITE);
        this.b1.setBounds(620, 360, 100, 30);
        this.add(this.b1);

        this.l2 = new JLabel("Add New Teacher");
        this.l2.setBounds(50, 450, 400, 30);
        this.l2.setFont(new Font("serif", 1, 20));
        this.add(this.l2);

        this.b2 = new JButton("Add");
        this.b2.setBackground(Color.BLACK);
        this.b2.setForeground(Color.WHITE);
        this.b2.setBounds(300, 450, 150, 30);
        this.add(this.b2);

        this.l3 = new JLabel("Update Teacher Details");
        this.l3.setBounds(50, 490, 400, 30);
        this.l3.setFont(new Font("serif", 1, 20));
        this.add(this.l3);

        this.b3 = new JButton("Update");
        this.b3.setBackground(Color.BLACK);
        this.b3.setForeground(Color.WHITE);
        this.b3.setBounds(300, 490, 150, 30);
        this.add(this.b3);

        this.b1.addActionListener(this);
        this.b2.addActionListener(this);
        this.b3.addActionListener(this);

        try {
            conn c1 = new conn();
            String s1 = "select * from teacher";

            for(ResultSet rs = c1.s.executeQuery(s1); rs.next(); this.j = 0) {
                this.y[this.i][this.j++] = rs.getString("name");
                this.y[this.i][this.j++] = rs.getString("fathers_name");
                this.y[this.i][this.j++] = rs.getString("age");
                this.y[this.i][this.j++] = rs.getString("dob");
                this.y[this.i][this.j++] = rs.getString("address");
                this.y[this.i][this.j++] = rs.getString("phone");
                this.y[this.i][this.j++] = rs.getString("email");
                this.y[this.i][this.j++] = rs.getString("class_x");
                this.y[this.i][this.j++] = rs.getString("class_xii");
                this.y[this.i][this.j++] = rs.getString("aadhar");
                this.y[this.i][this.j++] = rs.getString("course");
                this.y[this.i][this.j++] = rs.getString("dept");
                this.y[this.i][this.j++] = rs.getString("emp_id");
                ++this.i;
            }

            this.t1 = new JTable(this.y, this.x);
        } catch (Exception var4) {
            var4.printStackTrace();
        }

        JScrollPane sp = new JScrollPane(this.t1);
        sp.setBounds(20, 20, 1200, 330);
        this.add(sp);
        this.getContentPane().setBackground(Color.WHITE);
        this.b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        conn c1 = new conn();
        if (ae.getSource() == this.b1) {
            try {
                String a = this.t2.getText();
                String q = "delete from teacher where emp_id = '" + a + "'";
                c1.s.executeUpdate(q);
                this.setVisible(false);
                (new TeacherDetails()).setVisible(true);
            } catch (Exception var5) {
            }
        } else if (ae.getSource() == this.b2) {
            (new AddTeacher()).f.setVisible(true);
            this.setVisible(false);
        } else if (ae.getSource() == this.b3) {
            this.setVisible(false);
        }

    }

    public static void main(String[] args) {
        (new TeacherDetails()).setVisible(true);
    }
}
