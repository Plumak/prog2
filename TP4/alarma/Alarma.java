package alarma;
import java.util.ArrayList;
public class Alarma {
    private boolean vidrioRoto;
    private boolean puertaAbierta;
    private boolean sensorMovimiento;
    private ArrayList <Sensor> sensores;
    public Alarma(boolean vidrioRoto, boolean puertaAbierta, boolean sensorMovimiento){
        this.vidrioRoto = vidrioRoto;
        this.puertaAbierta = puertaAbierta;
        this.sensorMovimiento = sensorMovimiento;
        this.sensores = new ArrayList<>();
    }
    public void agregarSensor(Sensor sensor){
        sensores.add(sensor);
    }
    public boolean isVidrioRoto() {
        return vidrioRoto;
    }

    public void setVidrioRoto(boolean vidrioRoto) {
        this.vidrioRoto = vidrioRoto;
    }

    public boolean isPuertaAbierta() {
        return puertaAbierta;
    }

    public void setPuertaAbierta(boolean puertaAbierta) {
        this.puertaAbierta = puertaAbierta;
    }

    public boolean isSensorMovimiento() {
        return sensorMovimiento;
    }

    public void setSensorMovimiento(boolean sensorMovimiento) {
        this.sensorMovimiento = sensorMovimiento;
    }

    public boolean comprobar() {
        boolean alarmaActivada = false;
        for (Sensor s : sensores) {
            if (s.isSensor_activado()) {
                timbre.hacerSonar();
                System.out.println("Alarma activada en la zona: " + s.getZona());
                alarmaActivada = true;
            }
        }

        return alarmaActivada; // true si al menos un sensor está activado
    }

}
