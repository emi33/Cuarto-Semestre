/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universidadfacultades;

/**
 *
 * @author emiag
 */
public abstract class Facultad extends Universidad{
    protected String nombreFacultad;
    protected int cantidadAlumnos;
    int total;

    public Facultad(String nombreFacultad, String direccionFacultad, int creacion, int cantidadAlumnos, String nombre, String direccion, int fundacion) {
        super(nombre, direccion, fundacion);
        this.nombreFacultad = nombreFacultad;
        this.cantidadAlumnos = cantidadAlumnos;
        this.total = total();
    }
    
    public int getCantidadAlumnos() {
        return cantidadAlumnos;
    }

    public void setCantidadAlumnos(int cantidadAlumnos) {
        this.cantidadAlumnos = cantidadAlumnos;
    }
    public int total(){
        total=+cantidadAlumnos;
        return total;
    }

    @Override
    public String toString() {
        return "Facultad{" + "nombreFacultad=" + nombreFacultad + ", cantidadAlumnos=" + cantidadAlumnos + '}';
    }
}
