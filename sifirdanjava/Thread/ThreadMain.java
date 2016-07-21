/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sifirdanjava.Thread;

/**
 *
 * @author cem
 */
public class ThreadMain {
    /*Moden isletim sistemleri kullanıcılara değisik programların aynı anda calistigi ilizyonunu 
    vermektedir.Bu tur isletim sitemlerine multitasking isletim sistemleri denmektedir.Aslında 
    programlar paralel olarak calismamaktadır.Thread ile programladığımız zaman, program parçamızıda 
    hızlandırmış oluyoruz.
    */
    public static void main(String[] args) {
        Thread thread = new Thread(new Tarih());
        thread.start();
        Thread thread1 = new Thread(new Sayac());
        thread1.start();
        /*Thread ler ne zaman biter?
        run() metodu hic bir hata olmadan biterse Threadin ömrü bitmiş olur
        run() metodunda RunTimeExcaption olursa metod sona erer dolayısıyla Thread sona erer
        stop() metodu ile sona erdirilmişse 
        JVM sona erdirilirse tüm threadler ölür */
    }
}
