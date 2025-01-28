/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arreglo;

/**
 *
 * @author emiag
 */
public class Arreglo {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Inventario miInventario = new Inventario();

        miInventario.addProducto(new Producto("Manzanas", 101, 5, 0.5));
        miInventario.addProducto(new Producto("Naranjas", 102, 30, 0.75));
        miInventario.addProducto(new Producto("Peras", 103, 20, 0.6));

        System.out.println("    Inventario inicial:");
        miInventario.mostrarInventario();
        
        System.out.println("    Ejemplo eliminar Manzanas 101:");
        miInventario.deleteProducto(101);
        miInventario.mostrarInventario();
        
        System.out.println("    Ejemplo actualizar Peras a Cantidad 0:");
        miInventario.actualizarCantidad(103, 0);
        miInventario.mostrarInventario();
    }
}
