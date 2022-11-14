/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.TrongException;
import java.math.BigDecimal;

/**
 *
 * @author Admin
 */
public class HanhKhach {
    private int ma;
    private String hoten, diachi, loaikhach;
    private static int sma = 10000;

    public HanhKhach() {
    }

    public HanhKhach(String hoten, String diachi, String loaikhach) throws TrongException{
        if (hoten.isEmpty()) throw new TrongException();
        this.ma = sma++;
        this.hoten = hoten;
        this.diachi = diachi;
        this.loaikhach = loaikhach;
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

    public String getLoaikhach() {
        return loaikhach;
    }

    public void setLoaikhach(String loaikhach) {
        this.loaikhach = loaikhach;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        HanhKhach.sma = sma;
    }
    
    public Object[] toObjects(){
        return new Object[] {
            ma, hoten, diachi, loaikhach
        };
    }
    
}
