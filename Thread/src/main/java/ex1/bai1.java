/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class bai1 {
    public static void main(String[] args) {
        new Thread() {
            public void run() {
                SimpleDateFormat f = new SimpleDateFormat("hh:mm:ss");
                while (true) {                    
                    System.out.println("\033[0m BLABLA \033[0m\n"+f.format(new Date()));
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
            }
        }.start();
    }
}
