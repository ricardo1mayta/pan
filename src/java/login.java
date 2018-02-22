/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sistemas05
 */
@WebServlet(urlPatterns = {"/login"})
public class login extends HttpServlet {

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
         String path = request.getServletPath();

        if (path.equals("/login")) {
            int idsis = 0;
            String idsis1 = "";
            //capturar datos del login enviado por port
            String us = request.getParameter("txtusuario");
            String pw = request.getParameter("txtpasword");
            try (PrintWriter out = response.getWriter()) {
            idsis = (logear(us, pw, "fd5748gdfg86")) ;
            out.println("<h1>Servlet ultimo adfssa " + idsis + "</h1>");
            
               
              

                if (idsis==0) {
                    request.setAttribute("msgError", "eRROR usuario y/o pasword");
                    request.getRequestDispatcher("./index.jsp").forward(request, response);
                    out.println("<h1>Servlet ultimo at " + idsis + "</h1>");
                   request.getSession().setAttribute("idsis", idsis);
                }  else if(idsis>0) {
                     request.getSession().setAttribute("idsis", idsis);
                    request.getRequestDispatcher("WEB-INF/principal/menu.jsp").forward(request, response);
                    out.println("<h1>Servlet ultimo at " + idsis + "</h1>");
                }
           //out.println("<h1>Servlet ultimo at " + idsis + "</h1>");
            }
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
        processRequest(request, response);
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

    private static int logear(java.lang.String user, java.lang.String pass, java.lang.String key) {
        ws.api.Login_Service service = new ws.api.Login_Service();
        ws.api.Login port = service.getLoginPort();
        return port.logear(user, pass, key);
    }

}
