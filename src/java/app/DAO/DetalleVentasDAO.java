/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.DAO;

import app.conexion.Conexion;
import app.pojos.bean.DLDetalleVentas;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Sistemas05
 */
public class DetalleVentasDAO {

    public static ArrayList<DLDetalleVentas> Listar(int fktienda, int siscod) {
        String sql = "SELECT coditm\n"
                + "      ,codalm\n"
                + "      ,codpro\n"
                + "      ,despro\n"
                + "      ,qtypro\n"
                + "      ,qtypro_m\n"
                + "      ,pripro\n"
                + "      ,prisal\n"
                + "      ,costod\n"
                + "      ,stkalm\n"
                + "      ,stkalm_m\n"
                + "      ,dtopro\n"
                + "      ,totpar\n"
                + "      ,totdto_p\n"
                + "      ,stkfra\n"
                + "      ,coapro\n"
                + "      ,igvpro\n"
                + "      ,tipkar\n"
                + "      ,coscom\n"
                + "      ,cospro\n"
                + "      ,destot_n\n"
                + "      ,totppac\n"
                + "      ,totpseg\n"
                + "      ,promo_sta\n"
                + "      ,igvpar\n"
                + "      ,dtopro_a\n"
                + "      ,compro\n"
                + "      ,puntos\n"
                + "      ,totdto_ap\n"
                + "      ,dtopro_ant\n"
                + "      ,prisal_u\n"
                + "      ,pripro_u\n"
                + "      ,invnum_est\n"
                + "      ,compri\n"
                + "      ,invnum\n"
                + "  FROM fa_ventas_detalle where invnum >'" + fktienda + "';";
        Connection cn;
        //objeto que alamcena los datos en memoria
        ResultSet rs;
        //variable para la intrccion sql
        Statement stm;
        //abrir conexion
        cn = Conexion.abrir();
        //
        DLDetalleVentas v;
        ArrayList<DLDetalleVentas> lista = new ArrayList<DLDetalleVentas>();
        try {
            //para ejucutar la coneccion sql
            stm = cn.createStatement();
            //regitros de alamacena en rs

            rs = stm.executeQuery(sql);
            while (rs.next()) {
                //objeto UapPersona
                v = new DLDetalleVentas();
                //encapsular los datos RS en el objeto UapPersona
                v.setCoditm(rs.getInt("coditm"));
                v.setCodalm(rs.getString("codalm"));
                v.setCodpro(rs.getString("codpro"));
                v.setDespro(rs.getString("despro"));
                v.setQtypro(rs.getInt("qtypro"));
                v.setQtypro_m(rs.getInt("qtypro_m"));
                v.setPripro(rs.getString("pripro"));
                v.setPrisal(rs.getString("prisal"));
                v.setCostod(rs.getString("costod"));
                v.setStkalm(rs.getInt("stkalm"));
                v.setStkalm_m(rs.getInt("stkalm_m"));
                v.setDtopro(rs.getString("dtopro"));
                v.setTotpar(rs.getString("totpar"));
                v.setTotdto_p(rs.getString("totdto_p"));
                v.setStkfra(rs.getInt("stkfra"));
                v.setCoapro(rs.getString("coapro"));
                v.setIgvpro(rs.getString("igvpro"));
                v.setTipkar(rs.getString("tipkar"));
                v.setCoscom(rs.getString("coscom"));
                v.setCospro(rs.getString("cospro"));
                v.setDestot_n(rs.getString("destot_n"));
                v.setTotppac(rs.getString("totppac"));
                v.setTotpseg(rs.getString("totpseg"));
                v.setPromo_sta(rs.getString("promo_sta"));
                v.setIgvpar(rs.getString("igvpar"));
                v.setDtopro_a(rs.getString("dtopro_a"));
                v.setCompro(rs.getString("compro"));
                v.setPuntos(rs.getString("puntos"));
                v.setTotdto_ap(rs.getString("totdto_ap"));
                v.setDtopro_ant(rs.getString("dtopro_ant"));
                v.setPrisal_u(rs.getString("prisal_u"));
                v.setPripro_u(rs.getString("pripro_u"));
                v.setInvnum_est(rs.getInt("invnum_est"));
                v.setCompri(rs.getString("compri"));
                v.setInvnum(rs.getInt("invnum"));
                v.setSiscod(siscod);

                lista.add(v);
            }

            stm.close();
            rs.close();
            cn.close();
        } catch (Exception ex) {
            System.out.println("error en la lista" + ex);
        }

        return lista;

    }

}
