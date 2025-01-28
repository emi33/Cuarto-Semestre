/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universidadfacultades;

/**
 *
 * @author emiag
 */
public class FacultadCiencias extends Facultad{

    public FacultadCiencias(String nombreFacultad, String direccionFacultad, int creacion, int cantidadAlumnos, String nombre, String direccion, int fundacion) {
        super(nombreFacultad, direccionFacultad, creacion, cantidadAlumnos, nombre, direccion, fundacion);
    }

    public int getCantidadAlumnos() {
        return cantidadAlumnos;
    }

    public void setCantidadAlumnos(int cantidadAlumnos) {
        this.cantidadAlumnos = cantidadAlumnos;
    }


    

    
}
