public class Main {
    public static void main(String[] args) {

        ListaTareas lista = new ListaTareas();

        lista.agregarTarea("Lavar el baño");
        lista.agregarTarea("Cocinar almuerzo");
        lista.agregarTarea("Toma la siesta");

        lista.mostrarTareas();

        lista.completarTarea("Toma la siesta");

        lista.mostrarTareas();

        lista.mostrarTotalPendientes();
    }
}