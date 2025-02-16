import java.util.ArrayList;
import java.util.List;

public class EjemploList3 {
    public static void main(String[] args) {
        // Declaración de la lista
        List<Integer> numeros = new ArrayList<>();
        
        // Agregar números
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        System.out.println("Lista: " + numeros);
        
        // Agregar en posición específica
        numeros.add(1, 15);
        System.out.println("Después de agregar 15: " + numeros);
        
        // Eliminar un número
        numeros.remove(0);  // Elimina el primer elemento
        System.out.println("Después de eliminar: " + numeros);
    }
}