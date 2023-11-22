package Applet_java.SERVLET;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 *
 * @author HP
 */
public class operation extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet operation</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<form method='post' action='insert'>");
            out.println("Roll.No:<input type='text' name='roll'><br><br>");
            out.println("Name:<input type='text' name='user'><br><br>");
            out.println("Avg:<input type='text' name='avg'><br><br>");
            out.println("<input type='submit' value='submit'>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/srev","root","");
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from demo");
            out.println("<table width=50% height =50%>");
            while(rs.next()){
                out.println("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getInt(3)+"</td><td><a href='edit?roll="+rs.getInt(1)+"'>Edit</a></td><td><a href='delete?roll="+rs.getInt(1)+"'>Delete</a></td></tr>");
                
            }
            out.println("</table>");
        }  
        catch(Exception er){
           out.println(er.getMessage());
        }
}
    }


