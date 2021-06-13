package model;

import java.sql.ResultSet;
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
public class MeNu {
    private  String MaMon;
    private  String TenMon;
    private String DonGia;
    private String MaLoaiMon;
    private byte [] Hinh;
    
    public MeNu(String MaMon, String TenMon, String DonGia, String MaLoaiMon, byte[] Hinh) {
        this.MaMon = MaMon;
        this.TenMon = TenMon;
        this.DonGia = DonGia;
        this.MaLoaiMon = MaLoaiMon;
        this.Hinh = Hinh;
    }

    public String getMaMon() {
        return MaMon;
    }

    public void setMaMon(String MaMon) {
        this.MaMon = MaMon;
    }

    public String getTenMon() {
        return TenMon;
    }

    public void setTenMon(String TenMon) {
        this.TenMon = TenMon;
    }

    public String getDonGia() {
        return DonGia;
    }

    public void setDonGia(String DonGia) {
        this.DonGia = DonGia;
    }

    public String getMaLoaiMon() {
        return MaLoaiMon;
    }

    public void setMaLoaiMon(String MaLoaiMon) {
        this.MaLoaiMon = MaLoaiMon;
    }

    public byte[] getHinh() {
        return Hinh;
    }

    public void setHinh(byte[] Hinh) {
        this.Hinh = Hinh;
    }
    


    public MeNu() {
    }
}

