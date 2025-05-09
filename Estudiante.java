/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registro;

/**
 *
 * @author Estudiante
 */
import java.util.ArrayList;

public class Estudiante {
    
    private String NombreE;
    private int CodigoE;
    private String Carrera;
    
    private static ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    
    public Estudiante(String ne, int cde, String car) {
        this.NombreE = ne;
        this.CodigoE = cde;
        this.Carrera = car;
        listaEstudiantes.add(this);
    }    
    
}
