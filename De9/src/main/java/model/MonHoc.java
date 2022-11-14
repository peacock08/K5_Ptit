/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.TrongExcception;
import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class MonHoc implements Serializable{
    private int ma;
    private String ten;
    private int tong, tongLT;
    private double kinhphi;
    private static int sma = 100;

    public MonHoc() {
    }

    public MonHoc(int ma, String ten, int tong, int tongLT, double kinhphi) {
        this.ma = ma;
        this.ten = ten;
        this.tong = tong;
        this.tongLT = tongLT;
        this.kinhphi = kinhphi;
    }
    
    public MonHoc(String ten, int tong, int tongLT, double kinhphi)throws TrongExcception{
        if (ten.isEmpty()) throw new TrongExcception();
        this.ma = sma++;
        this.ten = ten;
        this.tong = tong;
        this.tongLT = tongLT;
        this.kinhphi = kinhphi;
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

    public int getTong() {
        return tong;
    }

    public void setTong(int tong) {
        this.tong = tong;
    }

    public int getTongLT() {
        return tongLT;
    }

    public void setTongLT(int tongLT) {
        this.tongLT = tongLT;
    }

    public double getKinhphi() {
        return kinhphi;
    }

    public void setKinhphi(double kinhphi) {
        this.kinhphi = this.tongLT*275000+(this.tong-this.tongLT)*7*27500;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        MonHoc.sma = sma;
    }
    
    public Object[] toObjects() {
        return new Object[] {
            ma, ten, tong, tongLT, kinhphi
        };
    }
}
