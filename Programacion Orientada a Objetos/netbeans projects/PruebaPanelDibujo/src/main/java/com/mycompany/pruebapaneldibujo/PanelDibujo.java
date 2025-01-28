/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebapaneldibujo;
import java.awt.Graphics;
import javax.swing.JPanel;
/**
 *
 * @author emiag
 */
public class PanelDibujo extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int anchura=getWidth();
        int altura=getHeight();
        g.drawLine(0, 0,anchura, altura);
        g.drawLine(0, altura, anchura, 0);
    }
            
}
