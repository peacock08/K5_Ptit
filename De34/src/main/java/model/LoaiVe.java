/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.TrongException;

/**
 *
 * @author Admin
 */
public class LoaiVe {
    private int ma;
    private String mota;
    private double giaban;
    private static int sma = 100;

    public LoaiVe() {
    }

    public LoaiVe(String mota, double giaban) throws TrongException{
        if (mota.isEmpty()) throw new TrongException();
        this.ma = sma++;
        this.mota = mota;
        this.giaban = giaban;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        LoaiVe.sma = sma;
    }
    
    public Object[] toObjects(){
        return new Object[] {
            ma, mota, giaban
        };
    }
}
