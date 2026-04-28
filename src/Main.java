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




//public class Main {
    //public static void main(String[] args) {

        //BibliotecaLibros biblioteca = new BibliotecaLibros();

        // Agregar libros
        //biblioteca.agregarLibro("Cien años de soledad");
        //biblioteca.agregarLibro("El principito");
        //biblioteca.agregarLibro("Don Quijote de la Mancha");
        //biblioteca.agregarLibro("Cien años de soledad"); // repetido para probar HashSet

        // Mostrar libros
        //biblioteca.mostrarLibros();

        // Verificar si un libro existe
        //biblioteca.verificarLibro("El principito");
        //biblioteca.verificarLibro("Harry Potter");

        // Mostrar total de libros únicos
        //biblioteca.mostrarTotalLibros();
    //}


//}



public class Main {
    public static void main(String[] args) {

        DirectorioTrabajadores directorio = new DirectorioTrabajadores();


        directorio.agregarTrabajador("Ana", 2500000);
        directorio.agregarTrabajador("Luis", 3200000);
        directorio.agregarTrabajador("Carlos", 2800000);


        directorio.mostrarTrabajadores();   // mostrar directorio


        directorio.actualizarSalario("Luis", 3500000); // sctualizar salario


        directorio.actualizarSalario("Marta", 3000000);  // intentar actualizar el que no existe


        directorio.mostrarTrabajadores(); // directorio actualizado


        directorio.mostrarSalarioPromedio(); //  promedio
    }
}