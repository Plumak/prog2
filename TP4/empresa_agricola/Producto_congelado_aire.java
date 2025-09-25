package empresa_agricola;

import java.time.LocalDate;

public class Producto_congelado_aire extends Producto_congelado{
    private double porcentaje_nitrogeno;
    private double porcentaje_oxigeno;
    private double porcentaje_co2;
    private double porcentaje_vapor_h2o;
    public Producto_congelado_aire(LocalDate fecha_envasado, String granja_origen, LocalDate fecha_vencimiento,
            int nro_lote, String codigo_organismo, double temperatura_reco, double porcentaje_nitrogeno,
            double porcentaje_oxigeno, double porcentaje_co2, double porcentaje_vapor_h2o) {
        super(fecha_envasado, granja_origen, fecha_vencimiento, nro_lote, codigo_organismo, temperatura_reco);
        this.porcentaje_nitrogeno = porcentaje_nitrogeno;
        this.porcentaje_oxigeno = porcentaje_oxigeno;
        this.porcentaje_co2 = porcentaje_co2;
        this.porcentaje_vapor_h2o = porcentaje_vapor_h2o;
    }
    public double getPorcentaje_nitrogeno() {
        return porcentaje_nitrogeno;
    }
    public void setPorcentaje_nitrogeno(double porcentaje_nitrogeno) {
        this.porcentaje_nitrogeno = porcentaje_nitrogeno;
    }
    public double getPorcentaje_oxigeno() {
        return porcentaje_oxigeno;
    }
    public void setPorcentaje_oxigeno(double porcentaje_oxigeno) {
        this.porcentaje_oxigeno = porcentaje_oxigeno;
    }
    public double getPorcentaje_co2() {
        return porcentaje_co2;
    }
    public void setPorcentaje_co2(double porcentaje_co2) {
        this.porcentaje_co2 = porcentaje_co2;
    }
    public double getPorcentaje_vapor_h2o() {
        return porcentaje_vapor_h2o;
    }
    public void setPorcentaje_vapor_h2o(double porcentaje_vapor_h2o) {
        this.porcentaje_vapor_h2o = porcentaje_vapor_h2o;
    }
    
}
