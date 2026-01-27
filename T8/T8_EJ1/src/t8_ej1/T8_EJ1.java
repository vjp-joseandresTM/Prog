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
    
    //Metodo principal en el que declaramos un objeto de la clase Asignaturas con un array.
    public static void main(String[] args) {
        
        Asignaturas[] asig = new Asignaturas[6];
        asig[0] = new Asignaturas("Programacion", intNotas() );
        asig[1] = new Asignaturas("LMSGI", intNotas() );
        asig[2] = new Asignaturas("BD", intNotas() );
        asig[3] = new Asignaturas("ED", intNotas() );
        asig[4] = new Asignaturas("SI", intNotas() );
        asig[5] = new Asignaturas("FOL", intNotas() );
        double media = calcMedia(asig);
        
        System.out.println("La media del curso es de: "+ media);
    }
    //Metodo que pedira al usuario introducir la nota de la asignatura y luego la devolvera
    public static Double intNotas(){
      Scanner sc = new Scanner(System.in); 
      
      System.out.println("Introduce la nota de: ");
      double notas = sc.nextDouble();
      return notas;
    }
    //En este metodo obtenemos las notas con un bucle, las sumaremos y fin
    public static double calcMedia(Asignaturas[] asig){
        double suma = 0;
        for (int i = 0; i < asig.length; i++) {
            suma = suma + asig[i].getNotas();
        }
        
        double media = suma/asig.length;
        return media;
    }
}
