/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.comparacion;
import java.util.Scanner;
/**
 *
 * @author emiag
 */
public class Comparacion {

    public static void main(String[] args) {
        //crea objeto scaner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);
        int numero1;
        int numero2;
        System.out.print("Escriba el primer numero entero");
        numero1=entrada.nextInt();
        System.out.print("Escriba el segundo numero entero");
        numero2=entrada.nextInt();
        if (numero1==numero2){
            System.out.printf("%d == %d\n", numero1, numero2);
        }
        if (numero1!=numero2){
            System.out.printf("%d != %d\n", numero1, numero2);
        }
        if (numero1<numero2){
            System.out.printf("%d < %d\n", numero1, numero2);
        }
        if (numero1>numero2){
            System.out.printf("%d > %d\n", numero1, numero2);
        }
        if (numero1<=numero2){
            System.out.printf("%d <= %d\n", numero1, numero2);
        }
        if (numero1>=numero2){
            System.out.printf("%d >= %d\n", numero1, numero2);
        }
        System.out.println("Hello World!");
    }
}
