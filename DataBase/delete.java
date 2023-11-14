package Applet_java.DataBase;
import java.sql.*;
public class delete {
    public static void main(String[] args) {
        try{
            Class.forName("Com.mysql.jdbc.Driver");
            Connection cn=DriverManager.getConnection("jdbc:mysql:localhost:3306/database-name", "root", "");
            Statement st = cn.createStatement();
            if(st.executeUpdate("delete from student where roll=1")>0){
                System.out.println("Record Deleted");
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
