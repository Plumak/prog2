import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Dado d1 = new Dado(5);

        System.out.println("Este es el dado: " + d1.toString());
        Dado d2 = new Dado(6);
        Dado d3 = new Dado(6);
        d3 = d2;

        Jugador j1 = new Jugador("Juan");

        if (d2 == d3)
            System.out.println("Son iguales");
        else
            System.out.println("No son iguales");

        if (d2.equals(j1))
            System.out.println("Son iguales");
        else
            System.out.println("No son iguales");

        ArrayList<Dado> dados = new ArrayList<>();
        dados.add(d3);
        dados.add(0, d1);
        // Funciona pq ArrayList redefine toString. Esa redefinición usa el toString de la clase que contiene
        // Por lo tanto, tambien debemos redefinir el toString de la clase Dado
        System.out.println(dados);  
        // El contains hace uso del equals de la clase Dado (debe ser redefinido para que funciones como pretendemos)
        dados.contains(d1);
    }
}
