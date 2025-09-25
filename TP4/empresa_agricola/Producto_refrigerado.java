package empresa_agricola;

import java.time.LocalDate;

public class Producto_refrigerado extends Producto {
    private String codigo_organismo;
    private String granja_origen;
    private double temperatura_reco;

    public Producto_refrigerado(LocalDate fecha_envasado, String granja_origen, LocalDate fecha_vencimiento,
            int nro_lote, String codigo_organismo, double temperatura_reco) {
        super(fecha_vencimiento, nro_lote, fecha_envasado);
        this.codigo_organismo = codigo_organismo;
        this.granja_origen = granja_origen;
        this.temperatura_reco = temperatura_reco;
    }

    public String getCodigo_organismo() {
        return codigo_organismo;
    }

    public void setCodigo_organismo(String codigo_organismo) {
        this.codigo_organismo = codigo_organismo;
    }

    public String getGranja_origen() {
        return granja_origen;
    }

    public void setGranja_origen(String granja_origen) {
        this.granja_origen = granja_origen;
    }

    public double getTemperaturaReco() {
        return temperatura_reco;
    }

    public void setTemperaturaReco(double temperatura_reco) {
        this.temperatura_reco = temperatura_reco;
    }
    @Override
      public String getEtiqueta() {
        return super.getEtiqueta() +
               " | Código organismo: " + codigo_organismo +
               " | Temperatura: " + temperatura_reco +
               " | Granja: " + granja_origen;
    }
}