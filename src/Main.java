//
// public class Main {
    //public static void main(String[] args) {

        //ListaTareas lista = new ListaTareas();

        //lista.agregarTarea("Lavar el baño");
        //lista.agregarTarea("Cocinar almuerzo");
        //lista.agregarTarea("Toma la siesta");

        //lista.mostrarTareas();

        //lista.completarTarea("Toma la siesta");

        //lista.mostrarTareas();

        //lista.mostrarTotalPendientes();
    //}
//}




public class Main {
    public static void main(String[] args) {

        BibliotecaLibros biblioteca = new BibliotecaLibros();

        // Agregar libros
        biblioteca.agregarLibro("Cien años de soledad");
        biblioteca.agregarLibro("El principito");
        biblioteca.agregarLibro("Don Quijote de la Mancha");
        biblioteca.agregarLibro("Cien años de soledad"); // repetido para probar HashSet

        // Mostrar libros
        biblioteca.mostrarLibros();

        // Verificar si un libro existe
        biblioteca.verificarLibro("El principito");
        biblioteca.verificarLibro("Harry Potter");

        // Mostrar total de libros únicos
        biblioteca.mostrarTotalLibros();
    }
}