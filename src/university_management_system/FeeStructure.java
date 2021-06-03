package university_management_system;

import javax.swing.*;
import java.awt.*;

public class FeeStructure extends JFrame {

    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17;
    JLabel i1, b1, b2, b3, b4, b5, b6, b7, b8;
    JLabel bb1, bb2, bb3, bb4, bb5, bb6, bb7, bb8, bb9, bb10, bb11, bb12, bb13, bb14, bb15, bb16, bb17, bb18;
    JLabel m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12;

    public FeeStructure() {

        this.setBounds(5, 20, 1530, 750);
        this.setLayout((LayoutManager)null);

        this.i1 = new JLabel("Fee Structure");
        this.i1.setFont(new Font("serif", 2, 56));
        this.i1.setBounds(600, 10, 400, 70);
        this.add(this.i1);

        this.l1 = new JLabel("Course");
        this.l1.setBounds(10, 100, 100, 40);
        this.l1.setFont(new Font("serif", 1, 26));
        this.add(this.l1);

        this.l2 = new JLabel("BTech");
        this.l2.setBounds(250, 100, 100, 40);
        this.l2.setFont(new Font("serif", 1, 26));
        this.add(this.l2);

        this.l3 = new JLabel("BCA");
        this.l3.setBounds(450, 100, 100, 40);
        this.l3.setFont(new Font("serif", 1, 26));
        this.add(this.l3);

        this.l4 = new JLabel("BBA");
        this.l4.setBounds(650, 100, 100, 40);
        this.l4.setFont(new Font("serif", 1, 26));
        this.add(this.l4);

        this.bb5 = new JLabel("Rs 25000");
        this.bb5.setBounds(650, 170, 150, 40);
        this.bb5.setFont(new Font("serif", 0, 26));
        this.add(this.bb5);

        this.bb6 = new JLabel("Rs 25000");
        this.bb6.setBounds(650, 240, 150, 40);
        this.bb6.setFont(new Font("serif", 0, 26));
        this.add(this.bb6);

        this.bb7 = new JLabel("Rs 25000");
        this.bb7.setBounds(650, 310, 150, 40);
        this.bb7.setFont(new Font("serif", 0, 26));
        this.add(this.bb7);

        this.bb8 = new JLabel("Rs 25000");
        this.bb8.setBounds(650, 380, 150, 40);
        this.bb8.setFont(new Font("serif", 0, 26));
        this.add(this.bb8);

        this.bb13 = new JLabel("Rs 25000");
        this.bb13.setBounds(650, 450, 150, 40);
        this.bb13.setFont(new Font("serif", 0, 26));
        this.add(this.bb13);

        this.bb14 = new JLabel("Rs 25000");
        this.bb14.setBounds(650, 520, 150, 40);
        this.bb14.setFont(new Font("serif", 0, 26));
        this.add(this.bb14);

        this.l5 = new JLabel("Bsc");
        this.l5.setBounds(850, 100, 100, 40);
        this.l5.setFont(new Font("serif", 1, 26));
        this.add(this.l5);

        this.bb9 = new JLabel("Rs 18000");
        this.bb9.setBounds(850, 170, 150, 40);
        this.bb9.setFont(new Font("serif", 0, 26));
        this.add(this.bb9);

        this.bb10 = new JLabel("Rs 18000");
        this.bb10.setBounds(850, 240, 150, 40);
        this.bb10.setFont(new Font("serif", 0, 26));
        this.add(this.bb10);

        this.bb11 = new JLabel("Rs 18000");
        this.bb11.setBounds(850, 310, 150, 40);
        this.bb11.setFont(new Font("serif", 0, 26));
        this.add(this.bb11);

        this.bb12 = new JLabel("Rs 18000");
        this.bb12.setBounds(850, 380, 150, 40);
        this.bb12.setFont(new Font("serif", 0, 26));
        this.add(this.bb12);

        this.bb15 = new JLabel("Rs 18000");
        this.bb15.setBounds(850, 450, 150, 40);
        this.bb15.setFont(new Font("serif", 0, 26));
        this.add(this.bb15);

        this.bb16 = new JLabel("Rs 18000");
        this.bb16.setBounds(850, 520, 150, 40);
        this.bb16.setFont(new Font("serif", 0, 26));
        this.add(this.bb16);

        this.l6 = new JLabel("MBA");
        this.l6.setBounds(1050, 100, 100, 40);
        this.l6.setFont(new Font("serif", 1, 26));
        this.add(this.l6);

        this.m1 = new JLabel("Rs 65000");
        this.m1.setBounds(1050, 170, 150, 40);
        this.m1.setFont(new Font("serif", 0, 26));
        this.add(this.m1);

        this.m2 = new JLabel("Rs 65000");
        this.m2.setBounds(1050, 240, 150, 40);
        this.m2.setFont(new Font("serif", 0, 26));
        this.add(this.m2);

        this.m3 = new JLabel("Rs 65000");
        this.m3.setBounds(1050, 310, 150, 40);
        this.m3.setFont(new Font("serif", 0, 26));
        this.add(this.m3);

        this.m4 = new JLabel("Rs 65000");
        this.m4.setBounds(1050, 380, 150, 40);
        this.m4.setFont(new Font("serif", 0, 26));
        this.add(this.m4);

        this.l7 = new JLabel("MCA");
        this.l7.setBounds(1230, 100, 100, 40);
        this.l7.setFont(new Font("serif", 1, 26));
        this.add(this.l7);

        this.m5 = new JLabel("Rs 55000");
        this.m5.setBounds(1230, 170, 150, 40);
        this.m5.setFont(new Font("serif", 0, 26));
        this.add(this.m5);

        this.m6 = new JLabel("Rs 55000");
        this.m6.setBounds(1230, 240, 150, 40);
        this.m6.setFont(new Font("serif", 0, 26));
        this.add(this.m6);

        this.m7 = new JLabel("Rs 55000");
        this.m7.setBounds(1230, 310, 150, 40);
        this.m7.setFont(new Font("serif", 0, 26));
        this.add(this.m7);

        this.m8 = new JLabel("Rs 55000");
        this.m8.setBounds(1230, 380, 150, 40);
        this.m8.setFont(new Font("serif", 0, 26));
        this.add(this.m8);

        this.l8 = new JLabel("MTech");
        this.l8.setBounds(1410, 100, 100, 40);
        this.l8.setFont(new Font("serif", 1, 26));
        this.add(this.l8);

        this.m9 = new JLabel("Rs 81000");
        this.m9.setBounds(1410, 170, 150, 40);
        this.m9.setFont(new Font("serif", 0, 26));
        this.add(this.m9);

        this.m10 = new JLabel("Rs 81000");
        this.m10.setBounds(1410, 240, 150, 40);
        this.m10.setFont(new Font("serif", 0, 26));
        this.add(this.m10);

        this.m11 = new JLabel("Rs 81000");
        this.m11.setBounds(1410, 310, 150, 40);
        this.m11.setFont(new Font("serif", 0, 26));
        this.add(this.m11);

        this.m12 = new JLabel("Rs 81000");
        this.m12.setBounds(1410, 380, 150, 40);
        this.m12.setFont(new Font("serif", 0, 26));
        this.add(this.m12);

        this.l10 = new JLabel("Semester 1");
        this.l10.setBounds(10, 170, 150, 40);
        this.l10.setFont(new Font("serif", 1, 26));
        this.add(this.l10);

        this.l11 = new JLabel("Semester 2");
        this.l11.setBounds(10, 240, 150, 40);
        this.l11.setFont(new Font("serif", 1, 26));
        this.add(this.l11);

        this.l12 = new JLabel("Semester 3");
        this.l12.setBounds(10, 310, 150, 40);
        this.l12.setFont(new Font("serif", 1, 26));
        this.add(this.l12);

        this.l13 = new JLabel("Semester 4");
        this.l13.setBounds(10, 380, 150, 40);
        this.l13.setFont(new Font("serif", 1, 26));
        this.add(this.l13);

        this.l14 = new JLabel("Semester 5");
        this.l14.setBounds(10, 450, 150, 40);
        this.l14.setFont(new Font("serif", 1, 26));
        this.add(this.l14);

        this.l15 = new JLabel("Semester 6");
        this.l15.setBounds(10, 520, 150, 40);
        this.l15.setFont(new Font("serif", 1, 26));
        this.add(this.l15);

        this.l16 = new JLabel("Semester 7");
        this.l16.setBounds(10, 590, 150, 40);
        this.l16.setFont(new Font("serif", 1, 26));
        this.add(this.l16);

        this.l17 = new JLabel("Semester 8");
        this.l17.setBounds(10, 660, 150, 40);
        this.l17.setFont(new Font("serif", 1, 26));
        this.add(this.l17);

        this.b1 = new JLabel("Rs 43000");
        this.b1.setBounds(250, 170, 100, 40);
        this.b1.setFont(new Font("serif", 0, 26));
        this.add(this.b1);

        this.b2 = new JLabel("Rs 43000");
        this.b2.setBounds(250, 240, 100, 40);
        this.b2.setFont(new Font("serif", 0, 26));
        this.add(this.b2);

        this.b3 = new JLabel("Rs 43000");
        this.b3.setBounds(250, 310, 100, 40);
        this.b3.setFont(new Font("serif", 0, 26));
        this.add(this.b3);

        this.b4 = new JLabel("Rs 43000");
        this.b4.setBounds(250, 380, 100, 40);
        this.b4.setFont(new Font("serif", 0, 26));
        this.add(this.b4);

        this.b5 = new JLabel("Rs 43000");
        this.b5.setBounds(250, 450, 100, 40);
        this.b5.setFont(new Font("serif", 0, 26));
        this.add(this.b5);

        this.b6 = new JLabel("Rs 43000");
        this.b6.setBounds(250, 520, 100, 40);
        this.b6.setFont(new Font("serif", 0, 26));
        this.add(this.b6);

        this.b7 = new JLabel("Rs 43000");
        this.b7.setBounds(250, 590, 100, 40);
        this.b7.setFont(new Font("serif", 0, 26));
        this.add(this.b7);

        this.b8 = new JLabel("Rs 43000");
        this.b8.setBounds(250, 660, 100, 40);
        this.b8.setFont(new Font("serif", 0, 26));
        this.add(this.b8);

        this.bb1 = new JLabel("Rs 32000");
        this.bb1.setBounds(450, 170, 100, 40);
        this.bb1.setFont(new Font("serif", 0, 26));
        this.add(this.bb1);

        this.bb2 = new JLabel("Rs 32000");
        this.bb2.setBounds(450, 240, 100, 40);
        this.bb2.setFont(new Font("serif", 0, 26));
        this.add(this.bb2);

        this.bb3 = new JLabel("Rs 32000");
        this.bb3.setBounds(450, 310, 100, 40);
        this.bb3.setFont(new Font("serif", 0, 26));
        this.add(this.bb3);

        this.bb4 = new JLabel("Rs 32000");
        this.bb4.setBounds(450, 380, 100, 40);
        this.bb4.setFont(new Font("serif", 0, 26));
        this.add(this.bb4);

        this.bb17 = new JLabel("Rs 32000");
        this.bb17.setBounds(450, 450, 100, 40);
        this.bb17.setFont(new Font("serif", 0, 26));
        this.add(this.bb17);

        this.bb18 = new JLabel("Rs 32000");
        this.bb18.setBounds(450, 520, 100, 40);
        this.bb18.setFont(new Font("serif", 0, 26));
        this.add(this.bb18);

        this.getContentPane().setBackground(Color.WHITE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        (new FeeStructure()).setVisible(true);
    }
}
