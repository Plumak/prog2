package Electrodomestico;

public class Electrodomestico {
    // Atributos
    private String nombre;
    private double precio_base;
    private String color;
    private double consumo_energetico;
    private double peso;

    // Constructor por defecto
    public Electrodomestico() {
        this.nombre = "N";
        this.precio_base = 100;
        this.color = "gris plata";
        this.consumo_energetico = 10;
        this.peso = 2.0;
    }

    // Constructor con solo nombre
    public Electrodomestico(String nombre) {
        this(); // Llama al constructor por defecto
        this.nombre = nombre;
    }

    // Constructor completo con todos los atributos
    public Electrodomestico(String nombre, int precio_base, String color, double consumo_energetico, double peso) {
        this.nombre = nombre;
        this.precio_base = precio_base;
        this.color = color;
        this.consumo_energetico = consumo_energetico;
        this.peso = peso;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public double getPrecioBase(){
        return precio_base;
    }
    public void setPrecioBase(double precio_base){
        this.precio_base = precio_base;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double getConsumoEnergetico(){
        return consumo_energetico;
    }
    public void setConsumoEnergetico(double consumo_energetico){
        this.consumo_energetico = consumo_energetico;
    }
    public double getPeso(){
        return peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public boolean esBajoConsumo(){
        return this.consumo_energetico < 45;
    }
    public double calculoBalance(){
        return this.precio_base/this.peso;
    }
    public boolean esAltaGama(){
        return calculoBalance() > 3;
    }
@Override
public String toString() {
    return "Electrodomestico {" +
            "nombre='" + nombre + '\'' +
            ", precio_base=" + precio_base +
            ", color='" + color + '\'' +
            ", consumo_energetico=" + consumo_energetico +
            ", peso=" + peso +
            '}';
}

}
