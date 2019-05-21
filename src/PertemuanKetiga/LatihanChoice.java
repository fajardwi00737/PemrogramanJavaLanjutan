/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PertemuanKetiga;

import java.awt.Choice;
import java.awt.Frame;

/**
 *
 * @author petik
 */
public class LatihanChoice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Frame f = new Frame("Latihan Choice");
        Choice c = new Choice();
        
        c.add("satu");
        c.add("dua");
        c.add("tiga");
        
        f.add(c);
        f.setSize(300, 300);
        f.setVisible(true);
    } 
}
