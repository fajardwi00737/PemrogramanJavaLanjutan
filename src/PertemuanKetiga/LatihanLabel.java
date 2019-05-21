/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PertemuanKetiga;

import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author petik
 */
public class LatihanLabel {
    static Label l;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Frame f = new Frame("Latihan Label");
       f.setLayout(new GridLayout(4,2));
        Checkbox satu = new Checkbox ("satu", true);
        Checkbox dua = new Checkbox("Dua", true);
        Checkbox tiga = new Checkbox("Tiga", true);
        
        satu.addItemListener(new LatihanCheckBox.Handler());
        dua.addItemListener(new LatihanCheckBox.Handler());
        tiga.addItemListener(new LatihanCheckBox.Handler());
       
       l = new Label("latihan kuy");
       f.add(satu);
       f.add(dua);
       f.add(tiga);
       f.add(l);
       f.setSize(200, 200);
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
