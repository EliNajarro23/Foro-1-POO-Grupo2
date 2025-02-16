import java.util.ArrayList;

public class EjemploArrayList {
    public static void main(String[] args) {
        // Declaración
        ArrayList<String> listaNombres = new ArrayList<>();

        // Asignación de valores
        listaNombres.add("Ana");
        listaNombres.add("Carlos");
        listaNombres.add("Beatriz");
        listaNombres.add(1, "David");

        System.out.println("Lista: " + listaNombres);

        // Eliminación de elementos
        listaNombres.remove(2);
        listaNombres.remove("Ana");
        System.out.println("Después de eliminar: " + listaNombres);

        listaNombres.clear();
        System.out.println("Lista vacía? " + listaNombres.isEmpty());
    }
}
