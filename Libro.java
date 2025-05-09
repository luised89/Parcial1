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

public class Libro {
    
    public String Titulo;
    public int añoDePublicacion;
    public String Genero;
    
    public static ArrayList<Libro> listaLibros = new ArrayList<>();
    
    
    public Libro(String tit, int aDp, String Gnr) {
        this.Titulo = tit;
        this.añoDePublicacion = aDp;
        this.Genero = Gnr;
        listaLibros.add(this);
    }
}
