import java.util.ArrayList;
import java.util.List;

public class EjemploList1 {
    public static void main(String[] args) {
        // Declaración de la lista
        List<String> carros = new ArrayList<>();
        
        // Agregar valores
        carros.add("Nissan Skyline");
        carros.add("Toyota Supra");
        carros.add("Tesla");
        System.out.println("Lista: " + carros);
        
        // Eliminar un valor
        carros.remove("Tesla");
        System.out.println("Después de eliminar: " + carros);
        
        // Verificar si existe un elemento
        System.out.println("¿Contiene Tesla? " + carros.contains("Rojo"));
    }
} 