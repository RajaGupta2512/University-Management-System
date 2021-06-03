package university_management_system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ExamDetails extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JTable table;
    private JTextField search;
    private JButton b;

    public void Book() {
        try {
            conn con = new conn();
            String sql = "select * from student";
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            this.table.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            st.close();
            con.c.close();
        } catch (Exception var5) {
        }

    }

    public ExamDetails() {

        super("Exam Details");
        this.setBounds(200, 200, 930, 475);
        this.contentPane = new JPanel();
        this.contentPane.setBackground(Color.WHITE);
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout((LayoutManager)null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(79, 133, 1080, 282);
        this.contentPane.add(scrollPane);

        this.table = new JTable();
        this.table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent arg0) {
                int row = ExamDetails.this.table.getSelectedRow();
                ExamDetails.this.search.setText(ExamDetails.this.table.getModel().getValueAt(row, 10).toString());
            }
        });

        this.table.setBackground(new Color(240, 248, 255));
        this.table.setForeground(Color.DARK_GRAY);
        this.table.setFont(new Font("Trebuchet MS", 1, 16));
        scrollPane.setViewportView(this.table);

        this.b = new JButton("Result");
        this.b.addActionListener(this);
        this.b.setBorder(new LineBorder(new Color(255, 20, 147), 2, true));
        this.b.setForeground(new Color(199, 21, 133));
        this.b.setFont(new Font("Trebuchet MS", 1, 18));
        this.b.setBounds(564, 89, 138, 33);
        this.contentPane.add(this.b);

        JLabel l1 = new JLabel("Check Result");
        l1.setForeground(new Color(107, 142, 35));
        l1.setFont(new Font("Trebuchet MS", 3, 30));
        l1.setBounds(300, 15, 400, 47);
        this.contentPane.add(l1);

        this.search = new JTextField();
        this.search.setBackground(new Color(255, 240, 245));
        this.search.setBorder(new LineBorder(new Color(255, 105, 180), 2, true));
        this.search.setForeground(new Color(47, 79, 79));
        this.search.setFont(new Font("Trebuchet MS", 3, 17));
        this.search.setBounds(189, 89, 357, 33);
        this.contentPane.add(this.search);
        this.search.setColumns(10);

        JLabel l3 = new JLabel("Back");
        l3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
            }
        });
        l3.setForeground(Color.GRAY);
        l3.setFont(new Font("Trebuchet MS", 1, 18));
        l3.setBounds(97, 89, 72, 33);
        this.contentPane.add(l3);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 128, 128), 3,
                true), "Book-Details", 4, 2, (Font)null, new Color(0, 128, 0)));
        panel.setBounds(67, 54, 1100, 368);
        this.contentPane.add(panel);
        panel.setBackground(Color.WHITE);

        this.Book();
        this.setBounds(200, 50,1200, 500);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            new conn();
            if (ae.getSource() == this.b) {
                (new Marks(this.search.getText())).setVisible(true);
                this.setVisible(false);
            }
        } catch (Exception var3) {
            var3.getMessage();
        }

    }

    public static void main(String[] args) {
        (new ExamDetails()).setVisible(true);
    }
}
