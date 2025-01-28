/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alumnosejercicio;

import java.util.ArrayList;

/**
 *
 * @author emiag
 */
public class GestionAlumnos {

    private final ArrayList<Alumno> alumnos;

    public GestionAlumnos() {
        alumnos = new ArrayList<>();
    }

    public void addAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public void mostrarAlumnos() {
        for (Alumno alumnitos : alumnos) {
            alumnitos.paraString();
        }
    }

    public void deleteAlumno(String cod) {
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getMatricula().equals(cod)) {
                alumnos.remove(i);
                System.out.printf("\nAlumno con matricula eliminado: \n" + cod);
                return; // Salir después de eliminar
            }
        }
    }

    public int findAlumn(String cod) {
        int ide = 0;
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getMatricula().equals(cod)) {
               
                System.out.printf("\n Alumno encontrado: \n");
                alumnos.get(i).paraString();
                ide = i;
                break;
            }
        }
        return ide;
    }

    public void modifyName(String cod, String nuevoNombre) {
        int mat = findAlumn(cod);
        alumnos.get(mat).setNombre(nuevoNombre);
    }

    public void modifyAge(String cod, int nuevaEdad) {
        int mat = findAlumn(cod);
        alumnos.get(mat).setEdad(nuevaEdad);
    }

    public void modifyCarreer(String cod, String nuevaCarrera) {
        int mat = findAlumn(cod);
        alumnos.get(mat).setCarrera(nuevaCarrera);
    }

    public void modifyAvg(String cod, double nuevoPromedio) {
        int mat = findAlumn(cod);
        alumnos.get(mat).setPromedio(nuevoPromedio);
    }
}
