import java.util.LinkedList;

public class EjemploLinkedList {
    public static void main(String[] args) {
        // Declaración
        LinkedList<String> listaTareas = new LinkedList<>();

        // Asignación de valores
        listaTareas.add("Hacer la compra");
        listaTareas.add("Estudiar Java");
        listaTareas.addFirst("Ejercicio matutino"); // Agrega al inicio
        listaTareas.addLast("Ver una película"); // Agrega al final

        System.out.println("Lista de tareas: " + listaTareas);

        // Eliminación de elementos
        listaTareas.remove(1); // Elimina "Hacer la compra"
        listaTareas.removeFirst(); // Elimina "Ejercicio matutino"
        System.out.println("Después de eliminar: " + listaTareas);

        listaTareas.clear();
        System.out.println("Lista vacía? " + listaTareas.isEmpty());
    }
}
