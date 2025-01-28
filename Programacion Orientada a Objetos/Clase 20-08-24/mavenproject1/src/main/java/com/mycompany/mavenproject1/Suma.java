/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author emiag
 */
public class Suma {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner entrada = new Scanner(System.in);
        int numero1;
        int numero2;
        int suma;
        System.out.print("Escriba el primer entero: ");
        numero1 = entrada.nextInt();
        System.out.print("Escriba el primer entero: ");
        numero2 = entrada.nextInt();
        suma=numero1+numero2;
        System.out.printf("La suma es %d\n", suma); //muestra la suma
    }
}
