package videojuego;

public class Personaje {
     private String nombre_real;
    private String nombre_personaje;
    private int vision_nocturna;
    private int velocidad;
    private int fuerza;
    private int peso;
    private int altura;
    private int edad;
    public Personaje(String nombre_real, String nombre_personaje, int vision_nocturna, int velocidad, int fuerza, int peso, int altura, int edad){
        this.nombre_real = nombre_real;
        this.nombre_personaje = nombre_personaje;
        this.vision_nocturna = vision_nocturna;
        this.velocidad = velocidad;
        this.fuerza = fuerza;
        this.peso = peso;
        this.edad = edad;
        this.altura = altura;
    }
    public String getNombre_real() {
        return nombre_real;
    }
    public void setNombre_real(String nombre_real) {
        this.nombre_real = nombre_real;
    }
    public String getNombre_personaje() {
        return nombre_personaje;
    }
    public void setNombre_personaje(String nombre_personaje) {
        this.nombre_personaje = nombre_personaje;
    }
    public int getVision_nocturna() {
        return vision_nocturna;
    }
    public void setVision_nocturna(int vision_nocturna) {
        this.vision_nocturna = vision_nocturna;
    }
    public int getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public int getFuerza() {
        return fuerza;
    }
    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        if(edad >= 1 && edad <= 99)
        this.edad = edad;
    }
}
