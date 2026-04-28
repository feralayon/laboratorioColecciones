import java.util.HashMap;
import java.util.Map;

public class DirectorioTrabajadores {

    // hashMap: clave, valor (nombre del trabajador, salario)
    private final HashMap<String, Double> trabajadores;

    public DirectorioTrabajadores() {
        trabajadores = new HashMap<>();
    }

    // agregar trabajador con su salario
    public void agregarTrabajador(String nombre, double salario) {
        trabajadores.put(nombre, salario);
        System.out.println("Trabajador agregado: " + nombre + " | Salario: " + salario);
    }

    // mostrar todos los trabajadores y sus salarios
    public void mostrarTrabajadores() {
        System.out.println("\n--- directorio de trabajadores ---");

        if (trabajadores.isEmpty()) {
            System.out.println("No hay trabajadores registrados."); // condicional

        } else {
            System.out.println("Si hay trabajadores " + trabajadores + "registrados");

        }

        for (Map.Entry<String, Double> entry : trabajadores.entrySet()) {
            System.out.println("Nombre: " + entry.getKey() + " | Salario: " + entry.getValue());
        }
    }

    // actualizar salario de un trabajador
    public void actualizarSalario(String nombre, double nuevoSalario) {
        if (trabajadores.containsKey(nombre)) {
            trabajadores.put(nombre, nuevoSalario);
            System.out.println("Salario actualizado de " + nombre + " a: " + nuevoSalario);
        } else {
            System.out.println("El trabajador '" + nombre + "' no existe en el directorio.");
        }
    }

    // 4. Calcular salario promedio
    public void mostrarSalarioPromedio() {
        if (trabajadores.isEmpty()) {
            System.out.println("No se puede calcular el promedio porque no hay trabajadores.");
            return;
        }

        double suma = 0;

        for (double salario : trabajadores.values()) {
            suma += salario;
        }

        double promedio = suma / trabajadores.size();
        System.out.println("Salario promedio: " + promedio);
    }
}


