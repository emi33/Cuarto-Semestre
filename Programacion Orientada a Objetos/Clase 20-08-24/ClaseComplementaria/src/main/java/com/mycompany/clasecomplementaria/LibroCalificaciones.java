/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasecomplementaria;
import java.util.Scanner;

/**
 *
 * @author emiag
 */
public class LibroCalificaciones {
    private String nombreDelCurso;
    public void establecerNombreDelCurso( String nombre){
        nombreDelCurso=nombre;
         }
    public String obtenerNombreDelCurso(){
        return nombreDelCurso;
    }
    public void mostrarMensaje(){
        System.out.printf("Bienvenido al libro de calificaciones para \n&s!\n"+ obtenerNombreDelCurso());
    }
    public void notadeAlumno1()
    {
        int nota1;
        int nota2;
        int nota3;
        int nota4;
        float promedio;
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese las nota 1: ");
        nota1=entrada.nextInt();
        System.out.print("ingrese las nota 2: ");
        nota2=entrada.nextInt();
        System.out.print("ingrese las nota 3: ");
        nota3=entrada.nextInt();
        System.out.print("ingrese las nota 4: ");
        nota4=entrada.nextInt();
        promedio= (nota1+nota2+nota3+nota4)/4;
        System.out.printf("el promedio es %.2f", promedio);
    }
}
