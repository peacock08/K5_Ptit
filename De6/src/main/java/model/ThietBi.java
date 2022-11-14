/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.NamException;
import controller.TrongException;
import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class ThietBi implements Serializable{
    private int ma;
    private String ten, xuatxu;
    private int namsx;
    private static int sma=10000;

    public ThietBi() {
    }

    public ThietBi(String ten, String xuatxu, int namsx) throws TrongException, NamException{
        if (ten.isEmpty()) throw new TrongException();
        if (namsx <1900 || namsx >2022) throw new NamException();
        this.ma = sma++;
        this.ten = ten;
        this.xuatxu = xuatxu;
        this.namsx = namsx;
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

    public String getXuatxu() {
        return xuatxu;
    }

    public void setXuatxu(String xuatxu) {
        this.xuatxu = xuatxu;
    }

    public int getNamsx() {
        return namsx;
    }

    public void setNamsx(int namsx) {
        this.namsx = namsx;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        ThietBi.sma = sma;
    }
    
    public Object[] toObjects() {
        return new Object[] {
            ma,ten,xuatxu,namsx
        };
    }
    
}
