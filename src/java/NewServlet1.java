/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Mayur Domadiya
 */
public class NewServlet1 extends HttpServlet {

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
            out.println("<title>Servlet NewServlet1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NewServlet1 at " + request.getContextPath() + "</h1>");
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
        response.setContentType("text/html");
        long en=Long.parseLong(request.getParameter("en"));
        String ps =request.getParameter("ps");
         boolean f1=true,f2=true;
         String name="";
        ResultSet rs=Statements.select();
       try{ 
        while(rs.next())
        {
            System.out.print(rs.getLong(1));
              if(rs.getLong(1)==en){
                     f1=false;
                     if(rs.getString(15).equals(ps)){
                       f2=false;
                       name=rs.getString(2);
                     }
              }
        }
           if(f1){
               RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
               PrintWriter out = response.getWriter();
               out.println("<script>alert(\"User Not Found !!!!\")</script>");
               rd.include(request, response);
           }
           else if(f2){
                RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
               PrintWriter out = response.getWriter();
               out.println("<script>alert(\"Wrong Password !!!!\")</script>");
               rd.include(request, response);      
           }
           else{
               HttpSession session = request.getSession();
               session.setAttribute("en", request.getParameter("en"));
               session.setAttribute("name", name);
               if(request.getParameter("rem")!=null){
                  Cookie cookie=new Cookie(request.getParameter("en"),request.getParameter("ps"));
                  cookie.setMaxAge(60*60*24);
                  response.addCookie(cookie);
               }
               response.sendRedirect(request.getContextPath());
           }
        
       }
       catch(Exception e){
       
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
