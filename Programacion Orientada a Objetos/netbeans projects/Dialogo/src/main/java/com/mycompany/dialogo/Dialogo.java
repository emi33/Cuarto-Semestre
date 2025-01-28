/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dialogo;
import javax.swing.JOptionPane;
/**
 *
 * @author emiag
 */
public class Dialogo {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        JOptionPane.showMessageDialog(null, "Bienvenido\na\nJava");
        String nombre = JOptionPane.showInputDialog("Cual es su nombre?");
        
        String mensaje = String.format("Bienvenido, %s, a la programacion en Java!", nombre);
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
