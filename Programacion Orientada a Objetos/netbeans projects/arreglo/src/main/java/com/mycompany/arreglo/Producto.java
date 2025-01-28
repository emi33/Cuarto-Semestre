/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arreglo;

/**
 *
 * @author emiag
 */
public class Producto {
     private String nombreProducto;
    private int codigoProducto;
    private int cantidadProducto;
    private double precioProducto;
    
    public Producto(String nombre, int codigo, int cantidad, double precio){
        nombreProducto = nombre;
        codigoProducto = codigo;
        cantidadProducto = cantidad;
        precioProducto = precio;
    }
    public void setNombre(String nombre){
        nombreProducto= nombre;
    }
    public String getNombre(){
        return nombreProducto;
    }
     public void setCodigo(int codigo){
        codigoProducto= codigo;
    }
    public int getCodigo(){
        return codigoProducto;
    }
     public void setCantidad(int cantidad){
        cantidadProducto= cantidad;
    }
    public int getCantidad(){
        return cantidadProducto;
    }
     public void setPrecio(double precio){
        precioProducto= precio;
    }
    public double getPrecio(){
        return precioProducto;
    }
    public void mostrarInformacion(){
        System.out.printf("Producto:" +getNombre() +"\nCodigo: "+getCodigo()+" \nCantidad: "+getCantidad()
                +" \n Precio: "+getPrecio()+"\n");
    }
}
