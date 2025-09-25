package empresa_agricola;
import java.time.LocalDate;

public class Producto {
    private LocalDate fecha_vencimiento;
    private int nro_lote;
    private LocalDate fecha_envasado;
    public Producto(LocalDate fecha_vencimiento, int nro_lote, LocalDate fecha_envasado) {
        this.fecha_vencimiento = fecha_vencimiento;
        this.nro_lote = nro_lote;
        this.fecha_envasado = fecha_envasado;
    }
    public LocalDate getFecha_vencimiento() {
        return fecha_vencimiento;
    }
    public void setFecha_vencimiento(LocalDate fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }
    public int getNro_lote() {
        return nro_lote;
    }
    public void setNro_lote(int nro_lote) {
        this.nro_lote = nro_lote;
    }
    public LocalDate getFecha_envasado() {
        return fecha_envasado;
    }
    public void setFecha_envasado(LocalDate fecha_envasado) {
        this.fecha_envasado = fecha_envasado;
    }
     public String getEtiqueta() {
        // Solo los atributos comunes
        return "Vencimiento: " + fecha_vencimiento + " | Lote: " + nro_lote + " | Fecha Envasado" + fecha_envasado;
    }
}
