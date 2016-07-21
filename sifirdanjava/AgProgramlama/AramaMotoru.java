/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sifirdanjava.AgProgramlama;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cem
 */
public class AramaMotoru {
    public static void main(String[] args) {
        String arananKelime = "cem";
        try {
            URL url = new URL("http://www.google.com/search?" + arananKelime);
            String sonuc = new Scanner(url.openStream()).useDelimiter("\\Z").next();
            System.out.println(sonuc);
        } catch (MalformedURLException ex) {
            Logger.getLogger(AramaMotoru.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AramaMotoru.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
