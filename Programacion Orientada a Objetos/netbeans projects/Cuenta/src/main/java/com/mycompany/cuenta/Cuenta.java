/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cuenta;
import java.util.Scanner;
/**
 *
 * @author emiag
 */
public class Cuenta {

    public static void main(String[] args) {
        claseCuenta cuenta1= new claseCuenta(50.00);
        claseCuenta cuenta2= new claseCuenta(-5.02);
        System.out.printf("Saldo cuenta 1: $%.2f\n", cuenta1.obtenerSaldo());
        System.out.printf("Saldo cuenta 2: $%.2f\n", cuenta2.obtenerSaldo());

        System.out.println("Hello World!");
        Scanner entrada= new Scanner (System.in);
        double montoDeposito;
        System.out.print("Monto para cuenta1: ");
        montoDeposito = entrada.nextDouble();
        System.out.printf("\nsumando %.2f al saldo de cuenta1 \n\n", montoDeposito);
        cuenta1.abonar(montoDeposito);
        
        System.out.printf("Saldo de cuenta1: $%.2f\n", cuenta1.obtenerSaldo());
        System.out.printf("Saldo de cuenta2: $%.2f\n", cuenta2.obtenerSaldo());
        
        System.out.print("ESCRIBA el monto a depositar cuenta2: ");
        montoDeposito=entrada.nextDouble();
        System.out.printf("\n sumando %.2f al saldo de cuenta2\n\n", montoDeposito);
        cuenta2.abonar(montoDeposito);
        
        System.out.printf("Saldo de cuenta1: $%.2f\n", cuenta1.obtenerSaldo());
        System.out.printf("Saldo de cuenta2: $%.2f\n", cuenta2.obtenerSaldo());
        
        
        
    }
}
