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
public class insert extends HttpServlet {

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
        int roll=Integer.parseInt(request.getParameter("roll"));
        String name=request.getParameter("user");
        int avg=Integer.parseInt(request.getParameter("avg"));
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/srev","root","");
            PreparedStatement ps=cn.prepareStatement("insert into demo values(?,?,?)");
            ps.setInt(1, roll);
            ps.setString(2,name);
            ps.setInt(3,avg);
            if(ps.executeUpdate()>0){
                response.sendRedirect("operation?record_inserted=1");
            }
            else{
                response.sendRedirect("operation?try_again=1");
            }
            cn.close();
                    
            
        }
        catch(Exception er){
            out.println(er.getMessage());
        }
    }
}
