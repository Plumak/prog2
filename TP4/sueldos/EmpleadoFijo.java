package sueldos;

public class EmpleadoFijo extends Empleado {

    public EmpleadoFijo(String nombre, String apellido, String dni, int sueldo_fijo) {
        super(nombre, apellido, dni, sueldo_fijo);
    }
    public int calcularSueldo() {
        return getSueldo_fijo();
    }

}
