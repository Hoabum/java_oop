/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;





public class Databasehelper {
    private Connection con;
    public  static Connection openConnection() throws Exception{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=BTL_QLCF";
        String dbusername = "sa";
        String password ="123";
        Connection con = DriverManager.getConnection(connectionUrl,dbusername,password);
        return con;
                }
    public ResultSet getDataNv(String jtable) throws SQLException{
        ResultSet kq= null;
        Statement st= con.createStatement();
        String sql ="select * from NhanVien";
        kq=st.executeQuery(sql);
        return kq;
    }
    }
    
    

