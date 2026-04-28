import java.util.HashMap;
import java.util.Map;

public class DirectorioTrabajadores {

    public static void main(String[] args) {

        HashMap<String, Double> directorio = new HashMap<>();

        //trabajadores
        System.out.println("AGREGANDO TRABAJADORES");
        agregarTrabajador(directorio, "Julian", 3500000.0);
        agregarTrabajador(directorio, "Carlos", 2800000.0);
        agregarTrabajador(directorio, "Sofía", 5100000.0);

        //mostrarlos
        mostrarTodos(directorio);

        //act salario
        actualizarSalario(directorio, "Carlos", 3200000.0);

        //mostrar lista act
        mostrarTodos(directorio);

        //calcula promedio
        calcularPromedio(directorio);

    }





    // toda este seccion me ayudo la ia la estoy intentando entender

        //Agregar trababjador
        static void agregarTrabajador(HashMap<String, Double> directorio, String nombre, double salario) {
            directorio.put(nombre, salario);
            System.out.println("Trabajador agregado: " + nombre + "| Salario: $" + salario);
        }

        //mostrar trabajadores
        static void mostrarTodos(HashMap<String, Double> directorio) {
            System.out.println("\n=== DIRECTORIO DE TRABAJADORES ===");
            for (Map.Entry<String, Double> entrada : directorio.entrySet()) {
                System.out.println("- " + entrada.getKey() + " → $" + entrada.getValue());
            }
        }


        //act salario
        static void actualizarSalario(HashMap<String, Double> directorio, String nombre, double nuevoSalario) {
            if (directorio.containsKey(nombre)) {
                double anterior = directorio.get(nombre);
                directorio.put(nombre, nuevoSalario);
                System.out.println("\nActualizado: " + nombre);
                System.out.println("  Anterior: $" + anterior);
                System.out.println("  Nuevo:    $" + nuevoSalario);
            } else {
                System.out.println("\nError: '" + nombre + "' no existe en el directorio.");
            }
        }

        //calcula salario promedio
        static double calcularPromedio(HashMap<String, Double> directorio){
            if (directorio.isEmpty()) {
                System.out.println("El directorio está vacío.");
                return 0;
            }

            double total = 0;
            for (double salario : directorio.values()) {
                total += salario;
            }

            double promedio = total / directorio.size();
            System.out.println("\nSalario promedio: $" + promedio);
            return promedio;
    }
}
