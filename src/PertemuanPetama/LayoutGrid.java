/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PertemuanPetama;
import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;
/**
 *
 * @author petik
 */
public class LayoutGrid {

    private JFrame f;
    private JButton b1, b2, b3, b4, b5, b6;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LayoutGrid contohGrid = new  LayoutGrid();
        contohGrid.tampl();
    }

    public void tampl() {
        f = new JFrame("Grid Layout");
        f.setLayout(new GridLayout(2,2));
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        
        Border borderGaris1 = BorderFactory.createLineBorder(Color.yellow, 18);
        Border borderGaris2 = BorderFactory.createLineBorder(Color.red, 18);
        Border borderGaris3 = BorderFactory.createLineBorder(Color.BLUE, 18);
        Border borderGaris4 = BorderFactory.createLineBorder(Color.CYAN, 18);
        
        b1.setBackground(Color.BLACK);
        b2.setBackground(Color.BLACK);
        b3.setBackground(Color.BLACK);
        b4.setBackground(Color.BLACK);
        b1.setBorder(borderGaris1);
        b2.setBorder(borderGaris2);
        b3.setBorder(borderGaris3);
        b4.setBorder(borderGaris4);
        
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);

        f.setSize(500,500);
        f.setVisible(true);
    }
    
}
