/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Blob;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.rowset.serial.SerialBlob;
import model.MeNu;

import server.Databasehelper;

/**
 *
 * @author Hòa Bum
 */
public class menuDao {
     public boolean insert(MeNu mn) throws Exception{
        
        String sql ="INSERT INTO dbo.Menu([MaMon],[TenMon],[DonGia],[MaLoaiMon],[Hinh])"
                + "VALUES(?,?,?,?,?)";
        try(
            Connection con = Databasehelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, mn.getMaMon());
            pstmt.setString(2, mn.getTenMon());
            pstmt.setString(3, mn.getDonGia());
            pstmt.setString(4, mn.getMaLoaiMon());
            if(mn.getHinh()!=null)
            {
                Blob hinh = new SerialBlob(mn.getHinh());
                pstmt.setBlob(5, hinh);
            }
            else{
                Blob hinh = null;
                pstmt.setBlob(5, hinh);
            }
            
            return  pstmt.executeUpdate()>0; 
            }
        
        }
     public boolean update(MeNu mn) throws Exception{
        String sql ="UPDATE dbo.MeNu"+
          " SET TenMon = ?,DonGia = ?,MaLoaiMon = ?,Hinh = ?"
        + " Where MaMon = ? ";
        
        try(
            Connection con = Databasehelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(5, mn.getMaMon());
            pstmt.setString(1, mn.getTenMon());
            pstmt.setString(2, mn.getDonGia());
            pstmt.setString(3, mn.getMaLoaiMon());
           // pstmt.setString(4, mn.getHinh());
            if(mn.getHinh()!=null)
            {
                Blob hinh = new SerialBlob(mn.getHinh());
                pstmt.setBlob(4, hinh);
            }
            else{
                Blob hinh = null;
                pstmt.setBlob(4, hinh);
            }
            
            return  pstmt.executeUpdate()>0; 
            }
        
        }
     public boolean delete(String MaMon) throws Exception{
        String sql ="delete from MeNu" + " Where MaMon = ? ";
        
        try(
            Connection con = Databasehelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, MaMon);
            return  pstmt.executeUpdate()>0; 
            }
        
        }
     public MeNu findbyId(String MaMon) throws Exception{
        String sql ="select * from MeNu Where MaMon = ? ";
        
        try(
            Connection con = Databasehelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, MaMon);
            try(ResultSet rs = pstmt.executeQuery();){
                if(rs.next()){
                    MeNu mn = createMeNu(rs);
                    return mn;
                    
            }
        }
            return null;
     }
     }

    private MeNu createMeNu(final ResultSet rs) throws SQLException {
        MeNu mn = new MeNu();
        mn.setMaMon(rs.getString("MaMon"));
        mn.setTenMon(rs.getString("TenMon"));
        mn.setDonGia(rs.getString("DonGia"));
        mn.setMaLoaiMon(rs.getString("MaLoaiMon"));
        Blob blob = rs.getBlob("Hinh");
        if(blob != null)
            mn.setHinh(blob.getBytes(1, (int) blob.length()));
        return mn;
    }

        
     public List<MeNu> findAll() throws Exception{
        String sql ="select * from MeNu ";
        
        try(
            Connection con = Databasehelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            ){
           
            try(ResultSet rs = pstmt.executeQuery();){
                List<MeNu> list = new ArrayList<>();
                while(rs.next()){
                    MeNu mn = createMeNu(rs);
                    list.add(mn);       
            }
                return list;
        }
            
     }
     }




}
