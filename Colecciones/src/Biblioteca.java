import java.util.HashSet;

public class Biblioteca {
    public static void main(String[] args) {

        HashSet<String> libros = new HashSet<>();

        libros.add("La melancolia de los feos");
        libros.add("La Biblia de los caidos");
        libros.add("Control");
        libros.add("Satanas");
        libros.add("Satanas"); //testeo

        System.out.println("====== BIBLIOTECA =====");
        for(String libro : libros) { // por cada libro dentro de libros
            System.out.println("- " + libro);
        }

        String buscar = "La melancolia de los feos";

        System.out.println("\n¿Está '" + buscar + "' disponible?");

        if (libros.contains(buscar)) { // contains retorna true or false por los hash
            System.out.println("'" + buscar + "'esta disponible.");
        }else
            System.out.println("'" + buscar + "' No esta disponible.");

        //total de libros
        System.out.println("Total de libros unicos:" + libros.size()); // size cuantos elementos hay

    }

}
