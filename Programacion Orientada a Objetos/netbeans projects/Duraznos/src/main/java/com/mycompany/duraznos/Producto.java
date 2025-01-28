/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duraznos;

/**
 *
 * @author emiag
 */
public class Producto {
    int id;
    String tipo;
    double peso;
    double precio;
    public Producto(int id, String tipo, double peso, double precio){
        this.id=id;
        this.tipo=tipo;
        this.peso=peso;
        this.precio=precio;
    }
    public int getId(){
        return id;
    }
     public String getTipo(){
        return tipo;
    }
    public double getPeso(){
        return peso;
    }
    public double getPrecio(){
        return precio;
    }
    public void mostrarDetalles(){
        System.out.printf("\n ID: " +getId() +"\n Tipo: "+getTipo()+"\n Peso: "+getPeso()+"\n Ganancia TOTAL: "+getPrecio()+"\n");
    }
}
