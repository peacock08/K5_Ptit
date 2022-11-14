/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.TrongException;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author Admin
 */
public class NhanVien implements  Serializable{
    private int ma;
    private String hoten, diachi, chuyenmon;
    private static int sma = 10000;

    public NhanVien() {
    }

    public NhanVien(String hoten, String diachi, String chuyenmon) throws TrongException{
        if (hoten.isEmpty()) throw new TrongException();
        this.ma = sma++;
        this.hoten = hoten;
        this.diachi = diachi;
        this.chuyenmon = chuyenmon;
    }

    public NhanVien(int ma, String ten, String diachi, String chuyenmon) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getChuyenmon() {
        return chuyenmon;
    }

    public void setChuyenmon(String chuyenmon) {
        this.chuyenmon = chuyenmon;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        NhanVien.sma = sma;
    }
    
    public Object[] toObjects(){
        return new Object[] {
            ma, hoten, diachi, chuyenmon
        };
    }
}
