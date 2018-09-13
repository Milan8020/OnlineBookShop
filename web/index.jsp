<%-- 
    Document   : index
    Created on : 25 Feb, 2018, 6:20:09 PM
    Author     : Mayur Domadiya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fast Video</title>
        <style>
a:link, a:visited {
    background-color: #f44336;
    color: white;
    padding: 14px 25px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
}


a:hover, a:active {
    background-color: red;
}
</style>

    </head>
    <body>
        <%
        if(session.getAttribute("en")==null){
        
        
        %>
        <table>
            <tr>
                <td><h1>Fast Video</h1></td>
                <td><a style="margin-left:1100px" href="register.html">Register</a></td>
        <td><a href="login.jsp">Login</a></td>
            </tr>
        </table>
<%
}
else{
    
%>  
<table>
<tr>
<td><h1>Fast Video</h1></td>
<td><a style="margin-left:900px" href="Remove">Remove Account</a></td>
<td><a href="change">Change Password</a></td>
<td><a href="Logout">Logout</a></td>
</tr>
</table>
<%
    }
%>
    </body>
</html>
