package Geometria;

public class Rectangulo {
    private Punto esquinaInferiorIzquierda;
    private Punto esquinaSuperiorDerecha;

    public Rectangulo(Punto p1, Punto p2) {
        this.esquinaInferiorIzquierda = p1;
        this.esquinaSuperiorDerecha = p2;
    }
   public double calcularArea() {
    double base = Math.abs(esquinaSuperiorDerecha.getX() - esquinaInferiorIzquierda.getX());
    double altura = Math.abs(esquinaSuperiorDerecha.getY() - esquinaInferiorIzquierda.getY());
    return base * altura;
}
public int comparar(Rectangulo otro) {
    double areaEste = this.calcularArea();
    double areaOtro = otro.calcularArea();

    if (areaEste > areaOtro) {
        return 1;
    } else if (areaEste < areaOtro) {
        return -1;
    } else {
        return 0;
    }
}


    // Métodos para calcular área, mover, etc.
}
