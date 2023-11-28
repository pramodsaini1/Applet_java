<%-- 
    Document   : delete
    Created on : 27 Nov, 2023, 12:44:05 AM
    Author     : HP
--%>

<%@page contentType="text/html" import="java.sql.*" pageEncoding="UTF-8"%>
<%
if(request.getParameter("roll")!=null){
    int roll=Integer.parseInt(request.getParameter("roll"));
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/srev","root","");
        PreparedStatement ps = cn.prepareStatement("delete from demo where sn=?");
        ps.setInt(1,roll);
        if(ps.executeUpdate()>0){
            response.sendRedirect("insert.jsp?record_deleted=1");
        }
        else{
            response.sendRedirect("insert.jsp?try_again=1");
        }
                
    }
    catch(Exception er){
        out.println(er.getMessage());
    }
}



%> 
