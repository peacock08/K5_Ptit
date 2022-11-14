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
public class MatHang implements Serializable{
    private int ma;
    private String ten, nhom;
    private double giaban;
    private int soluong;
    private static int sma= 1000;

    public MatHang() {
    }

    public MatHang(String ten, String nhom, double giaban, int soluong) throws TrongException{
        if (ten.isEmpty()) throw new TrongException();
        this.ma = sma++;
        this.ten = ten;
        this.nhom = nhom;
        this.giaban = giaban;
        this.soluong = soluong;
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

    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        MatHang.sma = sma;
    }
    
    public Object[] toObjects() {
        return new Object[] {
            ma, ten, nhom, giaban, soluong
        };
    }
}
