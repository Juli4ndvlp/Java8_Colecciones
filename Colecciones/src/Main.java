import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> tareas = new ArrayList<>(); // crea la lista vacia, y solo recibe strings

        //agrego tareas con add
        tareas.add("Ver el partido");
        tareas.add("Estudiar java");
        tareas.add("Revisar arrays");
        tareas.add("Partido a las 6");

        //muestro las tareas
        System.out.println("Tareas pendientes");

        for (int i = 0; i < tareas.size(); i++) {// size el tamano que tiene la lista, desde 0 no es tan legible segun la i me ayudo en este paso
            System.out.println((i + 1) + ". " + tareas.get(i));//get obtienen elemento en la posicion i
        }

        String tareaCompletada = tareas.get(0); //guradamos el nombre desde la posicion 0
        tareas.remove(0);
        System.out.println("Tarea completada : " + tareaCompletada);

        //numeor de tareas pendientes
        System.out.println("\nTotal pendientes: "+ tareas.size());


    }
}