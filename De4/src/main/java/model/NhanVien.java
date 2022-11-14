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
public class NhanVien implements Serializable{
    private int ma;
    private String ten, diachi, sodt;
    private static int sma = 1000;

    public NhanVien() {
    }

    public NhanVien(String ten, String diachi, String sodt) throws TrongException, DienThoaiException{
        if (ten.isEmpty()) throw new TrongException();
        if (!sodt.matches("\\d+")) throw new DienThoaiException();
        this.ma = ma;
        this.ten = ten;
        this.diachi = diachi;
        this.sodt = sodt;
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

    public String getSodt() {
        return sodt;
    }

    public void setSodt(String sodt) {
        this.sodt = sodt;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        NhanVien.sma = sma;
    }
    
    public Object[] toObjects() {
        return new Object[] {
            ma, ten, diachi, sodt
        };
    }
}
