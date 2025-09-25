package sistema_encuestas;
import java.util.ArrayList;
public class Encuesta {
    private ArrayList <Pregunta> Preguntas;
    private String id;
    private String dni_persona;
    private String dni_empleado;
    private boolean respondida;
    public Encuesta(String id, String dni_persona, String dni_empleado, boolean respondida){
        this.id = id;
        this.dni_persona = dni_persona;
        this.dni_empleado = dni_empleado;
        this.respondida = respondida;
        this.Preguntas = new ArrayList<>();
    }
    public String getId() {
        return id;
    }
    public String getDni_persona() {
        return dni_persona;
    }
    public String getDni_empleado() {
        return dni_empleado;
    }
    public boolean getRespondida() {
        return respondida;
    }
}