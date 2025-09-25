package figurasConHerencia;

public class Figura3D {
    Figura base;
    String nombre;
    int altura;

    public Figura3D(Figura base, String nombre, int altura) {
        this.base = base;
        this.nombre = nombre;
        this.altura = altura;
    }

    public double getVolumen() {
        return this.base.getArea() * this.getAltura();
    }

    public int getAltura() {
        return this.altura;
    }

    
}
