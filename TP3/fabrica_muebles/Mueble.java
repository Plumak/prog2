package fabrica_muebles;

public class Mueble {
    private String tipo_mueble;
    private double peso;
    private double costo;
    private double valor_venta;
    private String tipo_madera;
    private String color;
    private double margen;
    public Mueble(double peso, double costo,String tipo_madera, String color, String tipo_mueble, double margen){
        if(tipo_mueble.equalsIgnoreCase("Mesa") || tipo_mueble.equalsIgnoreCase("Silla") || tipo_mueble.equalsIgnoreCase("Banco"))
        this.tipo_mueble = tipo_mueble;
        this.peso = peso;
        this.costo = costo;
        this.valor_venta = valor_venta();
        this.tipo_madera = tipo_madera;
        this.color = color;
        this.margen = margen;
    }
    public double getMargen() {
        return margen;
    }

    public void setMargen(double margen) {
        this.margen = margen;
        this.valor_venta = valor_venta();
    }

    public double valor_venta(){
        return this.costo + costo * margen;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getCosto() {
        return costo;
    }
    public void setCosto(double costo) {
        this.costo = costo;
    }
    public String getTipo_madera() {
        return tipo_madera;
    }
    public void setTipo_madera(String tipo_madera) {
        this.tipo_madera = tipo_madera;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getTipo_mueble() {
        return tipo_mueble;
    }
    public void setTipo_mueble(String tipo_mueble) {
        this.tipo_mueble = tipo_mueble;
    }
    
}
