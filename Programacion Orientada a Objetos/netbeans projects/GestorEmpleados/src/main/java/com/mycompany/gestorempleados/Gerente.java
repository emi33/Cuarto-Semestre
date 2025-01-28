
package com.mycompany.gestorempleados;

public class Gerente implements Empleado{
    private final int BonoFijo = 30000;
    private String nombre;
    private int salario;
    private int equipos;
    
    public Gerente(String nombre, int salario, int equipos){
        this.nombre = nombre;
        this.salario = salario;
        this.equipos = equipos;
    }
    public int getEquipos(){
        return equipos;
    }
    public int getSalario(){
        return salario;
    }
    public String getNombre(){
        return nombre;
    }
    @Override
    public double Bonificacion() {
        return getEquipos()*BonoFijo + getSalario()*0.3;
    } 

    @Override
    public void paraString() {
        System.out.println("\nGerente: " + getNombre() + "\nSalario: " +getSalario()+ "\nBono de fin de anio: "+ Bonificacion());
    }
}
