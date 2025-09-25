package sueldos;

public class EmpleadoComision extends Empleado{
    private int cant_ventas;
    private int comision;
    public EmpleadoComision(String nombre, String apellido, String dni, int sueldo_fijo, int cant_horas_extra, int cant_ventas, int comision){
    super(nombre,apellido,dni, sueldo_fijo);
    this.cant_ventas = cant_ventas;
    this.comision =  comision;
    }
    public int getCant_ventas() {
        return cant_ventas;
    }
    public void setCant_ventas(int cant_ventas) {
        this.cant_ventas = cant_ventas;
    }
    public int getComision() {
        return comision;
    }
    public void setComision(int comision) {
        this.comision = comision;
    }
    public int calcularSueldo(){
        int porcentaje = comision / 100; 
        return getSueldo_fijo() + cant_ventas * porcentaje;
    }
}
