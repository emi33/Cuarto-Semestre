/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.librocalificaciones2;

/**
 *
 * @author emiag
 */
public class LibroCalificaciones2 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Calificaciones calificaciones= new Calificaciones("Grupo B");
        calificaciones.mostrarMensaje();
        calificaciones.determinarPromedioClase();
    }
}
