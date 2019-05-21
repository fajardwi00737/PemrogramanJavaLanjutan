/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PertemuanPetama;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

/**
 *
 * @author petik
 */
public class FrameDenganPanel extends Frame{

    /**
     * @param args the command line arguments
     */
    
     private FrameDenganPanel(String frame_Dengan_Panel) {
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        FrameDenganPanel fp = new FrameDenganPanel("Frame Dengan Panel"); 
        Panel pan = new Panel();
        
        fp.setSize(600,600);
        fp.setBackground(Color.lightGray);
        fp.setLayout(null);
        pan.setSize(300,300);
        pan.setBackground(Color.red);
        
        fp.add(pan);
        fp.setVisible(true);
    }
    
}
