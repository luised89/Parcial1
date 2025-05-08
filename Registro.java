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
        
        if (opcion == 1) {
                
                    System.out.print("Ingrese el Nombre del libro: ");
                    String X1 = scanner.nextLine();
                    System.out.println(X1);
                   
                   
                   // System.out.print("Ingrese el año de publicacion: ");
                    //int X2 = scanner.nextInt();

                   // System.out.print("Seleccione entre las siguientes opciones segun corresponda el Genero: ");
                   // System.out.println("1. ciencia");
                    //System.out.println("2. literatura");
                  //  System.out.println("3. ingenieria");
                   // int opcion2 = scanner.nextInt();
                  //  if(opcion2 == 1){
                  //      String X3 = "ciencia";
                   // }
                  //  if(opcion2 == 2){
                  //      String X3 = "literatura";
                  //  }
                  //  if(opcion2 == 3){
                  //      String X3 = "ingenieria";
                  //  }                
        
        }



        if(opcion == 2){
                    System.out.print("Ingrese el valor a retirar: ");
                    //double valorRetirar = scanner.nextDouble();
                    //cuenta.retirar(valorRetirar);
        }
        
        
        if(opcion == 3){
                    System.out.println("Gracias por usar nuestros servicios.");
                    scanner.close();
        }
                        
    }
    
}
