import java.util.ArrayList;
import java.util.List;

public class EjemploList3 {
    public static void main(String[] args) {
        // Declaración de la lista
        List<Integer> numeros = new ArrayList<>();
        
        // Agregar números
        numeros.add(90);
        numeros.add(50);
        numeros.add(26);
        System.out.println("Lista: " + numeros);
        
        // Agregar en posición específica
        numeros.add(1, 455);
        System.out.println("Después de agregar 455: " + numeros);
        
        // Eliminar un número
        numeros.remove(0);  // Elimina el primer elemento
        System.out.println("Después de eliminar: " + numeros);
    }
}