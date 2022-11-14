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
public class SinhVien implements Serializable{
    private int maSV;
    private String hoten, dc, dt;
    private static int sma = 10000;

    public SinhVien() {
    }

    public SinhVien(String hoten, String dc, String dt) throws 
            TrongException, DienThoaiException{
        if (hoten.isEmpty() || dt.isEmpty()) throw new TrongException();
        if (!dt.matches("\\d++")) throw new DienThoaiException();
        this.maSV = sma++;
        this.hoten = hoten;
        this.dc = dc;
        this.dt = dt;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        SinhVien.sma = sma;
    }
    
    public Object[] toObjects() {
        return new Object[] {
            maSV, hoten, dc, dt
        };
    }
}
