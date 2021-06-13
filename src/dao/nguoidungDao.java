/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.NguoiDung;
import server.Databasehelper;

/**
 *
 * @author Hòa Bum
 */
public class nguoidungDao {
  
    public NguoiDung checklogin(String tenDangNhap, String matKhau) throws Exception{
        
        String sql ="select tenDangNhap, matKhau, vaitro from TaiKhoan"
                + " where tendangNhap = ? and matKhau = ?";
        try(
                Connection con= Databasehelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1,tenDangNhap);
            pstmt.setString(2, matKhau);
            try(ResultSet rs =pstmt.executeQuery()){
                if (rs.next()){
                    NguoiDung nd = new NguoiDung();
                    nd.setTenDangNhap(tenDangNhap);
                    nd.setVaitro(rs.getString("vaitro"));
                    return nd;
                }
            }
        }
        return null;
    }
}
