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


public class Profesor {
    
    private String NombreP;
    private int CodigoP;
    private String Facultad;
    
    private static ArrayList<Profesor> listaProfesores = new ArrayList<>();
    
    public Profesor(String np, int cdp, String fac) {
        this.NombreP = np;
        this.CodigoP = cdp;
        this.Facultad = fac;
        listaProfesores.add(this);
    }
    
}
