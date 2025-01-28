/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasecomplementaria;

/**
 *
 * @author emiag
 */
public class LibroConstructor {

    private String libroConstructor;
    private String instructorConstructor;
    public LibroConstructor(String nombre, String nombreInstructor) {
        libroConstructor = nombre;
        instructorConstructor = nombreInstructor;
    }
    public void setNombreCurso(String nombre) {
        libroConstructor = nombre;
    }
    public void setNombreInstructor(String nombreInstructor) {
        instructorConstructor = nombreInstructor;
    }
    public String getNombreCurso()
    {
        return libroConstructor;
    }
    public String getNombreInstructor()
    {
        return instructorConstructor;
    }
    public void msj()
    {
        System.out.printf("Bienvenido curso:"+getNombreCurso()+"!\n instructor: %s"+ getNombreInstructor());
    }
}
