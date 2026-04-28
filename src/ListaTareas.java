import java.util.ArrayList;

public class ListaTareas {


    private final ArrayList<String> tareas;

    // inicializa la lista vacía
    public ListaTareas() {
        tareas = new ArrayList<>();
    }

    // Agregar una tarea
    public void agregarTarea(String tarea) {
        tareas.add(tarea);
        System.out.println("Tarea agregada: " + tarea);
    }

    // Mostrar todas las tareas con un for
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

    // Marcar una tarea como completada
    public void completarTarea(String tarea) {
        if (tareas.remove(tarea)) {
            System.out.println("Tarea completada: " + tarea);
        } else {
            System.out.println("La tarea no fue encontrada: " + tarea);
        }
    }

    // Mostrar cuantas tareas quedan pendientes
    public void mostrarTotalPendientes() {
        System.out.println("Total de tareas pendientes: " + tareas.size());
    }
}
