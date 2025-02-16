import java.util.HashMap;
import java.util.Map;

public class ContactoMaestros {
     public static void main(String[] args){
     // Declarar Map
     Map<String, String> maestros = new HashMap<>();
     
     //Asignar Valores(Maestros y su contacto)
     maestros.put("Steven Tobar","7532-5589");
     maestros.put("Silvia Garcia", "7759-5369");
     maestros.put("Rocio Flores","7785-2696");
     maestros.put("Carlos Ruiz","7965-1254");
     
     //Mostrar Maestros y sus contactos
     System.out.println("Lista de maestros disponibles: " + maestros);
     
     //Mostrar a un maestro y su numero
    String maestrosBuscado = "Rocio Flores";
    if (maestros.containsKey(maestrosBuscado)){
        System.out.println("El numero de: " + maestrosBuscado + " es: " + maestros.get(maestrosBuscado));
        } else {
            System.out.println(maestrosBuscado + " no está en la lista de maestros");
        }
    //Eliminar Maestro
    maestros.remove("Carlos Ruiz");
    
    // Mostrar lista de maestros despues de Eliminar uno
    System.out.println("Lista de maestros actualizados" + maestros);
     
    }
    
}
