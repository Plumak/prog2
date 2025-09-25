package gastos_publicos;
import java.util.ArrayList;

public class Pais {
    private String nombre;
    private ArrayList<Provincias> provincias;

    public Pais(String nombre) {
        this.nombre = nombre;
        this.provincias = new ArrayList<>();
    }

    public void agregarProvincia(Provincias p) {
        provincias.add(p);
    }

    // Listar todas las ciudades en déficit del país
    public void mostrarCiudadesEnDeficit() {
        for (Provincias prov : provincias) {
            for (Ciudades c : prov.getCiudades()) {
                if (c.getHabitantes() > 100000 && c.deficit()) {
                    System.out.println("Ciudad en déficit: " + c.getNombre());
                }
            }
        }
    }

    // Listar provincias con más de la mitad de ciudades en déficit
    public void mostrarProvinciasConDeficit() {
        for (Provincias prov : provincias) {
            if (prov.tienen_mas_ciudades_en_deficit()) {
                System.out.println("Provincia en problema: " + prov.getNombre());
            }
        }
    }

    // Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Provincias> getProvincias() {
        return provincias;
    }

    public void setProvincias(ArrayList<Provincias> provincias) {
        this.provincias = provincias;
    }
}
