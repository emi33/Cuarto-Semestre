/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alumnosejercicio;

/**
 *
 * @author emiag
 */
public final class Alumno {
    private String matricula;
    private String nombre;
    private int edad;
    private String carrera;
    private double promedio;
    public Alumno(String matricula, String nombre, int edad, String carrera, double promedio){
        this.matricula=matricula;
        this.nombre=nombre;
        this.edad=edad;
        this.carrera=carrera;
        this.promedio=promedio;
    }
    public void setMatricula(String mat){
        this.matricula=mat;
    }
    public String getMatricula(){
        return matricula;
    }
    public void setNombre(String name){
        this.nombre=name;
    }
    public String getNombre(){
        return nombre;
    }
    public void setEdad(int age){
        this.edad=age;
    }
    public int getEdad(){
        return edad;
    }
    public void setCarrera(String carreer){
        this.carrera=carreer;
    }
    public String getCarrera(){
        return carrera;
    }
    public void setPromedio(double promedio){
        this.promedio=promedio;
    }
    public double getPromedio(){
        return promedio;
    }

    public void paraString(){
        System.out.printf("\n Alumno: "+getNombre()+"\n    matricula: "+ getMatricula()+"\n    carrera: " + getCarrera() + "\n    edad: " + getEdad() +"\n    promedio: " + getPromedio());
    }
}
