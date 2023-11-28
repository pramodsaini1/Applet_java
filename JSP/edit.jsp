<%-- 
    Document   : edit
    Created on : 27 Nov, 2023, 12:25:53 AM
    Author     : HP
--%>

<%@page contentType="text/html" import="java.sql.*" pageEncoding="UTF-8"%>
<%
 if(request.getParameter("roll")!=null){
     int roll=Integer.parseInt(request.getParameter("roll"));
     try{
         Class.forName("com.mysql.jdbc.Driver");
         Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/srev","root","");
         Statement st = cn.createStatement();
         ResultSet rs = st.executeQuery("select * from demo where sn="+roll);
         if(rs.next()){
             %>
             <form method="post" action="update.jsp?roll=<%=roll%>">
                 <input type="text" name="user" class="form-control"value="<% out.println(rs.getString(2));%>">
                 <input type="text" name="avg"  class="form-control" value="<% out.println(rs.getInt(3));%>">
                        <input type="submit" value="Update">
                 
             </form>
             
             <%
         }
     }
     catch(Exception er){
         out.println(er.getMessage());
     }
 }   
    
    
 %>
