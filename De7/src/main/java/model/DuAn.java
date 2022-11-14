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
public class DuAn implements Serializable{
    private int ma;
    private String ten, kieu;
    private double kinhphi;
    private static int sma = 10000;

    public DuAn() {
    }

    public DuAn(String ten, String kieu, double kinhphi) throws TrongException{
        if (ten.isEmpty()) throw new TrongException();
        this.ma = sma++;
        this.ten = ten;
        this.kieu = kieu;
        this.kinhphi = kinhphi;
    }

    public DuAn(int ma, String ten, String kieu, double kinhphi) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

    public String getKieu() {
        return kieu;
    }

    public void setKieu(String kieu) {
        this.kieu = kieu;
    }

    public double getKinhphi() {
        return kinhphi;
    }

    public void setKinhphi(double kinhphi) {
        this.kinhphi = kinhphi;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        DuAn.sma = sma;
    }
    
    public Object[] toObjects() {
        return new Object[]{
          ma, ten, kieu, kinhphi
        };
    }
}
