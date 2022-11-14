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
public class MayTinh implements Serializable{
    private int so;
    private String ten, xuatxu;
    private int namnhap;
    private String cauhinh;
    private static int sma= 10000;

    public MayTinh() {
    }

    public MayTinh(int so, String ten, String xuatxu, int namnhap, String cauhinh) {
        this.so = so;
        this.ten = ten;
        this.xuatxu = xuatxu;
        this.namnhap = namnhap;
        this.cauhinh = cauhinh;
    }
    

    public MayTinh(String ten, String xuatxu, int namnhap, String cauhinh)throws TrongException, NamException{
        if (ten.isEmpty()||cauhinh.isEmpty()) throw new TrongException();
        if (namnhap >2022 || namnhap <1000) throw new NamException();
        this.so = sma++;
        this.ten = ten;
        this.xuatxu = xuatxu;
        this.namnhap = namnhap;
        this.cauhinh = cauhinh;
    }

    public int getSo() {
        return so;
    }

    public void setSo(int so) {
        this.so = so;
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

    public int getNamnhap() {
        return namnhap;
    }

    public void setNamnhap(int namnhap) {
        this.namnhap = namnhap;
    }

    public String getCauhinh() {
        return cauhinh;
    }

    public void setCauhinh(String cauhinh) {
        this.cauhinh = cauhinh;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        MayTinh.sma = sma;
    }
    
    public Object[] toObjects() {
        return new Object[] {
            so, ten, xuatxu, namnhap, cauhinh
        };
    }
}
