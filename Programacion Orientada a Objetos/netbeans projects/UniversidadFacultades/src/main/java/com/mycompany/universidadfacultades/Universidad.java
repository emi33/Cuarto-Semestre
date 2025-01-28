/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.universidadfacultades;

/**
 *
 * @author emiag
 */
public abstract class Universidad {
    protected String nombre;
    protected String direccion;
    protected int fundacion;
int totalAlumnos;
    public Universidad(String nombre, String direccion, int fundacion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.fundacion = fundacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getFundacion() {
        return fundacion;
    }

    @Override
    public String toString() {
        return "Universidad{" + "nombre=" + nombre + ", direccion=" + direccion + ", fundacion=" + fundacion + '}';
    }

    
}
