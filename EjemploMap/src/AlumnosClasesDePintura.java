import java.util.HashMap;
import java.util.Map;

public class AlumnosClasesDePintura {
    public static void main(String[] args){
     // Declarar Map
     Map<String, String> alumnos = new HashMap<>();
     
     //Asignar Valores(Alumnos y su codigo)
     alumnos.put("Marcos Carrillo","MC2025");
     alumnos.put("Fernanda Avendaño", "FA2025");
     alumnos.put("Fabiola Castañeda","FC2025");
     alumnos.put("Luis Flores","LF2025");
     
     //Mostrar Alumnos y sus codigos
     System.out.println("Lista de alumnos inscritos: " + alumnos);
     
     //Mostrar a un alumno y su codigo
    String alumnosBuscado = "Marcos Castillo";
    if (alumnos.containsKey(alumnosBuscado)){
        System.out.println("El codigo de: " + alumnosBuscado + " es: " + alumnos.get(alumnosBuscado));
        } else {
            System.out.println(alumnosBuscado + " no está en la lista de almunos");
        }
    //Eliminar Alumnos
    alumnos.remove("Luis Flores");
    
    // Mostrar lista de alumnos despues de Eliminar uno
    System.out.println("Lista de almumnos actualizados" + alumnos);
     
    }
}
