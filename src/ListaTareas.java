import java.util.ArrayList;

public class ListaTareas {

    // Lista donde se guardan las tareas pendientes
    private final ArrayList<String> tareas;

    // Constructor: inicializa la lista vacía
    public ListaTareas() {
        tareas = new ArrayList<>();
    }

    // 1. Agregar una tarea
    public void agregarTarea(String tarea) {
        tareas.add(tarea);
        System.out.println("Tarea agregada: " + tarea);
    }

    // 2. Mostrar todas las tareas
    public void mostrarTareas() {
        System.out.println("\n--- LISTA DE TAREAS ---");

        if (tareas.isEmpty()) {
            System.out.println("No hay tareas pendientes.");
            return;
        }

        for (int i = 0; i < tareas.size(); i++) {
            System.out.println((i + 1) + ". " + tareas.get(i));
        }
    }

    // 3. Marcar una tarea como completada (eliminarla)
    public void completarTarea(String tarea) {
        if (tareas.remove(tarea)) {
            System.out.println("Tarea completada: " + tarea);
        } else {
            System.out.println("La tarea no fue encontrada: " + tarea);
        }
    }

    // 4. Mostrar cuántas tareas quedan pendientes
    public void mostrarTotalPendientes() {
        System.out.println("Total de tareas pendientes: " + tareas.size());
    }
}
