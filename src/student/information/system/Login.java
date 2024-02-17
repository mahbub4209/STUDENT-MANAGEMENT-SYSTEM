package student.information.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{

    JFrame f;
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2;
    
    Login(){
        
        super("Login");
        
        
        
        setBackground(Color.white);
        setLayout(null);
        
        l1 = new JLabel("Username");
        l1.setBounds(40,50,100,30);
        add(l1);
        
        l2 = new JLabel ("Password");
        l2.setBounds(40,110,100,30);
        add(l2);
        
        t1 = new JTextField();
        t1.setBounds(150,50,150,30);
        add(t1);
        
        t2 = new JPasswordField();
        t2.setBounds(150,110,150,30);
        add(t2);
        
        ImageIcon ic3 = new ImageIcon(ClassLoader.getSystemResource("student/information/system/icons/login.png"));
        Image i3 = ic3.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        JLabel l3 = new JLabel(icc3);
        l3.setBounds(375,45,175,175);
        add(l3);
        
        b1 = new JButton("Login");
        b1.setBounds(40,180,120,30);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.setBackground(Color.GRAY);
        b1.setForeground(Color.WHITE);
        add(b1);
        
        b1.addActionListener(this);
        
        b2 = new JButton("Cancel");
        b2.setBounds(180,180,120,30);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.setBackground(Color.GRAY);
        b2.setForeground(Color.WHITE);
        add(b2);
        
        b2.addActionListener(this);
        
        setVisible(true);
        setSize(600,300);
        setLocation(500,300);
        
    }

   
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
        try{
            ConnectionClass c1 =new ConnectionClass();
            String u=t1.getText();
            String v=t2.getText();
            
            String q = "select * from login where username='"+u+"' and password ='"+v+"'";
            
            ResultSet rs = c1.s.executeQuery(q);
            if (rs.next()){
                new Home().setVisible(true);
                setVisible(false);
            }
            else{
               JOptionPane.showMessageDialog(null,"Invalid login");
               setVisible(false); 
            }
        }catch(Exception e){
            e.printStackTrace();
        }
       }else if(ae.getSource()==b2){
        System.exit(0);
    }
}
    public static void main(String[] args) {
         Login l = new Login();
    }
}