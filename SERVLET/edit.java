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
public class edit extends HttpServlet {

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
         int roll=Integer.parseInt(request.getParameter("roll"));
         try{
             Class.forName("com.mysql.jdbc.Driver");
             Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/srev","root","");
             Statement st = cn.createStatement();
             ResultSet rs = st.executeQuery("select * from demo where sn='"+roll+"'");
             if(rs.next()){
                 out.println("<form method='post' action='update?roll="+rs.getInt(1)+"'>");
                 out.println("<input type='text' name='user' value='"+rs.getString(2)+"'>");
                  out.println("<input type='text' name='avg' value='"+rs.getInt(3)+"'>");
                  out.println("<input type='submit' value='update'>");
                  out.println("</form>");
             }
         }
         catch(Exception er){
             out.println(er.getMessage());
         }
    }
}
