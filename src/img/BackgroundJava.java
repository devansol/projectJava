/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package img;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Daus
 */
public class BackgroundJava extends JPanel{
    private Image image;
    
    public BackgroundJava() {
        image = new ImageIcon(getClass().getResource("/img/logo-wuri-handayani-6.png")).getImage();
    }
    
    @Override
    public void paint(Graphics graph){
        super.paintComponent(graph);
        
        Graphics2D gd = (Graphics2D) graph.create();
        gd.drawImage(image, 0, 0,getWidth(),getHeight(),null);
        gd.dispose();
    }
}
