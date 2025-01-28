
package com.mycompany.gestorempleados;

public class Desarrollador implements Empleado{
    private final int BonoFijo = 20000;
    private String nombre;
    private int salario;
    private int proyectos;
    
    public Desarrollador(String nombre, int salario, int proyectos){
        this.nombre = nombre;
        this.salario = salario;
        this.proyectos = proyectos;
    }
    public int getProyectos(){
        return proyectos;
    }
    public int getSalario(){
        return salario;
    }
    public String getNombre(){
        return nombre;
    }
    @Override
    public double Bonificacion() {
        return BonoFijo + getSalario()*0.25*getProyectos();
    }

    @Override
    public void paraString() {
        System.out.println("\nDesarrollador: " + getNombre() + "\nSalario: " +getSalario()+ "\nBono de fin de anio: "+ Bonificacion());
    }
    
}
