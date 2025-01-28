/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clasecomplementaria;

import java.util.Scanner;

/**
 *
 * @author emiag
 */
public class ClaseComplementaria {
      
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner entrada = new Scanner(System.in);
        //creaa un objeto librocalificaciones y lo asigna a milibrocallificacions
        LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones();
        //pide y recibe el nombre del curso como entrada
        System.out.println("Escriba el nombre del curso: ");
        String nombreDelCurso= entrada.nextLine();
        System.out.println();
        //llama al metodo mostrarmensaje de milibrocalificaiciones 
        //y pasa nombredelcurso como argumento
        miLibroCalificaciones.establecerNombreDelCurso(nombreDelCurso);
        System.out.println();
        miLibroCalificaciones.mostrarMensaje();
        miLibroCalificaciones.notadeAlumno1();
        
        LibroConstructor miLibroConstructor = new LibroConstructor("CS01 Programacion en Java", "Sue Green");
        miLibroConstructor.msj();
    }
}