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
import javax.servlet.http.Cookie;
/**
 *
 * @author HP
 */
public class retrieve extends HttpServlet {

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
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String email=request.getParameter("email");
        String pass=request.getParameter("pass");
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/srev","root","");
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from login where email='"+email+"'");
            if(rs.next()){
                if(rs.getString("password").equals(pass)){
                       Cookie c=new Cookie("login",email);
                       c.setMaxAge(60);
                       response.addCookie(c);
                       response.sendRedirect("profile");
                       
                }
                else{
                    response.sendRedirect("login?invalid_pass=1");
                }
            }
            else{
                response.sendRedirect("login?invalid=1");
            }
        }
        catch(Exception er){
            out.println(er.getMessage());
        }
    }
}

