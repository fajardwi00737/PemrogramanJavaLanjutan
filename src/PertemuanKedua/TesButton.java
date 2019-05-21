/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PertemuanKedua;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author petik
 */
public class TesButton { 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Frame f = new Frame("Testing...");
    Button a = new Button("2");
    Button b = new Button("1");
    
    a.addActionListener(new kanan());
    b.addActionListener(new kiri());
    
    f.add(a, BorderLayout.EAST);
    f.add(b, BorderLayout.WEST);
    f.setSize(300, 300);
    f. setVisible(true);
    
    }

    private static class kanan implements ActionListener {

        public kanan() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Ini adalah barisan button Kanan");
            System.out.println("button yang di klik : "+ e.getActionCommand());
        }
    }

    private static class kiri implements ActionListener {

        public kiri() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
           System.out.println("Ini adalah barisan button kiri");
            System.out.println("button yang di klik : "+ e.getActionCommand());
        }
    }
}