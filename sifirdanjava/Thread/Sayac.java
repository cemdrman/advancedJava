/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sifirdanjava.Thread;

import java.util.Date;

/**
 *
 * @author cem
 */
public class Sayac implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(new Date());
        }
    }
    
}
