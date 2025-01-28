/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pruebapaneldibujo;
import javax.swing.JFrame;
/**
 *
 * @author emiag
 */
public class PruebaPanelDibujo {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        // crea un panel que contiene nuestro dibujo
        PanelDibujo panel = new PanelDibujo();
        // crea un nuevo marco para contener el panel
        JFrame aplicacion= new JFrame();
        // esstablece el marco para salir cuando se cierre
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel);
        aplicacion.setSize(250,250);
        aplicacion.setVisible(true);//visible
    }
}
