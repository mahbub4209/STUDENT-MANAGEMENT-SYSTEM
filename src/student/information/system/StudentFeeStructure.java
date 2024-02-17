package student.information.system;

import javax.swing.*;
import java.awt.*;

public class StudentFeeStructure extends JFrame{
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17;
    JLabel i1;
    JLabel b1,b2,b3,b4,b5,b6,b7,b8;
    JLabel bb1,bb2,bb3,bb4,bb5,bb6,bb7,bb8;
    JLabel bbb1,bbb2,bbb3,bbb4,bbb5,bbb6,bbb7,bbb8;
    JLabel m1,m2,m3,m4,m5,m6,m7,m8;
    
    public StudentFeeStructure(){
        setSize(1300,800);
        setLocation(150,50);
        setLayout(null);
        
        i1 = new JLabel("Student Fee Structure");
        i1.setFont(new Font("serif",Font.ITALIC,56));
        i1.setForeground(Color.blue);
        i1.setBounds(400,10,550,70);
        add(i1);
        
        l1 = new JLabel("Course");
        l1.setBounds(80,100,100,40);
        l1.setFont(new Font("serif",Font.BOLD,26));
        l1.setForeground(Color.DARK_GRAY);
        add(l1);
        
        l2 = new JLabel("Bsc");
        l2.setBounds(280,100,100,40);
        l2.setFont(new Font("serif",Font.BOLD,26));
        l2.setForeground(Color.DARK_GRAY);
        add(l2);
        
        l3 = new JLabel("BBA");
        l3.setBounds(480,100,100,40);
        l3.setFont(new Font("serif",Font.BOLD,26));
        l3.setForeground(Color.DARK_GRAY);
        add(l3);
        
        l4 = new JLabel("BA");
        l4.setBounds(680,100,100,40);
        l4.setFont(new Font("serif",Font.BOLD,26));
        l4.setForeground(Color.DARK_GRAY);
        add(l4);
        
        l5 = new JLabel("Msc");
        l5.setBounds(880,100,100,40);
        l5.setFont(new Font("serif",Font.BOLD,26));
        l5.setForeground(Color.DARK_GRAY);
        add(l5);
        
        l6 = new JLabel("MBA");
        l6.setBounds(1080,100,100,40);
        l6.setFont(new Font("serif",Font.BOLD,26));
        l6.setForeground(Color.DARK_GRAY);
        add(l6);
        
        l7 = new JLabel("Semester 1");
        l7.setBounds(80,170,150,40);
        l7.setFont(new Font("serif",Font.BOLD,26));
        l7.setForeground(Color.GRAY);
        add(l7);
        
        l8 = new JLabel("Semester 2");
        l8.setBounds(80,240,150,40);
        l8.setFont(new Font("serif",Font.BOLD,26));
        l8.setForeground(Color.GRAY);
        add(l8);
        
        l9 = new JLabel("Semester 3");
        l9.setBounds(80,310,150,40);
        l9.setFont(new Font("serif",Font.BOLD,26));
        l9.setForeground(Color.GRAY);
        add(l9);
        
        l10 = new JLabel("Semester 4");
        l10.setBounds(80,380,150,40);
        l10.setFont(new Font("serif",Font.BOLD,26));
        l10.setForeground(Color.GRAY);
        add(l10);
        
        l11 = new JLabel("Semester 5");
        l11.setBounds(80,450,150,40);
        l11.setFont(new Font("serif",Font.BOLD,26));
        l11.setForeground(Color.GRAY);
        add(l11);
        
        l12 = new JLabel("Semester 6");
        l12.setBounds(80,520,150,40);
        l12.setFont(new Font("serif",Font.BOLD,26));
        l12.setForeground(Color.GRAY);
        add(l12);
        
        l13 = new JLabel("Semester 7");
        l13.setBounds(80,590,150,40);
        l13.setFont(new Font("serif",Font.BOLD,26));
        l13.setForeground(Color.GRAY);
        add(l13);
        
        l14 = new JLabel("Semester 8");
        l14.setBounds(80,660,150,40);
        l14.setFont(new Font("serif",Font.BOLD,26));
        l14.setForeground(Color.GRAY);
        add(l14);
        
        b1 = new JLabel("TK 45000");
        b1.setBounds(280,170,150,40);
        b1.setFont(new Font("serif",Font.PLAIN,26));
        add(b1);
   
        b2 = new JLabel("TK 45000");
        b2.setBounds(280,240,150,40);
        b2.setFont(new Font("serif",Font.PLAIN,26));
        add(b2);
        
        b3 = new JLabel("TK 44000");
        b3.setBounds(280,310,150,40);
        b3.setFont(new Font("serif",Font.PLAIN,26));
        add(b3);
        
        b4 = new JLabel("TK 45000");
        b4.setBounds(280,380,150,40);
        b4.setFont(new Font("serif",Font.PLAIN,26));
        add(b4);
        
        b5 = new JLabel("TK 45000");
        b5.setBounds(280,450,150,40);
        b5.setFont(new Font("serif",Font.PLAIN,26));
        add(b5);
        
        b6 = new JLabel("TK 41000");
        b6.setBounds(280,520,150,40);
        b6.setFont(new Font("serif",Font.PLAIN,26));
        add(b6);
        
        b7 = new JLabel("TK 44000");
        b7.setBounds(280,590,150,40);
        b7.setFont(new Font("serif",Font.PLAIN,26));
        add(b7);
        
        b8 = new JLabel("TK 43000");
        b8.setBounds(280,660,150,40);
        b8.setFont(new Font("serif",Font.PLAIN,26));
        add(b8);
        
        bb1 = new JLabel("TK 40000");
        bb1.setBounds(480,170,150,40);
        bb1.setFont(new Font("serif",Font.PLAIN,26));
        add(bb1);
        
        bb2 = new JLabel("TK 39000");
        bb2.setBounds(480,240,150,40);
        bb2.setFont(new Font("serif",Font.PLAIN,26));
        add(bb2);
        
        bb3 = new JLabel("TK 40000");
        bb3.setBounds(480,310,150,40);
        bb3.setFont(new Font("serif",Font.PLAIN,26));
        add(bb3);
        
        bb4 = new JLabel("TK 41000");
        bb4.setBounds(480,380,150,40);
        bb4.setFont(new Font("serif",Font.PLAIN,26));
        add(bb4);
        
        bb5 = new JLabel("TK 40000");
        bb5.setBounds(480,450,150,40);
        bb5.setFont(new Font("serif",Font.PLAIN,26));
        add(bb5);
        
        bb6 = new JLabel("TK 42000");
        bb6.setBounds(480,520,150,40);
        bb6.setFont(new Font("serif",Font.PLAIN,26));
        add(bb6);
        
        bb7 = new JLabel("TK 40000");
        bb7.setBounds(480,590,150,40);
        bb7.setFont(new Font("serif",Font.PLAIN,26));
        add(bb7);
        
        bb8 = new JLabel("TK 43000");
        bb8.setBounds(480,660,150,40);
        bb8.setFont(new Font("serif",Font.PLAIN,26));
        add(bb8);
        
        bbb1 = new JLabel("TK 37000");
        bbb1.setBounds(680,170,150,40);
        bbb1.setFont(new Font("serif",Font.PLAIN,26));
        add(bbb1);
        
        bbb2 = new JLabel("TK 35000");
        bbb2.setBounds(680,240,150,40);
        bbb2.setFont(new Font("serif",Font.PLAIN,26));
        add(bbb2);
        
        bbb3 = new JLabel("TK 35000");
        bbb3.setBounds(680,310,150,40);
        bbb3.setFont(new Font("serif",Font.PLAIN,26));
        add(bbb3);
        
        bbb4 = new JLabel("TK 33000");
        bbb4.setBounds(680,380,150,40);
        bbb4.setFont(new Font("serif",Font.PLAIN,26));
        add(bbb4);
        
        bbb5 = new JLabel("TK 32000");
        bbb5.setBounds(680,450,150,40);
        bbb5.setFont(new Font("serif",Font.PLAIN,26));
        add(bbb5);
        
        bbb6 = new JLabel("TK 35000");
        bbb6.setBounds(680,520,150,40);
        bbb6.setFont(new Font("serif",Font.PLAIN,26));
        add(bbb6);
        
        bbb7 = new JLabel("TK 34000");
        bbb7.setBounds(680,590,150,40);
        bbb7.setFont(new Font("serif",Font.PLAIN,26));
        add(bbb7);
        
        bbb8 = new JLabel("TK 35000");
        bbb8.setBounds(680,660,150,40);
        bbb8.setFont(new Font("serif",Font.PLAIN,26));
        add(bbb8);
        
        m1 = new JLabel("TK 65000");
        m1.setBounds(880,170,150,40);
        m1.setFont(new Font("serif",Font.PLAIN,26));
        add(m1);
        
        m2 = new JLabel("TK 65000");
        m2.setBounds(880,240,150,40);
        m2.setFont(new Font("serif",Font.PLAIN,26));
        add(m2);
        
        m3 = new JLabel("TK 64000");
        m3.setBounds(880,310,150,40);
        m3.setFont(new Font("serif",Font.PLAIN,26));
        add(m3);
        
        m4 = new JLabel("TK 66000");
        m4.setBounds(880,380,150,40);
        m4.setFont(new Font("serif",Font.PLAIN,26));
        add(m4);
        
        m5 = new JLabel("TK 62000");
        m5.setBounds(1080,170,150,40);
        m5.setFont(new Font("serif",Font.PLAIN,26));
        add(m5);
        
        m6 = new JLabel("TK 60000");
        m6.setBounds(1080,240,150,40);
        m6.setFont(new Font("serif",Font.PLAIN,26));
        add(m6);
        
        m7 = new JLabel("TK 58000");
        m7.setBounds(1080,310,150,40);
        m7.setFont(new Font("serif",Font.PLAIN,26));
        add(m7);
        
        m8 = new JLabel("TK 60000");
        m8.setBounds(1080,380,150,40);
        m8.setFont(new Font("serif",Font.PLAIN,26));
        add(m8);
        
        getContentPane().setBackground(Color.white);
        setVisible(true);
    }
    public static void main(String[] args) {
        new StudentFeeStructure().setVisible(true);
        
    }
    
}