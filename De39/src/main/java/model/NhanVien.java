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
public class NhanVien implements Serializable{
    
    private int ma;
    private String hoten, diachi, sodt;
    private int bacluong;
    private static int sma =1000;

    public NhanVien() {
    }

    public NhanVien(int ma, String hoten, String diachi, String sodt, int bacluong) {
        this.ma = ma;
        this.hoten = hoten;
        this.diachi = diachi;
        this.sodt = sodt;
        this.bacluong = bacluong;
    }
    
    public NhanVien(String hoten, String diachi, String sodt, int bacluong)  throws TrongException, DienThoaiException{
        if (hoten.isEmpty()||sodt.isEmpty()) throw new TrongException();
        if (!sodt.matches("\\d+")) throw new DienThoaiException();
        this.ma = sma++;
        this.hoten = hoten;
        this.diachi = diachi;
        this.sodt = sodt;
        this.bacluong = bacluong;
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

    public String getSodt() {
        return sodt;
    }

    public void setSodt(String sodt) {
        this.sodt = sodt;
    }

    public int getBacluong() {
        return bacluong;
    }

    public void setBacluong(int bacluong) {
        this.bacluong = bacluong;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        NhanVien.sma = sma;
    }
    
    
    public Object[] toObjects() {
        return new Object[]{
            ma, hoten, diachi, sodt, bacluong
        };
    }
    
}
