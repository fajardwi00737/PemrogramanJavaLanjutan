/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PertemuanKedua;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author petik
 */
public class ContohEvent implements MouseMotionListener, MouseListener{
    private Frame f;
    private TextField tf;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContohEvent eve = new ContohEvent();
        eve.tampil();
    }

    public void tampil() {
      //buat objek frame
      f = new Frame("Contoh Penggunaan Event");
      
      //tambahkan label Click and Drag Mouse di bagian atas
      f.add(new Label("Click and Drag Mouse"),BorderLayout.NORTH);
      
      //buat object textfield
      tf = new TextField(30);
      
      //masukan text field jedakan frame bagian bawah
      f.add(tf, BorderLayout.SOUTH);
      
      //tambahkan mouseMotionListener
      f.addMouseMotionListener(this);
      
      //tambahkan mouseListener
      f.addMouseListener(this);
      
      f.setSize(300, 300);
      f.setVisible(true);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
      String s = "Mouse digerakkan ke posisi X : "+e.getX()+" dan Y : "+e.getY();
      tf.setText(s);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
       
    }

    @Override
    public void mousePressed(MouseEvent e) {
       
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       String s = "Mouse telah memasuki ruangan ini";
        tf.setText(s);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        String s = "Mouse telah meninggalkan ruangan ini";
        tf.setText(s);
    }
    
}
