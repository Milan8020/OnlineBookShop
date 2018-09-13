<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<%
    String ps="";
    String en="";
    Cookie cookies[]=request.getCookies();
    for(Cookie cookie : cookies )
    {
        if(cookie.getName().equals("en"))
        {
            en=cookie.getValue();
            
        }
        
        if(cookie.getName().equals("ps"))
        {
            ps=cookie.getValue();
        }
    }
%>
<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            
input[type=number] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    box-sizing: border-box;
    border: 3px solid #FF0000;
    -webkit-transition: 0.5s;
    transition: 0.5s;
    outline: none;
}

input[type=number]:focus {
    border: 3px solid #6580EA;
}

input[type=password] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    box-sizing: border-box;
    border: 3px solid #FF0000;
    -webkit-transition: 0.5s;
    transition: 0.5s;
    outline: none;
}

input[type=password]:focus {
    border: 3px solid #6580EA;
}

.form-submit-button {

background: #0066A2;

color: white;

border-style: outset;

border-color: #0066A2;

height: 50px;

width: 100px;

font: bold 15px arial, sans-serif;

text-shadow:none;

margin-left:40px;
}

h1 {
        left:530px;
	display: inline;
	position: relative;
	font: 100px Helvetica, Sans-Serif;
	color: rgba(0,0,255,0.5); 
        margin-left:100px;
}


</style>
    </head>
    <body>
        <h1 align="center" style="text-decoration: underline">Login</h1>
        <form method="post" action="NewServlet1">
              <table align="center" style="margin-top: 30px;border: 3px blue  solid;padding: 10px;" cellpadding="4px">
                <tr>
                    <td>
                        Enrollment Number :
                    </td>
                    <td>
                        <input type="number" name="en" value=<%=en %> required>
                    </td>
                </tr>
                 <tr>
                    <td>
                        Password :
                    </td>
                    <td>
                        <input type="password" name="ps" value=<%=ps %> required>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="checkbox" value="check" name="rem">Remember Me
                    </td>
                    <td>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input class="form-submit-button" type="submit" value="Login">
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
