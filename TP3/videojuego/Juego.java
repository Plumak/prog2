package videojuego;

import java.util.ArrayList;

public class Juego {
    private String nombre_videojuego;
    private Heroe p1;
    private Villano p2;

    public Juego(String nombre_videojuego, Heroe p1, Villano p2) {
        this.nombre_videojuego = nombre_videojuego;
        this.p1 = p1;
        this.p2 = p2;
    }

    public Heroe getP1() {
        return p1;
    }

    public void setP1(Heroe p1) {
        this.p1 = p1;
    }

    public Villano getP2() {
        return p2;
    }

    public void setP2(Villano p2) {
        this.p2 = p2;
    }

    public Personaje personajeGanador() {
        if (p1.getFuerza() > p2.getFuerza()) {
            return p1;
        } else if (p1.getFuerza() < p2.getFuerza()) {
            return p2;
        } else {
            return desempate();
        }

    }

    public Personaje desempate() {
        if (p1.getVelocidad() > p2.getVelocidad()) {
            return p1;
        } else if (p1.getVelocidad() < p2.getVelocidad()) {
            return p2;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        Heroe p1 = new Heroe("Lukas", "Spiderman", 78, 160, 76, 65, 296, 23);
        Villano p2 = new Villano("Ivan", "Superman", 78, 160, 76, 65, 290, 33);
        Juego juego = new Juego("Mortal combat 72", p1, p2);
        Personaje mensaje = juego.personajeGanador();
        if (mensaje == null) {
            System.out.println("Empate.");
        } else {
            System.out.println("El ganador es " + mensaje.getNombre_personaje());
        }
    }
}
