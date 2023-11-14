package Applet_java.DataBase;
import java.sql.*;
public class select {
    public static void main(String[] args) {
        try{
            Class.forName("Com.mysql.jdbc.Driver");
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/database-name","root","");
            Statement st = cn.createStatement();
            ResultSet  rs=st.executeQuery("select * from student");
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
            }
            cn.close();
        }
        catch(Exception er){
           System.out.println(er.getMessage());
        }
    }
}
