/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PertemuanKetiga;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author petik
 */
public class latihanButton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        // TODO code application logic here
        
        Frame f = new Frame ("Coba Komponen Button");
        Button b =new Button ("Klik Me");
        b.setActionCommand("tombol telah diklik");
        b.addActionListener(new kanan());
        
        f.add(b);
        f.setSize(200, 200);
        f.setVisible(true);
    }

    private static class kanan implements ActionListener {

        public kanan() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Ini adalah button klik me");
            System.out.println(e.getActionCommand());
        }
    }
    
}
