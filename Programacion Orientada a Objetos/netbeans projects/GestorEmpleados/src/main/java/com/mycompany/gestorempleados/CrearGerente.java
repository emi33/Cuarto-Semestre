
package com.mycompany.gestorempleados;

public class CrearGerente extends CreadorEmpleados{

    @Override
    public Empleado crearEmpleado(String nombre, int salario, int adicional) {
        return new Gerente(nombre, salario, adicional);    
    }
    
}
