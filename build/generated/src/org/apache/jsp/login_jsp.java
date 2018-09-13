package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");

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

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Login</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("input[type=number] {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    border: 3px solid #FF0000;\n");
      out.write("    -webkit-transition: 0.5s;\n");
      out.write("    transition: 0.5s;\n");
      out.write("    outline: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=number]:focus {\n");
      out.write("    border: 3px solid #6580EA;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=password] {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    border: 3px solid #FF0000;\n");
      out.write("    -webkit-transition: 0.5s;\n");
      out.write("    transition: 0.5s;\n");
      out.write("    outline: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=password]:focus {\n");
      out.write("    border: 3px solid #6580EA;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1 align=\"center\" style=\"text-decoration: underline\">Login</h1>\n");
      out.write("        <form method=\"post\" action=\"NewServlet1\">\n");
      out.write("              <table align=\"center\" style=\"margin-top: 30px;border: 1px black solid;padding: 10px;\" cellpadding=\"4px\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        Enrollment Number :\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"number\" name=\"en\" value=");
      out.print(en );
      out.write(" required>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>\n");
      out.write("                        Password :\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"password\" name=\"ps\" value=");
      out.print(ps );
      out.write(" required>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"checkbox\" value=\"check\" name=\"rem\">Remember Me\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\" align=\"center\">\n");
      out.write("                        <input type=\"submit\" value=\"Login\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
