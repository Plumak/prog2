package fabrica_muebles;
import java.util.ArrayList;

public class Fabrica {
    private String nombre_fabrica;
    private ArrayList <Mueble> mueble;
   public Fabrica(String nombre_fabrica) {
        this.nombre_fabrica = nombre_fabrica;
        this.mueble = new ArrayList<>(); // inicializamos el ArrayList
    }
public String getNombre_fabrica() {
        return nombre_fabrica;
    }
    public void setNombre_fabrica(String nombre_fabrica) {
        this.nombre_fabrica = nombre_fabrica;
    }
    public ArrayList<Mueble> getMueble() {
        return mueble;
    }
    public void setMueble(ArrayList<Mueble> mueble) {
        this.mueble = mueble;
    }

public int stock_disponible(){
    return this.mueble.size();
}
public double calcular_precio() {
        double total = 0;
        for (Mueble m : mueble) {
            total += m.valor_venta(); // usamos el getter de Mueble
        }
        return total;
    }
}