/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PertemuanKeempat;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
/**
 *
 * @author petik
 */
public class LatihanSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        JFrame swingFrame = new JFrame();
        swingFrame.setLayout(new GridLayout(2,2));
        JButton button1 = new JButton("Nama : Fajar Dwi Saputra");
        JButton button2 = new JButton("Umur : 20 Tahun");
        JButton button3 = new JButton("Lahir : Jakarta");
        Border borderGaris1 = BorderFactory.createLineBorder(Color.yellow, 8);
        Border borderGaris2 = BorderFactory.createEtchedBorder(Color.lightGray, Color.green);
        Border borderGaris3 = BorderFactory.createBevelBorder(BevelBorder.RAISED);

        button1.setBackground(Color.red);
        button2.setBackground(Color.blue);
        button3.setBackground(Color.WHITE);
        button1.setBorder(borderGaris1);
        button2.setBorder(borderGaris2);
        button3.setBorder(borderGaris3);
        
        swingFrame.add(button1);
        swingFrame.add(button2);
        swingFrame.add(button3);
        swingFrame.setSize(200, 200);
        swingFrame.setVisible(true);
    }
    
}
