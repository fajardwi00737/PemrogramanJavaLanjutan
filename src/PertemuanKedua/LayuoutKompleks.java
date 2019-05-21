/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PertemuanKedua;
import java.awt.*;
/**
 *
 * @author petik
 */
public class LayuoutKompleks {
    private Frame f;
    private Panel p;
    private Button bw,bc;
    private Button bFile, bHelp;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LayuoutKompleks lk = new LayuoutKompleks();
        lk.tampil();
        
    }
    public void tampil(){
        
        //buat objek dari frame dan button
        f = new Frame ("aneka layout");
        bw = new Button("kiri");
        bc = new Button ("Area Kerja");
        
        //masukkan button ke dalam frame
        f.add(bw, BorderLayout.WEST);
        f.add(bc, BorderLayout.CENTER);
        
        //buat objek dari panel
        p = new Panel();
        
        //buat objek dari button
        bFile = new Button("File");
        bHelp = new Button("Help");
        
        //masukkan button ke dalam panel
        p.add(bFile);
        p.add(bHelp);
        //masukkan panel dalam frame
        f.add(p);
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
