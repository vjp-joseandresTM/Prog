/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t8_ej1;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T8_EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Asignaturas[] asig = new Asignaturas[6];
        asig[0] = new Asignaturas("Programacion", intNotas() );
        asig[1] = new Asignaturas("LMSGI", intNotas() );
        asig[2] = new Asignaturas("", intNotas() );
        asig[3] = new Asignaturas("Programacion", intNotas() );
        asig[5] = new Asignaturas("Programacion", intNotas() );
        asig[6] = new Asignaturas("Programacion", intNotas() );
    }
    
    public static Double intNotas(){
      Scanner sc = new Scanner(System.in); 
      double notas = sc.nextDouble();
      return notas;
    }
}
