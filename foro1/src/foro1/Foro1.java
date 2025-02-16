
package foro1;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;


public class Foro1 {

   
    public static void main(String[] args) {
        
        //Declaramos variables
        int option;
        boolean salir = false;
        int cantidadAlum;
        String carnet;
        String nomAlumno;
               
        //Creamos un objeto tipo map
        Map<String,String> estudiantesUDB = new HashMap<>();
        
        //Creamos un objeto tipo Scanner para leer consola
        Scanner scan = new Scanner(System.in);
        
        //Menú al usuario
                
        while(!salir){
            System.out.println("\n*** ESTUDIANTES UDB - POO *** ");
            System.out.println("Que acción quiere hacer:");
            System.out.println("1. Ingresar alumno");
            System.out.println("2. Buscar alumno");
            System.out.println("3. Eliminar alumno");
            System.out.println("4. Mostrar todos los alumnos");
            System.out.println("5. Salir");
            System.out.println("Seleccione una opción:");
            option = scan.nextInt();
           
            try{
            
            switch (option){
                
                case 1:
                    
                    //Ingresar un alumono
                    
                    //Se le pregunta al usuario cuantos alumnos desea ingresar
                    System.out.println("Cuantos alumnos desea ingresar:");
                    cantidadAlum = scan.nextInt();
                    scan.nextLine();
                    
                    //Depende la cantidad de alumnos asi se hara el llenado del mapa
                    for (int i = 0; i < cantidadAlum; i++) {
                        System.out.println("\nIngrese el carnet del estudiante #"+ (i+1) + ": ");
                        carnet = scan.nextLine();
                        
                        System.out.println("Ingrese el nombre del estudiante #"+ (i+1) + ": ");
                        nomAlumno = scan.nextLine();
                        
                        //Se le asignan los valores al mapa
                        estudiantesUDB.put(carnet,nomAlumno);
                    }
                    
                    break;
                    
                case 2:
                    
                    //Buscar un alumno
                    
                    //Se solicita el carnet del alumno que sea buscar
                    System.out.println("Ingrese el carnet del alumno que desea buscar:");
                    carnet = scan.next();
                    
                    //Buscar el alumno en el mapa               
                    if(estudiantesUDB.containsKey(carnet)){
                        
                        nomAlumno = estudiantesUDB.get(carnet);
                        System.out.println("\nEl carnet: " + carnet + " es del estudiante: " + nomAlumno);
                    }else{
                        System.out.println("\nAlumno no encontrado, no se puede mostrar");
                    }
                    
                    
                    break;
                    
                    
                case 3:
                    
                    //Eliminar un alumno
                    
                    //Solicitar el carnet del alumno que desea eliminar
                    System.out.println("Ingrese el carnet del alumno que desea eliminar:");
                    carnet = scan.next();
                    
                     //Buscar el alumno en el mapa               
                    if(estudiantesUDB.containsKey(carnet)){
                        estudiantesUDB.remove(carnet);
                        System.out.println("\nEl estudiante con carnet: " + carnet + " ha sido eliminado exitosamente");
                    }else{
                        System.out.println("\nAlumno no encontrado,  no se puede elimienar");
                    }
                    
                    break;
                    
                    
                case 4:
                    
                    // Mostrar el mapa completo
                    System.out.println("\nEstudiantes:");
                    
                    for (Map.Entry<String, String> entrada : estudiantesUDB.entrySet()) {
                    System.out.println("Carnet: " + entrada.getKey() + " Nombre: " + entrada.getValue());
                    }
                    break;
                    
                case 5:
                    
                    salir=true;
                    break;
                    
                default:
                    System.out.println("\nLas Opciones son 1, 2, 3, 4 y 5");
                  
            }
            } catch (InputMismatchException e)  {
                System.out.println("Ingrese un número");
                scan.next();
            }
        }
        
        scan.close();
        
        }
        
    }
    

