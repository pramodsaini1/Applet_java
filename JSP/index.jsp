<%-- 
    Document   : index
    Created on : 23 Nov, 2023, 7:49:17 PM
    Author     : HP
--%>

<%@page contentType="text/html" import="java.sql.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
        <title>JSP  Mini Project</title>
    </head>
    <body>
        <div class="container-fluid">
            <div class="row">
                <div class="col-sm-3"></div>
                <div class="col-sm-6">
                    <form method="post" action="insert.jsp">
            Roll.No:<input type="text"  name="roll" class="form-control"><br><br>
            Name:<input type="text" name="user" class="form-control" ><br><br>
            Avg:<input type="text" name="avg" class="form-control"><br><br>
            <button class="btn btn-primary">Submit</button>
        </form>
                </div>
                <div class="col-sm-3"></div>
            </div>
            <div class="row">
                <%
                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/srev","root","");
                        Statement st  = cn.createStatement();
                        ResultSet rs = st.executeQuery("Select * from demo");
                        out.println("<table width=50% height=50% >");
                        while(rs.next()){
                            %>
                            <tr>
                                <td><%out.println(rs.getInt(1));%></td>
                                 <td><%out.println(rs.getString(2));%></td>
                                  <td><%out.println(rs.getInt(3));%></td>
                                  <td><a href="edit.jsp?roll=<%=rs.getInt(1)%>">Edit</a></td>
                                  <td><a href="delete.jsp?roll=<%=rs.getInt(1)%>">Delete</a></td>
                            </tr>
                            
                            <%
                        }
                    out.println("</table>");
                    }
                    catch(Exception er){
                        out.println(er.getMessage());
                    }
                    
                   %>
            </div>
        </div>
    </body>
</html>
