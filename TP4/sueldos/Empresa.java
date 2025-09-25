package sueldos;
import java.util.ArrayList;
public class Empresa {
    private ArrayList <Empleado> empleados;
    private String nombre;
    
    public Empresa(String nombre){
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }
    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }
    public void empleados(){
        for(Empleado e : empleados){
          System.out.println("El empleado " + e.getNombre() + " cobra " +  e.calcularSueldo());
        }
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
