package alarma;

public class AlarmaLuminosa extends Alarma {
    private Luz luz = new Luz();

    // Constructor: como Alarma tiene constructor con parámetros,
    // acá usamos super(...) para llamarlo
    public AlarmaLuminosa(boolean vidrioRoto, boolean puertaAbierta, boolean sensorMovimiento,boolean luz) {
        super(vidrioRoto, puertaAbierta, sensorMovimiento);
        this.luz = luz;
    }
    public boolean isLuz() {
        return luz;
    }

    public void setLuz(boolean luz) {
        this.luz = luz;
    }

    // Sobrescribimos el método comprobar
   @Override
public boolean comprobar() {
    if (super.comprobar()) {  // si la alarma base se activó
        luz.encender();
        return true;
    }
    else{
        return false;
    }
}

}
