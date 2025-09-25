package sueldos;

public class EmpleadoHorasExtra extends Empleado {
    private int cant_horas;
    private int precio_hora;
    private int sueldo_fijo;
    public EmpleadoHorasExtra(String nombre, String apellido, String dni, int sueldoFijo, int cant_horas, int precio_hora, int sueldo_fijo){
    super(nombre,apellido,dni, sueldo_fijo);
    this.cant_horas = cant_horas;
    this.precio_hora = precio_hora;
    }
    public int calcularSueldo(){
        return sueldo_fijo + cant_horas * precio_hora;
    }
}
