/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.TrongException;
import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class MonHoc implements Serializable {

   
    private int ma;
    private String ten;
    private int tongSoTiet;
    private String loaiMonHoc;
    private static int sma = 100;

    public MonHoc() {
    }

    public MonHoc(String ten, int tongSoTiet, String loaiMonHoc) throws TrongException{
        if(ten.isEmpty()) throw new TrongException();
        this.ma = sma++;
        this.ten = ten;
        this.tongSoTiet = tongSoTiet;
        this.loaiMonHoc = loaiMonHoc;
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

    public int getTongSoTiet() {
        return tongSoTiet;
    }

    public void setTongSoTiet(int tongSoTiet) {
        this.tongSoTiet = tongSoTiet;
    }

    public String getLoaiMonHoc() {
        return loaiMonHoc;
    }

    public void setLoaiMonHoc(String loaiMonHoc) {
        this.loaiMonHoc = loaiMonHoc;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        MonHoc.sma = sma;
    }

    
    
    
    public Object[] toObjects() {
        return new Object[] {
            ma, ten, tongSoTiet, loaiMonHoc
        };
    }
}
