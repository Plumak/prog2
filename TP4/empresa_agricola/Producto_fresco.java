package empresa_agricola;
import java.time.LocalDate;
public class Producto_fresco extends Producto {
    private String granja_origen;
public Producto_fresco(LocalDate fecha_envasado, String granja_origen, LocalDate fecha_vencimiento, int nro_lote){
    super(fecha_vencimiento, nro_lote, fecha_envasado);
    this.granja_origen = granja_origen;
}
public String getGranja_origen() {
    return granja_origen;
}
public void setGranja_origen(String granja_origen) {
    this.granja_origen = granja_origen;
}
@Override
public String getEtiqueta() {
        // Se llama primero al getEtiqueta de Producto para la parte común
        return super.getEtiqueta() +
               " | Granja: " + granja_origen;
    }
}
