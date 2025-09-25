package Electrodomestico;

public class Main {
    public static void main(String[] args) {
         Electrodomestico Microondas = new Electrodomestico();

        // Lo imprimimos
        System.out.println(Microondas);
       Electrodomestico Lavarropa = new Electrodomestico("Lavarropa", 1500, "Blanco", 30.5, 70);

        Electrodomestico Heladera = new Electrodomestico("Heladera", 2500, "Acero Inoxidable", 40.0, 80);

        System.out.println("\n---- HELADERA ----");
        System.out.println("¿Es bajo consumo? " + Heladera.esBajoConsumo());
        System.out.println("Balance: " + Heladera.calculoBalance());
        System.out.println("¿Es alta gama? " + Heladera.esAltaGama());

        System.out.println("\n---- LAVARROPA ----");
        System.out.println("¿Es bajo consumo? " + Lavarropa.esBajoConsumo());
        System.out.println("Balance: " + Lavarropa.calculoBalance());
        System.out.println("¿Es alta gama? " + Lavarropa.esAltaGama());

    }
}