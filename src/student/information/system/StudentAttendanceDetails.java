package student.information.system;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class StudentAttendanceDetails extends JFrame implements ActionListener {
    
    JTable j1;
    JButton b1;
    String h[]={"Id Number","Date Time","Attendance"};
    String d[][]=new String[1000] [3];
    int i=0,j=0;
    
    StudentAttendanceDetails(){
        super("View Students Attendance");
        setSize(800,300);
        setLocation(450,150);
        
        try{
            String q="select * from attendance_student";
            ConnectionClass c1= new ConnectionClass();
            ResultSet rs=c1.s.executeQuery(q);
            while(rs.next()){
                d[i][j++]=rs.getString("idno");
                d[i][j++]=rs.getString("Date");
                d[i][j++]=rs.getString("idno");
                d[i][j++]=rs.getString("attendance");
                i++;
                j=0;
            }
            
            j1 = new JTable(d,h);
            
        }catch(Exception e){ }
        
        b1=new JButton("Print");
        add(b1,"South");
        JScrollPane s1=new JScrollPane(j1);
        add(s1);
        
        b1.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            j1.print();
        }catch(Exception e){}
    } 
        
    public static void main(String[] args) {
        new StudentAttendanceDetails().setVisible(true);
    }
}
