
package com.mycompany.gestorempleados;

public class CrearDiseniador extends CreadorEmpleados{

    @Override
    public Empleado crearEmpleado(String nombre, int salario, int adicional) {
        return new Diseniador(nombre, salario, adicional);
    }
    
}
