<%-- 
    Document   : insert
    Created on : 23 Nov, 2023, 8:00:31 PM
    Author     : HP
--%>

<%@page contentType="text/html" import="java.sql.*" pageEncoding="UTF-8"%>
<%
  if(request.getParameter("roll")==null  || request.getParameter("user")==null || request.getParameter("avg")==null){
      response.sendRedirect("index.jsp?empty=1");
  }  
  else{
      int roll=Integer.parseInt(request.getParameter("roll"));
      String name=request.getParameter("user");
      int avg=Integer.parseInt(request.getParameter("avg"));
      try{
          Class.forName("com.mysql.jdbc.Driver");
          Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/srev","root","");
          PreparedStatement ps = cn.prepareStatement("insert into demo values(?,?,?)");
          ps.setInt(1,roll);
          ps.setString(2,name);
          ps.setInt(3,avg);
          
          if(ps.executeUpdate()>0){
              response.sendRedirect("index.jsp?record_inserted=1");
          }
          else{
              response.sendRedirect("index.jsp?try_again=1");
          }
      }
      catch(Exception er){
          out.println(er.getMessage());
      }
  }
    
    
    
 %>
