
package com.mycompany.gestorempleados;

import java.util.ArrayList;
import java.util.List;

public final class Gestor {
    private List<Empleado> empleados;
    public Gestor(){
        empleados=new ArrayList<>();
    }
    public void addEmpleado(Empleado empleado){
        empleados.add(empleado);
    }
    public void mostrarEmpleados(){
        for (Empleado empleado: empleados){
            empleado.paraString();
        }
    }
    private CreadorEmpleados creadorEmpleados;
    private boolean flag=true;
    public void crearEmpleado(String posicion, String nombre, int salario, int adicional){
        switch (posicion) {
            case "gerente" -> creadorEmpleados = new CrearDesarrollador();
            case "desarrollador" -> creadorEmpleados = new CrearDiseniador();
            case "diseniador" -> creadorEmpleados = new CrearGerente();
            default -> flag=false;
        }
        if (flag==true) {
            Empleado empleado = creadorEmpleados.crearEmpleado(nombre, salario, adicional);
            addEmpleado(empleado);
        }
      
    }

    Gestor(String gerente, String pedro_Sancho, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
