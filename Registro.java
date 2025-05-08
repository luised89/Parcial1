/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registro;

/**
 *
 * @author Estudiante
 */

import java.io.InputStream;
import java.util.Scanner;
public class Registro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Buenos dias");
        System.out.println("ingrese 1,2 o 3 segun su tipo de registro ");
        System.out.println("1. Libro");
        System.out.println("2. Profesor");
        System.out.println("3. Estudiante");
        
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
                    System.out.print("Profesor ");
                    //double valorRetirar = scanner.nextDouble();
                    //cuenta.retirar(valorRetirar);
        }
        
        
        if(opcion == 3){
                    System.out.println("Estudiante");
                    scanner.close();
        }
                        
    }
    
}
