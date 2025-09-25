package alarma;

public class Sensor {
    private String zona;
    private boolean sensor_activado;

    public Sensor(String zona) {
        this.zona = zona;
        this.sensor_activado = false;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public boolean isSensor_activado() {
        return sensor_activado;
    }

    public void setSensor_activado(boolean sensor_activado) {
        this.sensor_activado = sensor_activado;
    }
    
}