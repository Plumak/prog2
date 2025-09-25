package registro_empresa;

import java.util.ArrayList;

public class Manager extends Empleado {
    private ArrayList<Empleado> empleados_a_cargo;
    public Manager(String nombre, String apellido, int edad, String nro_legajo, int sueldo, String cargo) {
        super(nombre, apellido, edad, nro_legajo, sueldo, cargo);
        this.empleados_a_cargo = new ArrayList<>();
    }
public void addEmpleado(Empleado nuevo_empleado){
    empleados_a_cargo.add(nuevo_empleado);
}
public String toString(){
    return super.toString();
    }
}
