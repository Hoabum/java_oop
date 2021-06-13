/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
/**
 *
 * @author Hòa Bum
 */
public class Nhanvien {
    private String MaNV,Name,DiaChi,TinhLuong,sdt;
     private int Tuoi;
    private float Mucluong;
    private Date NgayVaoLam;

    public Nhanvien(String MaNV, String Name, String DiaChi, String TinhLuong, String sdt, int Tuoi, float Mucluong, Date NgayVaoLam) {
        this.MaNV = MaNV;
        this.Name = Name;
        this.DiaChi = DiaChi;
        this.TinhLuong = TinhLuong;
        this.sdt = sdt;
        this.Tuoi = Tuoi;
        this.Mucluong = Mucluong;
       this.NgayVaoLam = NgayVaoLam;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getTinhLuong() {
        return TinhLuong;
    }

    public void setTinhLuong(String TinhLuong) {
        this.TinhLuong = TinhLuong;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public float getMucluong() {
        return Mucluong;
    }

    public void setMucluong(float Mucluong) {
        this.Mucluong = Mucluong;
    }

    public Date getNgayVaoLam() {
        return NgayVaoLam;
    }

    public void setNgayVaoLam(Date NgayVaoLam) {
        this.NgayVaoLam = NgayVaoLam;
    }

  

    public Nhanvien() {
    }
}
