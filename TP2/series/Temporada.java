/*
 ● Ingresar la calificación de un episodio. Si el valor ingresado como calificación
no es correcto imprimir un mensaje por pantalla y no cambiar el valor anterior. -Hecho-
● Obtener el total de episodios vistos de una temporada particular. -Hecho-
● Obtener el total de episodios vistos de una serie. -Hecho-
● Obtener el promedio de las calificaciones dadas para una temporada particular. -Hecho-
● Obtener el promedio de las calificaciones dadas para una serie. -Hecho-
● Determinar si se vio todos los episodios de la serie. 
 */
package series;

import java.util.ArrayList;

public class Temporada {
    // atributos //
    private int numero_temp;
    private int cant_episodios;
    private ArrayList<Episodio> episodios;

    public Temporada(int numero_temp, int cant_episodios) {
        this.numero_temp = numero_temp;
        this.cant_episodios = cant_episodios;
        this.episodios = new ArrayList<>();
    }

    // Getters y setters //
    public int getNumero_temp() {
        return numero_temp;
    }

    public void setNumero_temp(int numero_temp) {
        this.numero_temp = numero_temp;
    }

    public int getCant_episodios() {
        return cant_episodios;
    }

    public void setCant_episodios(int cant_episodios) {
        this.cant_episodios = cant_episodios;
    }

    // agregamos episodios //
    public void agregarEpisodios(Episodio nuevo_episodio) {
        episodios.add(nuevo_episodio);
    }

    // metodos //
    public int cant_episodios_vistos_por_temporada() {
        int contador = 0;
        for (Episodio e : episodios) {
            if (e.getSeVio()) {
                contador++;
            }
        }
        return contador;
    }

    public double promedioCalificacionTemporada() {
        int suma = 0;
        for (Episodio e : episodios) {
            if (e.getCalificacion() >= 0)
                suma += e.getCalificacion();
        }
        double promedio = suma / episodios.size();
        return promedio;
    }

public int contadorEpisodiosTemporada(){
    int contador=0;
       for(Episodio e : episodios){
        contador++;
}
return contador;
}
}