/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sifirdanjava.AgProgramlama.SocketProgramlama;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cem
 */
public class SocketBilgi {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 80);
            System.out.println(socket.getKeepAlive());
            System.out.println(socket.getLocalAddress());
            System.out.println(socket.getLocalPort());
            System.out.println(socket.getLocalSocketAddress());
            System.out.println(socket.getOOBInline());
            System.out.println(socket.getPort());
            System.out.println(socket.getRemoteSocketAddress());
            System.out.println(socket.getReuseAddress());
            System.out.println(socket.getReceiveBufferSize());
            System.out.println(socket.getSendBufferSize());
        } catch (IOException ex) {
            Logger.getLogger(SocketBilgi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
