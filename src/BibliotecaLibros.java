import java.util.HashSet;

public class BibliotecaLibros {

    // evita automáticamente títulos duplicados
    private final HashSet<String> libros;


    public BibliotecaLibros() {
        libros = new HashSet<>();
    }

    // agregar libros al conjunto de libros
    public void agregarLibro(String libro) {
        if (libros.add(libro)) {
            System.out.println("Libro agregado: " + libro);
        } else {
            System.out.println("El libro ya existe en la biblioteca: " + libro);
        }
    }

    // se muestra los libros disponibles
    public void mostrarLibros() {
        System.out.println("\n--- LIBROS EN LA BIBLIOTECA ---");

        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados.");
            return;
        }

        int contador = 1;
        for (String libro : libros) {
            System.out.println(contador + ". " + libro);
            contador++;
        }
    }

    // Cual libro está disponible?
    public void verificarLibro(String libro) {
        if (libros.contains(libro)) {
            System.out.println("El libro '" + libro + "' sí está disponible.");
        } else {
            System.out.println("El libro '" + libro + "' no está disponible.");
        }
    }

    // Contar la lista de libros unicos
    public void mostrarTotalLibros() {
        System.out.println("Total de libros únicos en la biblioteca: " + libros.size());
    }
}