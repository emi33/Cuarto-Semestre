/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.alumnosejercicio;

/**
 *
 * @author emiag
 */
public class AlumnosEjercicio {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        GestionAlumnos gestionAlumnos= new GestionAlumnos();
        gestionAlumnos.addAlumno(new Alumno("12050","Emiliano Choque",25, "Tecnicatura Universitaria en Desarrollo de Software", 9.02));
        gestionAlumnos.addAlumno(new Alumno("13000","Maria Choque",25, "Tecnicatura Universitaria en Desarrollo de Software", 9.32));
        gestionAlumnos.mostrarAlumnos();
        gestionAlumnos.findAlumn("12050");
        gestionAlumnos.modifyName("12050", "Emiliano Agustin Choque");
        gestionAlumnos.modifyAge("13000", 26);
        gestionAlumnos.modifyCarreer("13000", "Seguridad Privada");
        gestionAlumnos.mostrarAlumnos();
        gestionAlumnos.deleteAlumno("13000");

    }
}
