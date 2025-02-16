import java.util.ArrayList;
import java.util.List;

public class EjemploList2 {
    public static void main(String[] args) {
        // Declaración de la lista de estudiantes
        List<String> estudiantes = new ArrayList<>();
        
        // Agregar estudiantes a la lista
        System.out.println("1. Agregando estudiantes:");
        estudiantes.add("Alex");
        estudiantes.add("Eli");
        estudiantes.add("Oscar");
        System.out.println("Lista inicial de estudiantes: " + estudiantes);
        
        // Agregar un estudiante en una posición específica
        estudiantes.add(1, "María");
        System.out.println("\n2. Después de agregar a María en posición 1: " + estudiantes);
        
        // Verificar si un estudiante está en la lista
        String buscarEstudiante = "Alex";
        System.out.println("\n3. ¿Está " + buscarEstudiante + " en la lista? " 
            + estudiantes.contains(buscarEstudiante));
        
        // Obtener la posición de un estudiante
        System.out.println("Posición de Alex: " + estudiantes.indexOf("Alex"));
        
        // Eliminar estudiantes
        estudiantes.remove("Oscar");
        System.out.println("\n4. Después de eliminar a Oscar: " + estudiantes);
        
        // Mostrar el total de estudiantes
        System.out.println("\n5. Total de estudiantes: " + estudiantes.size());
        
        // Limpiar la lista
        estudiantes.clear();
        System.out.println("\n6. Después de limpiar la lista: " + estudiantes);
        System.out.println("¿Lista vacía? " + estudiantes.isEmpty());
    }
}