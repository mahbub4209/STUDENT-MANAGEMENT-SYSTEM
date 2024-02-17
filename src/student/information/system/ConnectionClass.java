package student.information.system;

import java.sql.*;

public class ConnectionClass {
   Connection  c;
   Statement s;
   public ConnectionClass(){
       try{
           Class.forName("com.mysql.jdbc.Driver");
           c =DriverManager.getConnection("jdbc:mysql:///sis","root","1031");
           s =c.createStatement();
           
           
       }catch(Exception e){
           System.out.println(e);
       }
   }
}
