/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duraznos;

public final class Durazno {
    int id;
    double peso;
    String tamanio;
    String calidad;
    double costo;
    public Durazno(int id, double peso, String tamanio, String calidad){
        this.id=id;
        this.peso=peso;
        this.tamanio=tamanio;
        this.calidad=calidad;
        this.costo=calcularCosto();
    }
    public int getId(){
        return id;
    }
    public double getPeso(){
        return peso;
    }
    public String getTamanio(){
        return tamanio;
    }
    public String calidad(){
        return calidad;
    }
    public double getCosto(){
        return costo;
    }
    public double calcularCosto(){
        switch (calidad){
                case "A" -> {
                    costo = peso*1800/1000;
                    return costo;
            }
                case "B" -> {
                    costo = peso*1600/1000;
                    return costo;
            } 
                case "C" -> {
                    costo = peso*1400/1000;
                    return costo;
            }
                default -> {
                    return 0;
            }
        }
    }
}
