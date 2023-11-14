package Applet_java.DataBase;
import java.sql.*;
public class insert {
    public static void main(String[] args) {
        try{
            Class.forName("Com.mysql.jdbc.Driver");
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/database-name","root","");
            Statement st = cn.createStatement();
            if(st.executeUpdate("insert into student values(1,'pramod',34)")>0){
                System.out.println("Record Inserted");
            }
            else{
                System.out.println("try again");
            }
            cn.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
