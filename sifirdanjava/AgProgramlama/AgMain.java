/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sifirdanjava.AgProgramlama;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cem
 */
public class AgMain {

    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.google.com");
            System.out.println(url.getProtocol());
            System.out.println(url.getHost());
            System.out.println(url.getPort());
            System.out.println(url.getFile());
            System.out.println(url.getPath());
            System.out.println(url.getQuery());
            System.out.println(url.getRef());
        } catch (MalformedURLException ex) {
            Logger.getLogger(AgMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
