/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.DAO;

import app.conexion.Conexion;
import static app.conexion.Conexion.abrir;
import app.pojos.bean.DLVentas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sistemas05
 */
public class VentasDAO {

    public static ArrayList<DLVentas> Listar(int fktienda,int siscod ) {
        String sql = "SELECT  top 10  invfec,codalm,cuscod,cusnam,cusruc,cusadr,destot,destot_n,netord,totord,totdto,igvord,tpacod,docpag,numcmp,usecaj,invsta,numdoc,tdofac,codstd,tipcli,prfnum,medcod,plnnum,destot_p,codpre,tipkar,tarcod,invgnc,invppac,invpseg,invcoa,invigv,mednam,fecanu,useanu,siscod,coscom_t,cospro_t,mondol,tipcam,invuti_c,invuti_r,invuti_p,estado,feccre,fecumv,usecod,usenam,hostname,invmmax,plnemmfa,inverd,tdoidser,totpuntos,totcompro,tippln,totdto_a,meddir,ubicod,invnum_est,codanu,obsanu,diacod,dirrep,obsrep,invnum_cot,invnum_cen,staproc,moncod,fecdoc,invnum  FROM fa_ventas_cabecera where invnum >'"+fktienda+"' and siscod ='"+siscod+"';";
        Connection cn;
        //objeto que alamcena los datos en memoria
        ResultSet rs;
        //variable para la intrccion sql
        Statement stm;
        //abrir conexion
        cn = Conexion.abrir();
        //
        DLVentas v;
        ArrayList<DLVentas> lista = new ArrayList<DLVentas>();
        try {
            //para ejucutar la coneccion sql
            stm = cn.createStatement();
            //regitros de alamacena en rs

            rs = stm.executeQuery(sql);
            while (rs.next()) {
                //objeto UapPersona
                v = new DLVentas();
                //encapsular los datos RS en el objeto UapPersona
                v.setInvfec(rs.getString(1));
                v.setCodalm(rs.getString(2));
                v.setCuscod(rs.getString(3));
                v.setCusnam(rs.getString(4));
                v.setCusruc(rs.getString(5));
                v.setCusadr(rs.getString(6));
                v.setDestot(rs.getDouble(7));
                v.setDestot_n(rs.getDouble(8));
                v.setNetord(rs.getDouble(9));
                v.setTotord(rs.getDouble(10));
                v.setTotdto(rs.getDouble(11));
                v.setIgvord(rs.getDouble(12));
                v.setTpacod(rs.getString(13));
                v.setDocpag(rs.getString(14));
                v.setNumcmp(rs.getString(15));
                v.setUsecaj(rs.getString(16));
                v.setInvsta(rs.getString(17));
                v.setNumdoc(rs.getInt(18));
                v.setTdofac(rs.getString(19));
                v.setCodstd(rs.getString(20));
                v.setTipcli(rs.getString(21));
                v.setPrfnum(rs.getInt(22));
                v.setMedcod(rs.getString(23));
                v.setPlnnum(rs.getString(24));
                v.setDestot_p(rs.getString(25));
                v.setCodpre(rs.getString(26));
                v.setTipkar(rs.getString(27));
                v.setTarcod(rs.getString(28));
                v.setInvgnc(rs.getDouble(29));
                v.setInvppac(rs.getDouble(30));
                v.setInvpseg(rs.getDouble(31));
                v.setInvcoa(rs.getString(32));
                v.setInvigv(rs.getString(33));
                v.setMednam(rs.getString(34));
                v.setFecanu(rs.getString("fecanu"));
                v.setUseanu(rs.getInt(36));
                v.setSiscod(rs.getInt(37));
                v.setCoscom_t(rs.getString(38));
                v.setCospro_t(rs.getString(39));
                v.setMondol(rs.getString(40));
                v.setTipcam(rs.getString(41));
                v.setInvuti_c(rs.getString(42));
                v.setInvuti_r(rs.getString(43));
                v.setInvuti_p(rs.getString(44));
                v.setEstado(rs.getString(45));
                v.setFeccre(rs.getString(46));
                v.setFecumv(rs.getString(47));
                v.setUsecod(rs.getInt(48));
                v.setUsenam(rs.getString(49));
                v.setHostname(rs.getString(50));
                v.setInvmmax(rs.getString(51));
                v.setPlnemmfa(rs.getString(52));
                v.setInverd(rs.getString(53));
                v.setTdoidser(rs.getString(54));
                v.setTotpuntos(rs.getString(55));
                v.setTotcompro(rs.getString(56));
                v.setTippln(rs.getString(57));
                v.setTotdto_a(rs.getString(58));
                v.setMeddir(rs.getString(59));
                v.setUbicod(rs.getString(60));
                v.setInvnum_est(rs.getString(61));
                v.setCodanu(rs.getString(62));
                v.setObsanu(rs.getString(63));
                v.setDiacod(rs.getString(64));
                v.setDirrep(rs.getString(65));
                v.setObsrep(rs.getString(66));
                v.setInvnum_cot(rs.getInt(67));
                v.setInvnum_cen(rs.getInt(68));
                v.setStaproc(rs.getString(69));
                v.setMoncod(rs.getString(70));
                v.setFecdoc(rs.getString(71));
                v.setFktienda(rs.getInt("invnum"));

                lista.add(v);
            }
System.out.println("error en la lista" + sql);
            stm.close();
            rs.close();
            cn.close();
        } catch (Exception ex) {
            System.out.println("error en la lista" + ex);
        }

        return lista;

    }
  public static void main(String[] args) {
      Conexion.abrir();
      
      /*
      ArrayList<DLVentas> lista = VentasDAO.Listar(0, 15);
                int n = 0;
                String res = "";
                for (DLVentas x : lista) {
                   System.out.println(x.getInvfec()); 
                }*/
               
    }
}
