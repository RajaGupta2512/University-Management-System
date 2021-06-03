package university_management_system;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentFeeForm extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JTextField t1;
    private JTextField t2;
    private JTextField t3;
    private JComboBox comboBox;
    private JComboBox comboBox_1;
    private JComboBox comboBox_2;
    private JComboBox comboBox_3;
    JButton b1;
    JButton b2;
    Choice c1;

    public static void main(String[] args) {
        (new StudentFeeForm()).setVisible(true);
    }

    public StudentFeeForm() {
        super("Student Fee Form");
        this.setBounds(500, 100, 550, 450);
        this.contentPane = new JPanel();
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout((LayoutManager)null);
        this.c1 = new Choice();
        this.c1.setForeground(new Color(47, 79, 79));
        this.c1.setFont(new Font("Trebuchet MS", 1, 14));

        try {
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from student");

            while(rs.next()) {
                this.c1.add(rs.getString("rollno"));
            }
        } catch (SQLException var10) {
            var10.printStackTrace();
        }

        JLabel l1 = new JLabel("Select Roll No");
        l1.setForeground(new Color(25, 25, 112));
        l1.setFont(new Font("Tahoma", 1, 14));
        l1.setBounds(64, 63, 102, 22);
        this.contentPane.add(l1);
        JLabel l2 = new JLabel("Name");
        l2.setForeground(new Color(25, 25, 112));
        l2.setFont(new Font("Tahoma", 1, 14));
        l2.setBounds(64, 97, 102, 22);
        this.contentPane.add(l2);
        JLabel l3 = new JLabel("Father's Name");
        l3.setForeground(new Color(25, 25, 112));
        l3.setFont(new Font("Tahoma", 1, 14));
        l3.setBounds(64, 130, 102, 22);
        this.contentPane.add(l3);
        JLabel l4 = new JLabel("Branch");
        l4.setForeground(new Color(25, 25, 112));
        l4.setFont(new Font("Tahoma", 1, 14));
        l4.setBounds(64, 209, 102, 22);
        this.contentPane.add(l4);
        JLabel l5 = new JLabel("Semester");
        l5.setForeground(new Color(25, 25, 112));
        l5.setFont(new Font("Tahoma", 1, 14));
        l5.setBounds(64, 242, 102, 22);
        this.contentPane.add(l5);
        JLabel l6 = new JLabel("Total Payable");
        l6.setForeground(new Color(25, 25, 112));
        l6.setFont(new Font("Tahoma", 1, 14));
        l6.setBounds(64, 275, 102, 22);
        this.contentPane.add(l6);
        this.c1.setBounds(174, 66, 156, 20);
        this.contentPane.add(this.c1);
        this.t2 = new JTextField();
        this.t2.setForeground(new Color(47, 79, 79));
        this.t2.setFont(new Font("Trebuchet MS", 1, 14));
        this.t2.setColumns(10);
        this.t2.setBounds(174, 100, 156, 20);
        this.contentPane.add(this.t2);
        this.t3 = new JTextField();
        this.t3.setForeground(new Color(47, 79, 79));
        this.t3.setFont(new Font("Trebuchet MS", 1, 14));
        this.t3.setColumns(10);
        this.t3.setBounds(174, 133, 156, 20);
        this.contentPane.add(this.t3);

        try {
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from student where rollno = '" + this.c1.getSelectedItem() + "'");

            while(rs.next()) {
                this.t2.setText(rs.getString("name"));
                this.t3.setText(rs.getString("fathers_name"));
            }
        } catch (Exception var9) {
        }

        this.comboBox = new JComboBox();
        this.comboBox.setModel(new DefaultComboBoxModel(new String[]{"Mechanical", "CSE", "IT", "Civil", "Automobile", "Electronics", "Other"}));
        this.comboBox.setForeground(new Color(47, 79, 79));
        this.comboBox.setFont(new Font("Trebuchet MS", 1, 14));
        this.comboBox.setBounds(176, 211, 154, 20);
        this.contentPane.add(this.comboBox);
        this.comboBox_2 = new JComboBox();
        this.comboBox_2.setModel(new DefaultComboBoxModel(new String[]{"1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th"}));
        this.comboBox_2.setFont(new Font("Trebuchet MS", 1, 14));
        this.comboBox_2.setForeground(new Color(47, 79, 79));
        this.comboBox_2.setBounds(176, 244, 154, 20);
        this.contentPane.add(this.comboBox_2);
        this.t1 = new JTextField();
        this.t1.setForeground(new Color(47, 79, 79));
        this.t1.setFont(new Font("Trebuchet MS", 1, 14));
        this.t1.setColumns(10);
        this.t1.setBounds(176, 275, 154, 20);
        this.add(this.t1);
        this.b1 = new JButton("Pay");
        this.b1.addActionListener(this);
        this.b1.setFont(new Font("Trebuchet MS", 1, 14));
        this.b1.setBounds(64, 321, 111, 33);
        this.b1.setBackground(Color.BLACK);
        this.b1.setForeground(Color.WHITE);
        this.contentPane.add(this.b1);
        this.b2 = new JButton("Back");
        this.b2.addActionListener(this);
        this.b2.setFont(new Font("Trebuchet MS", 1, 14));
        this.b2.setBounds(198, 321, 111, 33);
        this.b2.setBackground(Color.BLACK);
        this.b2.setForeground(Color.WHITE);
        this.contentPane.add(this.b2);
        JLabel l7 = new JLabel("Course");
        l7.setForeground(new Color(25, 25, 112));
        l7.setFont(new Font("Tahoma", 1, 14));
        l7.setBounds(64, 173, 102, 22);
        this.contentPane.add(l7);
        this.comboBox_3 = new JComboBox();
        this.comboBox_3.setModel(new DefaultComboBoxModel(new String[]{"B.Tech", "M.Tech", "MBA", "BBA", "BCA", "B.Sc", "MCA"}));
        this.comboBox_3.setForeground(new Color(47, 79, 79));
        this.comboBox_3.setFont(new Font("Trebuchet MS", 1, 14));
        this.comboBox_3.setBounds(176, 176, 154, 20);
        this.contentPane.add(this.comboBox_3);
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(102, 205, 170), 2, true), "Fee-Form", 4, 2, (Font)null, new Color(30, 144, 255)));
        panel.setBackground(new Color(211, 211, 211));
        panel.setBounds(10, 38, 358, 348);
        this.contentPane.setBackground(Color.WHITE);
        panel.setBackground(Color.WHITE);
        this.contentPane.add(panel);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == this.b1) {
                try {
                    conn con = new conn();
                    String sql = "insert into fee(rollno, name, fathers_name, course, branch, semester, fee_paid) values(?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement st = con.c.prepareStatement(sql);
                    st.setString(1, this.c1.getSelectedItem());
                    st.setString(2, this.t2.getText());
                    st.setString(3, this.t3.getText());
                    st.setString(4, (String)this.comboBox_3.getSelectedItem());
                    st.setString(5, (String)this.comboBox.getSelectedItem());
                    st.setString(6, (String)this.comboBox_2.getSelectedItem());
                    st.setString(7, this.t1.getText());
                    int i = st.executeUpdate();
                    if (i > 0) {
                        JOptionPane.showMessageDialog((Component)null, "Successfully Paid");
                        this.setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog((Component)null, "error");
                    }
                } catch (SQLException var6) {
                    var6.printStackTrace();
                }
            }

            if (ae.getSource() == this.b2) {
                this.setVisible(false);
            }
        } catch (Exception var7) {
            var7.getMessage();
        }

    }
}
