/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Hòa Bum
 */
public class NguoiDung {
    private String tenDangNhap, matKhau,vaitro;

    public NguoiDung() {
    }

    public NguoiDung(String tenDangNhap, String matKhau, String vaitro) {
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.vaitro = vaitro;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getVaitro() {
        return vaitro;
    }

    public void setVaitro(String vaitro) {
        this.vaitro = vaitro;
    }





 
    
}
