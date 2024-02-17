package student.information.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class StudentAttendance extends JFrame implements ActionListener{
    
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JButton b1,b2;
    Choice c2,fh,sh;
    
    StudentAttendance(){
        
        setLayout(new GridLayout(4,2,50,50));
        c2 = new Choice();
        try{
            ConnectionClass c = new ConnectionClass();
            ResultSet rs = c.s.executeQuery("select * from student");
            while(rs.next()){
                c2.add(rs.getString("idno"));
            }
        }catch(Exception e){ }
        
        add(new JLabel("Select ID Number"));
        add(c2);
        
        l1 = new JLabel("Attendance");
        fh = new Choice();
        fh.add("Present");
        fh.add("Absent");
        fh.add("Leave");
        
        add(l1);
        add(fh);
        
        b1 = new JButton("Submit");
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        
        b2 = new JButton("Cancel");
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        
        add(b1);
        add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        getContentPane().setBackground(Color.white);
        
        setVisible(true);
        setSize(400,450);
        setLocation(600,200);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
        String f = fh.getSelectedItem();
        String dt = new java.util.Date().toString();
        String id = c2.getSelectedItem();
        String qry = "insert into student_attendance values("+ id +","+ dt +","+ f +")";
        
        try{
            ConnectionClass c1 = new ConnectionClass();
            c1.s.executeUpdate(qry);
            JOptionPane.showMessageDialog(null,"Attendance confirmed");
            this.setVisible(false);
        }catch(Exception ee){
            ee.printStackTrace();
        }
    }   else if (ae.getSource()==b2){
        System.exit(0);
    }
}       
    public static void main(String[] args) {
        new StudentAttendance();
    }
}
