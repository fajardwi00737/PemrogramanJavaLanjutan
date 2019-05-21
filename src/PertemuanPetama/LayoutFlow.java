/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PertemuanPetama;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

/**
 *
 * @author petik
 */
public class LayoutFlow {
    
    private Frame f;
    private Button button1, button2, button3;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        LayoutFlow contohFlow = new LayoutFlow();
        contohFlow.tampil();
    }

    private void tampil() {
       f = new Frame("Flow Layout");
       f.setLayout(new FlowLayout());
       button1 = new Button("OK");
       button2 = new Button("Open");
       button3 = new Button("close");
       
       f.add(button1);
       f.add(button2);
       f.add(button3);
       f.setSize(300,300);
       f.setVisible(true);
    }   
}
