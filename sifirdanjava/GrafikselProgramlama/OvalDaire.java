/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sifirdanjava.GrafikselProgramlama;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author cem
 */
public class OvalDaire extends JPanel{
    @Override
    protected void paintComponent(Graphics g){
        g.drawOval(10, 10, 50, 50);
        g.fillOval(120, 10, 100, 60);
        g.drawArc(10, 80, 100, 60, 30, 30);
        g.fillArc(120, 80, 100, 60, 30, 80);
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.add(new OvalDaire());
        frame.setVisible(true);
    }
    
}
