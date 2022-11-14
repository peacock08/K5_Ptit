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
public class Tour implements Serializable{
    private int ma;
    private String ten, thongtin;
    private double dongia;
    private static int sma = 1000;

    public Tour() {
    }

    public Tour(int ma, String ten, String thongtin, double dongia) {
        this.ma = ma;
        this.ten = ten;
        this.thongtin = thongtin;
        this.dongia = dongia;
    }
    
    public Tour(String ten, String thongtin, double dongia) throws TrongException{
        if (ten.isEmpty()) throw new TrongException();
        this.ma = sma++;
        this.ten = ten;
        this.thongtin = thongtin;
        this.dongia = dongia;
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

    public String getThongtin() {
        return thongtin;
    }

    public void setThongtin(String thongtin) {
        this.thongtin = thongtin;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Tour.sma = sma;
    }
    public Object[] toObjects() {
        return new Object[] {
           ma, ten, thongtin, dongia
        };
    }
}
