package sistema_encuestas;
import java.util.ArrayList;

public class Compania{
    private ArrayList<Encuesta> encuesta;
    private ArrayList<Empleado> empleado;
    public Compania(){
     this.encuesta = new ArrayList<>();
     this.empleado = new ArrayList<>();   
    }
    public void agregarEncuesta(Encuesta nuevaEncuesta){
        Encuesta.add(nuevaEncuesta); 
    }
    public void encontrarEncuestas(String dni_empleado, Encuesta nuevaEncuesta){
        for (Encuesta e : encuesta) {
            if (e.getDni_empleado().equals(dni_empleado)){
               encuesta.getDni_empleado().agregarEncuesta(e);
            }
        }
    }
}