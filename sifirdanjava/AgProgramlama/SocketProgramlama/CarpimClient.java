package sifirdanjava.AgProgramlama.SocketProgramlama;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cem
 */
public class CarpimClient {
    
   
    public static void main(String[] args) {
         Socket server = null;
        try {
            server = new Socket("localhost", 23453);
            Scanner giris = new Scanner(server.getInputStream());
            System.out.println("Server'a baglandı");
            PrintWriter cikis = new PrintWriter(server.getOutputStream(), true);
            cikis.println("20");
            cikis.println("5");
            System.out.println(giris.nextLine());
        } catch (IOException ex) {
            Logger.getLogger(CarpimClient.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (server != null) {
                try {
                    server.close();
                } catch (IOException ex) {
                    Logger.getLogger(CarpimClient.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }    
}
