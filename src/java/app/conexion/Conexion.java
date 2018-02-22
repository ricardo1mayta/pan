/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Sistemas05
 */
public class Conexion {

    private static final String url = "jdbc:sqlserver://localhost:1433;databaseName=INDUPANSOFT_OF";
    private static final String us = "sa";
    private static final String pw = "1234";

    public static Connection abrir() {
        try {
            //registrar driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //abrir la conneccion
            Connection cn = DriverManager.getConnection(url, us, pw);
            //retorna la conexion
           // System.out.println("exito");
            return cn;

        } catch (ClassNotFoundException | SQLException ex) {
            //si existe error ssolo restorna null
            System.out.println("fallo");
            return null;
        }

    }
}

