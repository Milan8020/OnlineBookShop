<%-- 
    Document   : change
    Created on : 25 Feb, 2018, 8:28:53 PM
    Author     : mayur domadiya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>TODO supply a title</title>
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
	font: 30px Helvetica, Sans-Serif;
	color: rgba(0,0,255,0.5); 
        margin-left:100px;
}


</style>

    </head>
    <body>
        <h1 align="center" style="text-decoration: underline">Change Password</h1>
        <form method="post" action="Changes" onsubmit="return check()">
              <table align="center" style="margin-top: 30px;border: 1px black solid;padding: 10px;" cellpadding="4px">
                 <tr>
                    <td>
                       Old Password :
                    </td>
                    <td>
                        <input type="password" name="ops" required>
                    </td>
                </tr>
                <tr>
                    <td>
                       New Password :
                    </td>
                    <td>
                        <input type="password" name="nps" required>
                    </td>
                </tr>
                <tr>
                    <td>
                       Confirm Password :
                    </td>
                    <td>
                        <input type="password" name="cps" required>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input class="form-submit-button" type="submit" value="Change">
                    </td>
                </tr>
            </table>
            <script>
                function check(){
                    
                    if(document.getElementsByName("nps")[0].value!=document.getElementsByName("cps")[0].value)
                    {
                        alert("confirm password!!");
                        return false;
                    }
                    return true;
                }
            </script>
        </form>
    </body>
</html>

