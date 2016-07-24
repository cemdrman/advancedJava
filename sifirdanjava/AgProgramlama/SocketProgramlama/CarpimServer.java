/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sifirdanjava.AgProgramlama.SocketProgramlama;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cem
 */
public class CarpimServer {
    private static void baglanti(Socket client){
        try {
            Scanner giris = new Scanner(client.getInputStream());
            PrintWriter cikis = new PrintWriter(client.getOutputStream(), true);
            String sayi1 = giris.nextLine();
            String sayi2 = giris.nextLine();
            cikis.print(sayi1 + sayi2);
        } catch (IOException ex) {
            Logger.getLogger(CarpimServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(23453);
            while (true) {                
                Socket client = null;
                client = serverSocket.accept();// bağlantı gelene kadar burada bekler
                System.out.println(client.getLocalAddress() + " bağlandı");
                baglanti(client);
            }
        } catch (IOException ex) {
            Logger.getLogger(CarpimServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}
