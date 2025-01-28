package com.mycompany.gestorempleados;
public class GestorEmpleados {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Gestor gestor = new Gestor();
        gestor.crearEmpleado("gerente", "Pedro Sancho", 400000, 3);
        gestor.crearEmpleado("desarrollador", "Emi A", 300000, 2);
        gestor.crearEmpleado("diseniador", "Perez E", 250000, 100);
        gestor.mostrarEmpleados();
    }
}
