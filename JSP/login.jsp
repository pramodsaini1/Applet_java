<%-- 
    Document   : login
    Created on : 28 Nov, 2023, 1:22:58 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Cookie</title>
    </head>
    <body>
        <form method="post" action="retrieve.jsp">
            Email-ID:<input type="text"  name="email" class="form-control"><br><br>
            Password:<input type="text"  name="pass" class="form-control"><br><br>
            <input type="submit" value="Login">
        </form>
    </body>
</html>
