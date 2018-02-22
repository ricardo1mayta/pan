/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import app.DAO.VentasDAO;
import app.pojos.bean.DLVentas;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sistemas05
 */
@WebServlet(urlPatterns = {"/cargarVentas"})
public class cargarVentas extends HttpServlet {

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
            out.println("<h1>Retoceder O Volver a ingresar al Login</h1>");
            Integer idsis = 0;
            int ul = 0;

            //idsis =(logearusuario(us, pw, "fd5748gdfg86"))+1;
            //int ul=ultimo(idsis);
            //out.println("<h1>Retoceder O Volver a ingresar al Login</h1>"+idsis+ultimo(idsis));
            idsis = (Integer) request.getSession().getAttribute("idsis") + 1;
            out.println("<h1>IDUS:</h1>" + idsis);
            ul = ultimo(idsis);
            out.println("<h1>ultimo:</h1>" + ul);
            if (idsis > 0) {

                ArrayList<DLVentas> lista = VentasDAO.Listar(ul, idsis);
                int n = 0;
                String res = "";
                for (DLVentas x : lista) {

                    res = insertarVentasTienda(x.getInvfec(),
                            x.getCodalm(), x.getCuscod(), x.getCusnam(), x.getCusruc(),
                            x.getCusadr(), x.getDestot(), x.getDestot_n(), x.getNetord(), x.getTotord(), x.getTotdto(),
                            x.getIgvord(), x.getTpacod(), x.getDocpag(), x.getNumcmp(), x.getUsecaj(), x.getInvsta(),
                            x.getNumdoc(), x.getTdofac(), x.getCodstd(), x.getTipcli(), x.getPrfnum(), x.getMedcod(), x.getPlnnum(),
                            x.getDestot_p(), x.getCodpre(), x.getTipkar(), x.getTarcod(),
                            x.getInvgnc(), x.getInvppac(), x.getInvpseg(), x.getInvcoa(), x.getInvigv(), x.getMednam(), x.getFecanu(),
                            x.getUseanu(), x.getSiscod(), x.getCoscom_t(), x.getCospro_t(), x.getMondol(), x.getTipcam(), x.getInvuti_c(),
                            x.getInvuti_r(), x.getInvuti_p(), x.getEstado(), x.getFeccre(), x.getFecumv(), x.getUsecod(),
                            x.getUsenam(), x.getHostname(), x.getInvmmax(), x.getPlnemmfa(),
                            x.getInverd(), x.getTdoidser(), x.getTotpuntos(), x.getTotcompro(), x.getTippln(),
                            x.getTotdto_a(), x.getMeddir(), x.getUbicod(), x.getInvnum_est(), x.getCodanu(),
                            x.getObsanu(), x.getDiacod(), x.getDirrep(), x.getObsrep(), x.getInvnum_cot(), x.getInvnum_cen(), x.getStaproc(),
                            x.getMoncod(), x.getFecdoc(), x.getFktienda());
                    n++;

                }
                if (n > 0) {

                    out.println(ul+"<h1>Se actualizo los " + n + " datos gracias</h1><br>" + res);
                    request.setAttribute("msgError","Ultimo "+ul+" <h1>Se actualizo los " + n + " datos gracias</h1><br>");
                } else {
                    out.println(ul+"<h1>No se  actualizo los " + n + " datos gracias</h1><br>" + res);
                    //request.setAttribute("msgError", res + " : " + n + " Sin Datos Nuevos" + idsis);
                    request.setAttribute("msgError", "Ultimo "+ul+"<h1>No se actualizo los " + n + " datos gracias</h1><br>" );
                }
                // request.getRequestDispatcher("./principal/menu.jsp").forward(request, response);
                out.println(ul +"<h1>Se actualizo los " + n + " datos gracias</h1><br>" + res);
                // out.println(ultimoregistro(15) +"<br>");

            } else {
                request.setAttribute("msgError", "Error de usuario y contraseña");
                //request.getRequestDispatcher("./index.jsp").forward(request, response);
            }
//out.println("<h1>eroorrr</h1>");

            //out.println("<h1>eroorrr</h1>");
            //request.setAttribute("msgError", "Error de usuario y contraseña");
           request.getRequestDispatcher("./WEB-INF/principal/menu.jsp").forward(request, response);

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

    private static String insertarVentasTienda(java.lang.String invfec, java.lang.String codalm, java.lang.String cuscod, java.lang.String cusnam, java.lang.String cusruc, java.lang.String cusadr, double destot, double destotN, double netord, double totord, double totdto, double igvord, java.lang.String tpacod, java.lang.String docpag, java.lang.String numcmp, java.lang.String usecaj, java.lang.String invsta, int numdoc, java.lang.String tdofac, java.lang.String codstd, java.lang.String tipcli, int prfnum, java.lang.String medcod, java.lang.String plnnum, java.lang.String destotP, java.lang.String codpre, java.lang.String tipkar, java.lang.String tarcod, double invgnc, double invppac, double invpseg, java.lang.String invcoa, java.lang.String invigv, java.lang.String mednam, java.lang.String fecanu, int useanu, int siscod, java.lang.String coscomT, java.lang.String cosproT, java.lang.String mondol, java.lang.String tipcam, java.lang.String invutiC, java.lang.String invutiR, java.lang.String invutiP, java.lang.String estado, java.lang.String feccre, java.lang.String fecumv, int usecod, java.lang.String usenam, java.lang.String hostname, java.lang.String invmmax, java.lang.String plnemmfa, java.lang.String inverd, java.lang.String tdoidser, java.lang.String totpuntos, java.lang.String totcompro, java.lang.String tippln, java.lang.String totdtoA, java.lang.String meddir, java.lang.String ubicod, java.lang.String invnumEst, java.lang.String codanu, java.lang.String obsanu, java.lang.String diacod, java.lang.String dirrep, java.lang.String obsrep, int invnumCot, int invnumCen, java.lang.String staproc, java.lang.String moncod, java.lang.String fecdoc, int fktienda) {
        ws.api.CargarventasSede_Service service = new ws.api.CargarventasSede_Service();
        ws.api.CargarventasSede port = service.getCargarventasSedePort();
        return port.insertarVentasTienda(invfec, codalm, cuscod, cusnam, cusruc, cusadr, destot, destotN, netord, totord, totdto, igvord, tpacod, docpag, numcmp, usecaj, invsta, numdoc, tdofac, codstd, tipcli, prfnum, medcod, plnnum, destotP, codpre, tipkar, tarcod, invgnc, invppac, invpseg, invcoa, invigv, mednam, fecanu, useanu, siscod, coscomT, cosproT, mondol, tipcam, invutiC, invutiR, invutiP, estado, feccre, fecumv, usecod, usenam, hostname, invmmax, plnemmfa, inverd, tdoidser, totpuntos, totcompro, tippln, totdtoA, meddir, ubicod, invnumEst, codanu, obsanu, diacod, dirrep, obsrep, invnumCot, invnumCen, staproc, moncod, fecdoc, fktienda);
    }

    private static int ultimo(int siscod) {
        ws.api.RegUltimo_Service service = new ws.api.RegUltimo_Service();
        ws.api.RegUltimo port = service.getRegUltimoPort();
        return port.ultimo(siscod);
    }
}
