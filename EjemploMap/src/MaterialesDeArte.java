import java.util.HashMap;
import java.util.Map;

//Conceptos

//Map: Estructura de datos que almancena pares clave-valor
//Clave como el identidicador unico(codigo) y el valor como informacion asociada(Nombre de material)

//Clases
//HashMap: Los elementos que inserta en el map no tendrán un orden específico. 
//No aceptan claves duplicadas ni valores nulos.
//TreeMap: El Mapa lo ordena de forma "natural",Los ordena de menos a mayor.
//LinkedHashMap: Inserta en el Map los elementos en el orden en el que se van insertando.


public class MaterialesDeArte {
    public static void main(String[] args){
     // Declarar Map
     Map<String, String> materiales = new HashMap<>();
     
     //Asignar Valores(Codigo de venta de cada Material)
     materiales.put("Pincel Condor","PC0001");
     materiales.put("Acuarelas Koi", "AK0001");
     materiales.put("Set de Plumillas","ST0001");
     materiales.put("SketchBook ","SB0001");
     
     //Mostrar Materiales y sus codigos
     System.out.println("Lista de Materiales Disponibles: " + materiales);
     
     //Obtener el codigo de un material en especifico
    String materialBuscado = "Acuarelas Koi";
    if (materiales.containsKey(materialBuscado)){
        System.out.println("El codigo de: " + materialBuscado + " es: " + materiales.get(materialBuscado));
        } else {
            System.out.println(materialBuscado + " no está en la lista de materiales.");    
        }
    //Eliminar Material
    materiales.remove("Pincel Condor");
    
    // Mostrar lista de materiales despues de eliminar un material
    System.out.println("Lista de materiales actualizado:  " + materiales);
     
    }
}
