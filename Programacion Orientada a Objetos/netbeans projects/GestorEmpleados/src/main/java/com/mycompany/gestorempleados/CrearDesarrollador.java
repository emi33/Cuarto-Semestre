
package com.mycompany.gestorempleados;

public class CrearDesarrollador extends CreadorEmpleados{

     @Override
    public Empleado crearEmpleado(String nombre, int salario, int adicional) {
        return new Desarrollador(nombre, salario, adicional);
    }

    
}
