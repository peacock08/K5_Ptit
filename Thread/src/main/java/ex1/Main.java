/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1;

import static java.lang.Thread.sleep;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + "START");
        for (int i = 0; i < 5; i++) {
            System.out.println(t.getName()+i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        ThreadDemo t1 = new ThreadDemo("Gio Moi");
        t1.start();
        RunnableDemo r = new RunnableDemo("Cong Vu");
        Thread t2 = new Thread(r);
        t2.start();
        System.out.println(t.getName() + "STOP");
    }
}