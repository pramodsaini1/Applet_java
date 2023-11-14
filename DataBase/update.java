package Applet_java.DataBase;
import java.sql.*;

import javax.swing.plaf.nimbus.State;
public class update {
    public static void main(String[] args) {
        try{
           Class.forName("Com.mysql.jdbc.Driver");
           Connection cn=DriverManager.getConnection("jdbc:mysql:localhost://3306/database-name", "root", "");
           Statement st = cn.createStatement();
           if(st.executeUpdate("update student set sname='pk' where roll=4")>0){
               System.out.println("Record Updated");
           }
           else{
               System.out.println("Try Again");
           }
           cn.close();
        }
        catch(Exception er){
            System.out.println(er.getMessage());
        }
    }
}
