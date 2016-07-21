/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sifirdanjava.Thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cem
 */
public class InterrupttThread {
    public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run() {                
                System.out.println("Thread basladi..");
                while (!isInterrupted()) {
                    System.out.println("Thread calisiyor");                    
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        interrupt();
                        System.out.println("uyku modu kesildi");
                    }
                }
                System.out.println("Thread bitti");
            }            
        };
        thread.start();
        try {            
            thread.sleep(2000);
            thread.interrupt();
        } catch (InterruptedException ex) {
            Logger.getLogger(InterrupttThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
