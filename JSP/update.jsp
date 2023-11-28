<%-- 
    Document   : update
    Created on : 27 Nov, 2023, 12:35:14 AM
    Author     : HP
--%>

<%@page contentType="text/html" import="java.sql.*" pageEncoding="UTF-8"%>
<%
 if(request.getParameter("roll")!=null && request.getParameter("user")!=null  && request.getParameter("avg")!=null){
     int roll = Integer.parseInt(request.getParameter("roll"));
     String name=request.getParameter("user");
     int avg=Integer.parseInt(request.getParameter("avg"));
     try{
         Class.forName("com.mysql.jdbc.Driver");
         Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/srev","root","");
         PreparedStatement ps=cn.prepareStatement("update demo  set name=?,avgr=? where sn=?");
         ps.setString(1,name);
         ps.setInt(2,avg);
         ps.setInt(3,roll);
         
         if(ps.executeUpdate()>0){
             response.sendRedirect("index.jsp?record_updated=1");
         }
         else{
             response.sendRedirect("edit.jsp?try_again=1");
         }
     }
     catch(Exception er){
         out.println(er.getMessage());
     }
 }
    
    
    
 %>
