/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PertemuanKeempat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.plaf.TabbedPaneUI;

/**
 *
 * @author petik
 */
public class ContohTabbedPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //membuat frame
        JFrame f = new JFrame("Menggunakan Tabbed Pane");
        
        //membuat tabbe pane
        JPanel panel1 = new JPanel();
        JTabbedPane tabPane = new JTabbedPane();
        
        //parameter 1 = title
        //parameter 2 = icon
        //parameter 3 = component
        //parameter 4 = tip
        tabPane.addTab("First", null, panel1, "Official Info");
        
        //menambahkan button ke tab pada tabbed pane
        JButton button1 = new JButton("Panel Pertama");
        panel1.add(button1);
        
        JPanel panel2 = new JPanel();
        tabPane.addTab("Second", null, panel2, "Secondary Info");
        
        //menambahkan button 2 ke tab pad tabbded pane
        JButton button2 = new JButton("Panel Kedua");
        panel2.add(button2);
        
        f.getContentPane().add(tabPane);
        f.show();
        f.setSize(200, 200);
    }
}
