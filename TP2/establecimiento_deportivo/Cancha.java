package establecimiento_deportivo;

public class Cancha {
    private String tipo_cancha;
    private int precio;
    private int padel = 100;
    private int futbol = 400;
    
    public Cancha(String tipo_cancha, int precio) {
        this.tipo_cancha = tipo_cancha;
        this.precio = precio_cancha(tipo_cancha);
    }

    public int precio_cancha(String tipo_cancha) {
        if (tipo_cancha.equalsIgnoreCase("futbol")) {
            return futbol;
        } else if (tipo_cancha.equalsIgnoreCase("padel")) {
            return padel;
        } else {
            return -1;
        }
    }

    public String getTipo_cancha() {
        return tipo_cancha;
    }

    public void setTipo_cancha(String tipo_cancha) {
        this.tipo_cancha = tipo_cancha;
    }
     public int getPrecio(){
        return precio; 
    }
}
