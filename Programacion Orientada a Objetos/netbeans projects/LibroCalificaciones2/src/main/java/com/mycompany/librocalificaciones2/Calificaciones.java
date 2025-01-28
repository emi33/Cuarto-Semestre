package com.mycompany.librocalificaciones2;
import java.util.Scanner;

public class Calificaciones {
    private String nombreDelCurso;
    //el constructor inicializa el nombre del curso
    public Calificaciones(String nombre){
        nombreDelCurso=nombre;
    }
    //metodo para establecer el nombre del curso
    public void establecerNombreDelCurso(String nombre){
        nombreDelCurso=nombre;
    }
    public String obtenerNombreDelCurso(){
        return nombreDelCurso;
    }
    public void mostrarMensaje(){
        System.out.printf("Bienvenido al libro de calificiones para "+ obtenerNombreDelCurso());
    }
    public void determinarPromedioClase(){
        Scanner entrada = new Scanner(System.in);
        int total;
        int contadorCalif;
        int calificacion;
        double promedio;
        total=0;
        contadorCalif=0;
        System.out.print("escriba calificacion o -1 para terminar: ");
        calificacion=entrada.nextInt();
        while(calificacion != -1){
            total=total + calificacion;
            contadorCalif=contadorCalif+1;
            System.out.print("Escriba la calificacion o -1 para terminar");
            calificacion=entrada.nextInt();
        }
        if (contadorCalif!=0){
            promedio = (double) total / contadorCalif;
            System.out.printf("\nEl total de las" + contadorCalif+ "calificaciones es " + total);
            System.out.printf("El promedio de la clase es "+ promedio);
        }
        else{
            System.out.println("No se introdujeron calificiaiones");
        }
    }
}