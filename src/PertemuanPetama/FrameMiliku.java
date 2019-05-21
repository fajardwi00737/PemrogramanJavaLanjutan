/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PertemuanPetama;

import java.awt.Color;
import java.awt.Frame;

/**
 *
 * @author petik
 */
public class FrameMiliku extends Frame{
    
    private FrameMiliku(String ini_Frame_Baru){
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
       FrameMiliku fm = new FrameMiliku("Ini Frame Baru");
       
       fm.setSize(500,1000);
       fm.setBackground(Color.red);
       fm.setVisible(true);

    }
    
}
