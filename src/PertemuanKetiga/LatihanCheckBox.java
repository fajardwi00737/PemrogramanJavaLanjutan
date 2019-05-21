/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PertemuanKetiga;

import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javafx.scene.control.CheckBox;

/**
 *
 * @author petik
 */
public class LatihanCheckBox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Frame f = new Frame("Latihan Check Box");
        f.setLayout(new GridLayout(3,1));
        Checkbox satu = new Checkbox ("satu", true);
        Checkbox dua = new Checkbox("Dua", true);
        Checkbox tiga = new Checkbox("Tiga", true);
        
        satu.addItemListener(new Handler());
        dua.addItemListener(new Handler());
        tiga.addItemListener(new Handler());
        
        f.add(satu);
        f.add(dua);
        f.add(tiga);
        
        f.setSize(300, 300);
        f.setVisible(true);
    }
    
    static class Handler implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent e) {
           String pilih = "tidak";
            if (e.getStateChange()== ItemEvent.SELECTED) {
                pilih = "Ya";
            }
            System.out.println(e.getItem()+ " : " +pilih);
        }        
    }  
    
}
