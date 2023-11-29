<%-- 
    Document   : retrieve
    Created on : 28 Nov, 2023, 1:27:30 AM
    Author     : HP
--%>

<%@page contentType="text/html" import="java.sql.*" pageEncoding="UTF-8"%>
<%
 if(request.getParameter("email")==null ||request.getParameter("pass")==null){
     response.sendRedirect("login.jsp?empty=1");
 } 
 else{
      String email=request.getParameter("email");
      String pass=request.getParameter("pass");
        try{
          Class.forName("com.mysql.jdbc.Driver");
          Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/wedding","root","");
          Statement st = cn.createStatement();
          ResultSet rs = st.executeQuery("select * from gecb where email='"+email+"'");
          if(rs.next()){
              if(rs.getString("pass").equals(pass)){
                  Cookie c= new Cookie("login",email);
                  c.setMaxAge(3600);
                  response.addCookie(c);
                  response.sendRedirect("Profile.jsp");
              }
              else{
                  response.sendRedirect("login.jsp?invalid_pass=1");
              }
          }
          else{
              response.sendRedirect("login.jsp?invalid=1");
          }
      }
      catch(Exception er){
          out.println(er.getMessage());
      }
 }
    
    
    
    
 %>
