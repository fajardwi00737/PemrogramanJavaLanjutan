/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PertemuanPetama;

import java.awt.*;

/**
 *
 * @author petik
 */
public class LayoutBorder {

    private Frame f;
    private Button bn,bs,bw,be,bc;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LayoutBorder contohBorder = new LayoutBorder();
        contohBorder.tampil();
    }

    private void tampil() {
        f = new Frame("Border Layout");
        bn = new Button("B1");
        bs = new Button("B2");
        bw = new Button("B3");
        be = new Button("B4");
        bc = new Button("B5");
        bn.setBackground(Color.red);
        bs.setBackground(Color.yellow);
        bw.setBackground(Color.blue);
        be.setBackground(Color.green);
        bc.setBackground(Color.black);
        f.add(bn, BorderLayout.NORTH);
        f.add(bs, BorderLayout.SOUTH);
        f.add(bw, BorderLayout.WEST);
        f.add(be, BorderLayout.EAST);
        f.add(bc, BorderLayout.CENTER);
        f.setSize(250,250);
        
        f.setVisible(true);
    }
}
