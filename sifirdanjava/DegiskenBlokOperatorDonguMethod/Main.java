/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sifirdanjava.DegiskenBlokOperatorDonguMethod;

/**
 *
 * @author cem
 */
public class Main {
    public static void main(String[] args) {
        int yil = 2016;//-2147483648 - 2147483647
        String isim = "cem dırman";
        boolean dogruMuYanlısMi = true;
        char c = 'c';
        float f = (float) 2.5865;
        double d = 2.85;
        byte b = 127;
        long l  = 200000000;
        short s = 4523;
        
        int counter = 0;
        while (counter < 100) {            
            counter++;
        }
        for (int i = 0; i < counter; i++) {
            System.out.println("for döngüsü");
        }
        /*do{
            System.out.println("do-while döngüsü");
        }while (dogruMuYanlısMi);*/
     
        //ic ice donguler
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }   
        
        //metodlara parametre gecisi ve dönüs degeri elde etme
        int buyukSayi = buyukBul(15, 9);
    }
    
    static int buyukBul(int a, int b){
        if (a > b) {
            return a;
        }else {
            return b;
        }        
    }
    
}
