/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mayur Domadiya
 */
public class NewServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>"
                    + ""
                    + "  <td>Diploma CGPA :</td> <td><input type=\"number\" name='dpc' ></td>\n" +
"                  </tr>\n" +
"                  <tr>\n" +
"                      <td>Examination Board of Diploma :</td> <td><input type=\"text\" name=\"ebcd\" ></td>");
            out.println("<body>");
            out.println("<h1>Servlet NewServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String eno=request.getParameter("en");
        String name=request.getParameter("nm");
        String p10=request.getParameter("per10");
        String eb10=request.getParameter("ebc");
        
            String its[]= request.getParameterValues("it");
            String it="";
            if(its!=null){
            for(int i=0;i<its.length;i++)
            {
            it=it+its[i]+",";
            }
            }
   
            
        if(request.getParameter("d/12").equals("s12")){
             String p12=request.getParameter("per12");
             String eb12=request.getParameter("ebcc");
             String cn=request.getParameter("cn");
             String cg=request.getParameter("cg");
             String mno=request.getParameter("mn");
             String email=request.getParameter("em");
            String fi=request.getParameter("fi");
            String pw=request.getParameter("pw");

            Statements.insert(eno,name,p10,eb10,p12,eb12,"0","",cn,cg,mno,email,it,fi,pw);
           System.out.println("database");
            response.sendRedirect("login.jsp");
        }
        else{
            
        String dpc=request.getParameter("dpc");   
        String ebcd=request.getParameter("ebcd");
             String cn=request.getParameter("cn");
             String cg=request.getParameter("cg");
             String mno=request.getParameter("mn");
             String email=request.getParameter("em");
            
            String fi=request.getParameter("fi");
            String pw=request.getParameter("pw");
            Statements.insert(eno,name,p10,eb10,"0","",dpc,ebcd,cn,cg,mno,email,it,fi,pw);
             System.out.println("database");
             response.sendRedirect("login.jsp");
        }
     
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
