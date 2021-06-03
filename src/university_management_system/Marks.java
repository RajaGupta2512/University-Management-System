package university_management_system;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

public class Marks extends JFrame {

    JTextArea t1;
    JPanel p1;

    Marks () {

    }

    Marks (String str) {

        setSize(500, 600);
        setLayout(new BorderLayout());
        setVisible(true);

        p1 = new JPanel();

        t1 = new JTextArea(50, 15);
        JScrollPane jsp = new JScrollPane(t1);
        t1.setFont(new Font("Sans-serif", Font.ITALIC, 16));

        add(p1, "North");

        add(jsp, "Center");
        setLocation(450, 200);
        mark(str);
    }

    public void mark(String s) {
        try {
            conn c = new conn();

            this.t1.setText("\tResult of Examination\n\nSubject\n");
            ResultSet rs1 = c.s.executeQuery("select * from subject where rollno=" + s);

            if (rs1.next()) {
                this.t1.append("\n\t" + rs1.getString("subject1"));
                this.t1.append("\n\t" + rs1.getString("subject2"));
                this.t1.append("\n\t" + rs1.getString("subject3"));
                this.t1.append("\n\t" + rs1.getString("subject4"));
                this.t1.append("\n\t" + rs1.getString("subject5"));
                this.t1.append("\n-----------------------------------------");
                this.t1.append("\n");
            }

            ResultSet rs2 = c.s.executeQuery("select * from marks where rollno=" + s);
            if (rs2.next()) {
                this.t1.append("\nMarks\n\n\t" + rs2.getString("marks1"));
                this.t1.append("\n\t" + rs2.getString("marks2"));
                this.t1.append("\n\t" + rs2.getString("marks3"));
                this.t1.append("\n\t" + rs2.getString("marks4"));
                this.t1.append("\n\t" + rs2.getString("marks5"));
                this.t1.append("\n-----------------------------------------");
                this.t1.append("\n");
            }
        } catch (Exception var5) {
            var5.printStackTrace();
        }

    }

    public static void main(String[] args) {
        (new Marks()).setVisible(true);
    }
}
