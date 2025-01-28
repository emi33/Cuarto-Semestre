/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arreglo;

import java.util.ArrayList;

/**
 *
 * @author emiag
 */
public class Inventario {
     private final ArrayList<Producto> productos;
    public Inventario(){
        productos= new ArrayList<>();
    }
    public void addProducto(Producto producto) {
        productos.add(producto);
    }
    public void deleteProducto(int codigo){
         for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getCodigo() == codigo){
                productos.remove(i);
                System.out.printf("Producto con codigo eliminado: \n"+ codigo);
                return; // Salir después de eliminar
            }
        }
        
    }
    public void actualizarCantidad(int codigo, int nuevaCantidad) {     
        for (int i=0;i<productos.size();i++){
            if (productos.get(i).getCodigo() == codigo){
               productos.get(i).setCantidad(nuevaCantidad);
               if (nuevaCantidad==0){
                   productos.remove(i);
               }
               break;
            }
            
        }
    }
     public void mostrarInventario() {
        for (Producto producto : productos) {
            producto.mostrarInformacion();
        }
    }
    /*public void mostrarInventario2() {
        for (int i = 0; i < productos.size(); i++) {
            productos.mostrarInformacion();
        }
    }*/
}
