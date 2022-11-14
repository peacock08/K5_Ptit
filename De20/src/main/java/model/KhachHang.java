/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.DienThoaiException;
import controller.TrongException;
import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class KhachHang implements Serializable{
    private  int ma;
    private String ten, diachi, dienthoai, loai;
    private static int sma = 10000;

    public KhachHang() {
    }

    public KhachHang(int ma, String ten, String diachi, String dienthoai, String loai) {
        this.ma = ma;
        this.ten = ten;
        this.diachi = diachi;
        this.dienthoai = dienthoai;
        this.loai = loai;
    }
    
    public KhachHang(String ten, String diachi, String dienthoai, String loai) throws 
            DienThoaiException, TrongException{
        if (ten.isEmpty() || dienthoai.isEmpty()) throw new TrongException();
        if (!dienthoai.matches("\\d++")) throw new DienThoaiException();
        this.ma = sma++;
        this.ten = ten;
        this.diachi = diachi;
        this.dienthoai = dienthoai;
        this.loai = loai;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        KhachHang.sma = sma;
    }
    
    public Object[] toObjects() {
        return new Object[] {
            ma, ten, diachi, dienthoai, loai
        };
    }
}
