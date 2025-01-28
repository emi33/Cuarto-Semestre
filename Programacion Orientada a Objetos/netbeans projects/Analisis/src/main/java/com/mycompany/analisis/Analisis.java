/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.analisis;
import java.util.Scanner;
/**
 *
 * @author emiag
 */
public class Analisis {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Hello World!");
        int aprobados=0;
        int reprobados=0;
        int contadorEstudiantes=1;
        int resultado;
        while(contadorEstudiantes<=10){
            System.out.print("Escriba el resultado (1=aprobado, 2=reprobado)");
            resultado=entrada.nextInt();
            if(resultado==1)
                aprobados=aprobados+1;
            else 
                reprobados=reprobados+1;
            
            contadorEstudiantes=contadorEstudiantes+1;
        }
        System.out.printf("Aprobados:" +aprobados+"\n Reprobados: "+reprobados);
        if(aprobados>8)
            System.out.println("Bono para el instructor");
    }
}
