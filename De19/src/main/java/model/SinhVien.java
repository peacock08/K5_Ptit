/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.MaException;
import controller.TrongException;
import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class SinhVien implements Serializable{
    private int ma;
    private String hoten, ngaysinh, diachi,lop;
    private static int sma = 10000;

    public SinhVien() {
    }

    public SinhVien(int ma, String hoten, String ngaysinh, String diachi, String lop) {
        this.ma = ma;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.lop = lop;
    }
    
    public SinhVien(String hoten, String ngaysinh, String diachi, String lop)throws TrongException, MaException{
        if (hoten.isEmpty()||lop.isEmpty()||ngaysinh.isEmpty()||diachi.isEmpty()) throw new TrongException();
        if (!lop.matches("\\w\\d{2}\\w{4}\\d{3}")) throw new MaException();
        this.ma = sma++;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.lop = lop;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        SinhVien.sma = sma;
    }
    
    public Object[] toObjects() {
        return new Object[] {
            ma, hoten, ngaysinh, diachi, lop
        };
    }
}
