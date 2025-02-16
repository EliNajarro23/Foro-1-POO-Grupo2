import java.util.HashSet;

public class EjemploHashSet {
    public static void main(String[] args) {
        // Declaración
        HashSet<Integer> conjuntoNumeros = new HashSet<>();

        // Asignación de valores
        conjuntoNumeros.add(10);
        conjuntoNumeros.add(20);
        conjuntoNumeros.add(30);
        conjuntoNumeros.add(20); // Ignorado automáticamente

        System.out.println("Conjunto: " + conjuntoNumeros);

        // Eliminación de elementos
        conjuntoNumeros.remove(10);
        System.out.println("Después de eliminar 10: " + conjuntoNumeros);

        conjuntoNumeros.clear();
        System.out.println("Conjunto vacío? " + conjuntoNumeros.isEmpty());
    }
}
