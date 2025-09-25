package empresa_agricola;

import java.time.LocalDate;

public class Producto_congelado_agua extends Producto_congelado{
    private double gr_sal;

    public Producto_congelado_agua(LocalDate fecha_envasado, String granja_origen, LocalDate fecha_vencimiento,
            int nro_lote, String codigo_organismo, double temperatura_reco, double gr_sal) {
        super(fecha_envasado, granja_origen, fecha_vencimiento, nro_lote, codigo_organismo, temperatura_reco);
        this.gr_sal = gr_sal;
    }

    public double getGr_sal() {
        return gr_sal;
    }

    public void setGr_sal(double gr_sal) {
        this.gr_sal = gr_sal;
    }
    
}
