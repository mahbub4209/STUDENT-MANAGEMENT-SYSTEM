package student.information.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Home extends JFrame implements ActionListener{
    Home(){
        super("University Student Information System");
        
        setSize(1920,1030);
        
        ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("student/information/system/icons/uits.jpg"));
        Image i1 = ic.getImage().getScaledInstance(1600,830,Image.SCALE_DEFAULT);
        ImageIcon icc1 =new ImageIcon(i1);
        JLabel l1 = new JLabel(icc1); 
        add(l1);
        
        JMenuBar mb = new JMenuBar();
        JMenu add1 = new JMenu("ADD");
        JMenuItem m1 = new JMenuItem("New Student Admission");
        add1.setForeground(Color.DARK_GRAY);
        
        m1.setFont(new Font("monospaced",Font.BOLD,16));
        m1.setMnemonic('A');
        m1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
        m1.setBackground(Color.WHITE);
        
        m1.addActionListener(this);
        
        JMenu user = new JMenu("Details");
        JMenuItem u1 = new JMenuItem("Student Details");
        user.setForeground(Color.DARK_GRAY);
        
        u1.setFont(new Font("monospaced",Font.BOLD,16));
        u1.setMnemonic('B');
        u1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
        u1.setBackground(Color.WHITE);
        
        u1.addActionListener(this);
        
        JMenu attend = new JMenu("Attendance");
        JMenuItem a1 = new JMenuItem("Student Attendance");
        attend.setForeground(Color.DARK_GRAY);
        
        a1.setFont(new Font("monospaced",Font.BOLD,16));
        a1.setMnemonic('C');
        a1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
        a1.setBackground(Color.WHITE);
        attend.add(a1);
        
        a1.addActionListener(this);
        
        JMenu attend_de = new JMenu("Attendance Details");
        JMenuItem b1 = new JMenuItem("Student Attendance Details");
        attend_de.setForeground(Color.DARK_GRAY);
        
        b1.setFont(new Font("monospaced",Font.BOLD,16));
        b1.setMnemonic('D');
        b1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
        b1.setBackground(Color.WHITE);
        attend_de.add(b1);
        
        b1.addActionListener(this);
        
        JMenu update_de = new JMenu("Update Student Details ");
        JMenuItem up1 = new JMenuItem("Update Student Details");
        update_de.setForeground(Color.DARK_GRAY);
        
        up1.setFont(new Font("monospaced",Font.BOLD,16));
        up1.setMnemonic('E');
        up1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,ActionEvent.CTRL_MASK));
        up1.setBackground(Color.WHITE);
        update_de.add(up1);
        
        up1.addActionListener(this);
        
        JMenu fee = new JMenu("Fee Details");
        JMenuItem s1 = new JMenuItem("Student Fee Structure");
        JMenuItem s2 = new JMenuItem("Student Fee Form");
        fee.setForeground(Color.DARK_GRAY);
        
        s1.setFont(new Font("monospaced",Font.BOLD,16));
        s1.setMnemonic('F');
        s1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,ActionEvent.CTRL_MASK));
        s1.setBackground(Color.WHITE);
        
        s1.addActionListener(this);
        
        
        s2.setFont(new Font("monospaced",Font.BOLD,16));
        s2.setMnemonic('G');
        s2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,ActionEvent.CTRL_MASK));
        s2.setBackground(Color.WHITE);
        
        s2.addActionListener(this);
        
        JMenu utility = new JMenu("Utility");
        JMenuItem ut1 = new JMenuItem("Calculator");
        utility.setForeground(Color.GRAY);
        
        ut1.setFont(new Font("monospaced",Font.BOLD,16));
        ut1.setMnemonic('H');
        ut1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));
        ut1.setBackground(Color.WHITE);
        
        ut1.addActionListener(this);
        
        JMenu exit = new JMenu("Exit");
        JMenuItem ex = new JMenuItem("Exit");
        exit.setForeground(Color.RED);
        
        ex.setFont(new Font("monospaced",Font.BOLD,16));
        ex.setMnemonic('I');
        ex.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z,ActionEvent.CTRL_MASK));
        ex.setBackground(Color.WHITE);
        
        ex.addActionListener(this);
        
        add1.add(m1);
        
        user.add(u1);
        
        fee.add(s1);
        fee.add(s2);
        
        utility.add(ut1);
        
        exit.add(ex);
        
        mb.add(add1);
        mb.add(user);
        mb.add(attend);
        mb.add(attend_de);
        mb.add(update_de);
        mb.add(fee);
        mb.add(utility);
        mb.add(exit);
        
        
        setJMenuBar(mb);
        
        setFont(new Font("Sensrif",Font.BOLD,16));
        setLayout(new FlowLayout());
        setVisible(false);
    }

    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
        if(msg.equals("New Student Admission")){
            new AddStudent().f.setVisible(true);
            
        }else if(msg.equals("Student Details")){
            new StudentDetails().setVisible(true);
            
        }else if(msg.equals("Student Attendance")){
            new StudentAttendance().setVisible(true);
            
        }else if(msg.equals("Student Attendance Details")){
            new StudentAttendanceDetails().setVisible(true);
            
        }else if(msg.equals("Update Student Details")){
            new UpdateStudentDetails().f.setVisible(true);
            
        }else if(msg.equals("Student Fee Form")){
            new StudentFeeForm().setVisible(true);
            
        }else if(msg.equals("Student Fee Structure")){
            new StudentFeeStructure().setVisible(true);
            
        }else if(msg.equals("Calculator")){
           try{
               Runtime.getRuntime().exec("calc.exe");
           }catch(Exception e){ }
        }else if(msg.equals("Exit")){
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        new Home().setVisible(true);
    }
}
