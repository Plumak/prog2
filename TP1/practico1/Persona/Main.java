package Persona;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
         Persona turco = new Persona("449", null, null, 19, LocalDate.of(2006,8,21));
         System.out.println(turco);
        System.out.println(" Esta en forma ? " + turco.estaEnForma());
        System.out.println(" Es mayor de edad? " + turco.esMayorEdad());
          System.out.println(" Hoy es su cp ? " + turco.diaDeCumpleanios());
          System.out.println(" Puede votar ? " + turco.puedeVotar());
          System.out.println(" Es coherente ? " + turco.esCoherente());
    }
}
