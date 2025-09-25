package empresa_agricola;

import java.time.LocalDate;

public class Producto_congelado_nitrogeno extends Producto_congelado{
    private String info_congelamiento;
    private double seg_exposicion;
    public Producto_congelado_nitrogeno(LocalDate fecha_envasado, String granja_origen, LocalDate fecha_vencimiento,
            int nro_lote, String codigo_organismo, double temperatura_reco, String info_congelamiento,
            double seg_exposicion) {
        super(fecha_envasado, granja_origen, fecha_vencimiento, nro_lote, codigo_organismo, temperatura_reco);
        this.info_congelamiento = info_congelamiento;
        this.seg_exposicion = seg_exposicion;
    }
    public String getInfo_congelamiento() {
        return info_congelamiento;
    }
    public void setInfo_congelamiento(String info_congelamiento) {
        this.info_congelamiento = info_congelamiento;
    }
    public double getSeg_exposicion() {
        return seg_exposicion;
    }
    public void setSeg_exposicion(double seg_exposicion) {
        this.seg_exposicion = seg_exposicion;
    }
}
