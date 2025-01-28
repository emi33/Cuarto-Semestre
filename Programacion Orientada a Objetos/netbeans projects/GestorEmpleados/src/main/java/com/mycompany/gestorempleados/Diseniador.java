
package com.mycompany.gestorempleados;

public class Diseniador implements Empleado{
    private final int BonoFijo = 15000;
    private String nombre;
    private int salario;
    private int creatividad;
    
    public Diseniador(String nombre, int salario, int creatividad){
        this.nombre = nombre;
        this.salario = salario;
        this.creatividad = creatividad;
    }
    public int getCreatividad(){
        return creatividad;
    }
    public int getSalario(){
        return salario;
    }
    public String getNombre(){
        return nombre;
    }
    @Override
    public double Bonificacion() {
        return getCreatividad()*100 + BonoFijo;
    } 
    @Override
    public void paraString() {
        System.out.println("\nDiseniador: " + getNombre() + "\nSalario: " +getSalario()+ "\nBono de fin de anio: "+ Bonificacion());
    }
}
