/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registro;

/**
 *
 * @author Estudiante
 */

import java.util.ArrayList;
import java.util.Scanner;
import static registro.Libro.listaLibros;
public class Registro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sistemaactivo = true;
        
        while(sistemaactivo){
        System.out.println("############################");
        System.out.println("Buenos dias");
        System.out.println("ingrese 1,2 o 3 segun su tipo de registro. o 4 para consultar libros ");
        System.out.println("1. Libro");
        System.out.println("2. Profesor");
        System.out.println("3. Estudiante");
        System.out.println("4. Lista de libros");
        
        System.out.print("Ingrese su opcion: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();
        
        
        if (opcion == 1) {
                
                    System.out.print("Ingrese el Nombre del libro: ");
                    String nomlib = scanner.nextLine();
                    
                    System.out.println("Nombre ingresado " + nomlib);
                    System.out.println("----------------- ");
                   
                    System.out.print("Ingrese el año de publicacion: ");
                    int apublicacion = scanner.nextInt();
                    
                    System.out.println("Se publico en " + apublicacion);
                    System.out.println("----------------- ");
                    
                    System.out.println("Seleccione entre las siguientes opciones segun corresponda el Genero: ");
                    System.out.println("1. ciencia");
                    System.out.println("2. literatura");
                    System.out.println("3. ingenieria");
                    int opcion2 = scanner.nextInt();
                    
                    String gen = "";
                switch(opcion2) {
                    case 1:
                        gen = "ciencia";
                        break;
                    case 2:
                        gen = "literatura";
                        break;
                    case 3:
                        gen = "ingenieria";
                        break;
                    default:
                        gen = "desconocido";
            }       
                   Libro nuevoLibro = new Libro(nomlib, apublicacion,gen);
        }



        if(opcion == 2){
                    System.out.print("Ingrese el Nombre del Profesor: ");
                    String nprof = scanner.nextLine();
                    
                    System.out.println("Nombre ingresado " + nprof);
                    System.out.println("----------------- ");
                   
                    System.out.print("Ingrese el codigo del Profesor: ");
                    int cdp = scanner.nextInt();
                    
                    System.out.println("Codigo No " + cdp);
                    System.out.println("----------------- ");
                    
                    System.out.print("Ingrese la Facultad: ");
                    String facu = scanner.nextLine();
                    
                    System.out.println("Adscrito a " + facu);
                    System.out.println("----------------- ");
                    
                    Profesor nuevoProfesor = new Profesor(nprof, cdp, facu);
        }
        
        
        if(opcion == 3){
                    System.out.print("Ingrese el Nombre del Estudiante: ");
                    String nest = scanner.nextLine();
                    
                    System.out.println("Nombre ingresado " + nest);
                    System.out.println("----------------- ");
                   
                    System.out.print("Ingrese el codigo del Estudiante: ");
                    int cst = scanner.nextInt();
                    
                    System.out.println("Codigo No " + cst);
                    System.out.println("----------------- ");
                    
                    System.out.print("Ingrese la Carrera: ");
                    String carr = scanner.nextLine();
                    
                    System.out.println("Adscrito a " + carr);
                    System.out.println("----------------- ");
                    
                    Profesor nuevoEstudiante = new Profesor(nest, cst, carr);
        } 
        
        if(opcion == 4){
                    System.out.println("--Lista de Libros--");
                    if(listaLibros.isEmpty()) {
                    System.out.println("No hay libros registrados aún.");
                    }
                    else {
                        for(int i = 0; i < listaLibros.size(); i++) {
                            Libro libro = listaLibros.get(i);
                            System.out.println("\nLibro #" + (i+1));
                            System.out.println("Titulo: " + libro.Titulo);
                            System.out.println("Año: " + libro.añoDePublicacion);
                            System.out.println("Genero: " + libro.Genero);
                            System.out.println("-----------------");
            }
                    
                    
                    }
        }
                         
    }
    }
}
