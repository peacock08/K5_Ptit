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
public class KhachHang implements Serializable{
    private int ma;
    private String hoten, diachi, sodthoai;
    private static int sma = 10000;

    public KhachHang() {
    }

    public KhachHang(String hoten, String diachi, String sodthoai) throws TrongException, DienThoaiException{
        if (hoten.isEmpty() || sodthoai.isEmpty()) throw new TrongException();
        if(!sodthoai.matches("\\d++")) throw new DienThoaiException();
        this.ma = sma++;
        this.hoten = hoten;
        this.diachi = diachi;
        this.sodthoai = sodthoai;
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

    public String getSodthoai() {
        return sodthoai;
    }

    public void setSodthoai(String sodthoai) {
        this.sodthoai = sodthoai;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        KhachHang.sma = sma;
    }
    
    public Object[] toObjects() {
        return new Object[] {
           ma, hoten, diachi, sodthoai
        };
    }
}
