package university_management_system;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class StudentAttendanceDetails extends JFrame implements ActionListener {

    JTable j1;
    JButton b1;
    String[] h = new String[]{"Roll Number", "Date Time", "First Half", "Second Half"};
    String[][] d = new String[15][4];
    int i = 0;
    int j = 0;

    StudentAttendanceDetails() {
        super("View Students Attendence");
        this.setSize(800, 300);
        this.setLocation(450, 150);

        try {
            String q = "select * from attendance_student";
            conn c1 = new conn();

            for(ResultSet rs = c1.s.executeQuery(q); rs.next(); this.j = 0) {
                this.d[this.i][this.j++] = rs.getString("rollno");
                this.d[this.i][this.j++] = rs.getString("Date");
                this.d[this.i][this.j++] = rs.getString("first");
                this.d[this.i][this.j++] = rs.getString("second");
                ++this.i;
            }

            this.j1 = new JTable(this.d, this.h);
        } catch (Exception var4) {
        }

        this.b1 = new JButton("Print");
        this.add(this.b1, "South");
        JScrollPane s1 = new JScrollPane(this.j1);
        this.add(s1);
        this.b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {

        try {
            this.j1.print();
        } catch (Exception var3) {
            var3.getMessage();
        }

    }

    public static void main(String[] args) {
        (new StudentAttendanceDetails()).setVisible(true);
    }
}
