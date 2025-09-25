package Geometria;

public class Punto {
    // atributos //
    private double x;
    private double y;

    public Punto() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Responsabilidades //
    public void desplazarPunto(double nuevoX, double nuevoY) {
        this.x += nuevoX;
        this.y += nuevoY;
    }

    public double calculoEuclidea(Punto otro) {
        double diferenciaX = this.x - otro.getX();
        double diferenciaY = this.y - otro.getY();
        return Math.sqrt(diferenciaX * diferenciaX + diferenciaY * diferenciaY);
    }

    // Getters y Setters //
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
