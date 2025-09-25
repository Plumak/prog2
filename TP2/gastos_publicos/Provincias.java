package gastos_publicos;

import java.util.ArrayList;

public class Provincias {
    private String nombre;
    private ArrayList<Ciudades> Ciudades;

    public Provincias(String nombre) {
        this.nombre = nombre;
         this.Ciudades = new ArrayList<>();
    }
   public boolean tienen_mas_ciudades_en_deficit() {
    int enDeficit = 0;
    int total = 0;
    for (Ciudades c : Ciudades) {
        if(c.getHabitantes() > 100000){
            total++;
        // llamamos a la funcion de Ciudades que chequea si estan en deficit //
        if (c.deficit()) {
            enDeficit++;
        }

    }
    }
 if (total == 0) {
        return false;
}
    return enDeficit > (total / 2);
}

    public int contador_ciudades(){
        int contador = 0;
        for(Ciudades c : Ciudades){
            contador++;
        }
        return contador;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Ciudades> getCiudades() {
        return Ciudades;
    }

    public void setCiudades(ArrayList<Ciudades> ciudades) {
        Ciudades = ciudades;
    }

}
