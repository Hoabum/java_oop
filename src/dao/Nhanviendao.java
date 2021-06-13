package dao;

import gui.NhanVien;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.NguoiDung;
import model.Nhanvien;
import server.Databasehelper;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hòa Bum
 */
public class Nhanviendao {
    
    public boolean insert(Nhanvien nv) throws Exception{
        
        String sql ="INSERT INTO dbo.NhanVien(MaNV,Name,Tuoi,sdt,DiaChi,TinhLuong,MucLuong,NgayVaoLam)"
                + "VALUES(?,?,?,?,?,?,?,?)";
        try(
            Connection con = Databasehelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, nv.getMaNV());
            pstmt.setString(2, nv.getName());
            pstmt.setInt(3, nv.getTuoi());
            pstmt.setString(4, nv.getSdt());
            pstmt.setString(5, nv.getDiaChi());
            pstmt.setString(6, nv.getTinhLuong());
            pstmt.setFloat(7, nv.getMucluong());
           pstmt.setDate(8,new Date(nv.getNgayVaoLam().getTime()) );
            return  pstmt.executeUpdate()>0; 
            }
        
        }
    public boolean update(Nhanvien nv) throws Exception{
        String sql ="UPDATE dbo.NhanVien"+
          " SET Name = ?,Tuoi = ?,sdt = ?,DiaChi = ?,TinhLuong = ?,MucLuong = ?,NgayVaoLam = ?"
        + " Where MaNV = ? ";
        
        try(
            Connection con = Databasehelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(8, nv.getMaNV());
            pstmt.setString(1, nv.getName());
            pstmt.setInt(2, nv.getTuoi());
            pstmt.setString(3, nv.getSdt());
            pstmt.setString(4, nv.getDiaChi());
            pstmt.setString(5, nv.getTinhLuong());
            pstmt.setFloat(6, nv.getMucluong());
           pstmt.setDate(7,new Date(nv.getNgayVaoLam().getTime()) );
            return  pstmt.executeUpdate()>0; 
            }
        
        }
     public boolean delete(String MaNV) throws Exception{
        String sql ="delete from NhanVien"
        + " Where MaNV = ? ";
        
        try(
            Connection con = Databasehelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, MaNV);
            return  pstmt.executeUpdate()>0; 
            }
        
        }
     private void createNhanVien(final ResultSet rs) throws SQLException{
         Nhanvien nv = new Nhanvien();
         nv.setMaNV(rs.getString("maNV"));
         nv.setName(rs.getString("Name"));
         nv.setTuoi(rs.getInt("Tuoi"));
         nv.setSdt(rs.getString("sdt"));
         nv.setDiaChi(rs.getString("DiaChi"));
         nv.setMucluong(rs.getFloat("Mucluong"));
         nv.setTinhLuong(rs.getString("TinLuong"));
 
         
     }
     public List< Nhanvien> findAll() throws Exception{
     String sql = " select * from nhanvien";
    try(Connection con = Databasehelper.openConnection();
       PreparedStatement pstmt = con.prepareStatement(sql);
        )       
{
   try (ResultSet rs = pstmt.executeQuery();){
       List<Nhanvien> list = new ArrayList<>();
       while (rs.next()){
          Nhanvien nv = new Nhanvien();
          nv.setMaNV(rs.getString("MaNV"));
          nv.setName(rs.getString("Name"));
          nv.setTuoi(rs.getInt("Tuoi"));
          nv.setSdt(rs.getString("Sdt")); 
          nv.setDiaChi(rs.getString("DiaChi"));
          nv.setMucluong(rs.getFloat("MucLuong"));
          nv.setTinhLuong(rs.getString("TinhLuong"));
          list.add(nv);
        }
        return list;
}
}
     }
}

