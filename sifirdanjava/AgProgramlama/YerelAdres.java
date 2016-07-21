/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sifirdanjava.AgProgramlama;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cem
 */
public class YerelAdres {

    public static void main(String[] args) {
        try {
            int i = 0;
            Enumeration<NetworkInterface> agArayuzEnum = NetworkInterface.getNetworkInterfaces();
            while (agArayuzEnum.hasMoreElements()) {
                NetworkInterface networkInterface = agArayuzEnum.nextElement();
                System.out.println("NetworkInterface" + i++ + ": " + networkInterface.getDisplayName());
                for (InetAddress inetAddress : Collections.list(networkInterface.getInetAddresses())) {
                    System.out.println("host name: " + inetAddress.getCanonicalHostName());   
                    System.out.println("IP: " + inetAddress.getHostAddress());
                    System.out.println("Loopback: " + inetAddress.isLoopbackAddress());
                    System.out.println("Sitelocal: " + inetAddress.isSiteLocalAddress());
                }
            }

        } catch (SocketException ex) {
            Logger.getLogger(YerelAdres.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
