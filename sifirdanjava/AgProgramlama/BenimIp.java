/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sifirdanjava.AgProgramlama;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cem
 */
public class BenimIp {
    public static void main(String[] args) {
        try {
            System.out.println("Host Name / Adres: " + InetAddress.getLocalHost());
        } catch (UnknownHostException ex) {
            Logger.getLogger(BenimIp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
