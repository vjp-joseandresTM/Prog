/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20;
import java.util.Scanner;
/**
 *
 * @author DAM
 */
public class Ejercicio20 {
public static final String RESPUESTA1 = "Madrid";
public static final String RESPUESTA2 = "Colón";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String respuesta1 = pregunta1();
        String respuesta2 = pregunta2();
        int nota = 0;
        int preguntasContestadas = 0;
        
        if(respuesta1.equalsIgnoreCase(RESPUESTA1)){
            nota += 5;
            System.out.println("Correcto!!!");
        } else {
            System.out.println("Incorrecto");
        }

        if(respuesta2.equalsIgnoreCase(RESPUESTA2)){
            nota += 5;
            System.out.println("Correcto!!!");
        } else {
            System.out.println("Incorrecto");
        }

        System.out.println("Tu nota final es: " + nota + "/10");
    }
    
    public static String pregunta1(){
       Scanner sc = new Scanner(System.in);
       String respuestaUsuario;
        System.out.println("¿Cual es la capital de España?");
        respuestaUsuario = sc.nextLine();
        return respuestaUsuario;
    }
    
    public static String pregunta2(){
       Scanner sc = new Scanner(System.in);
       String respuestaUsuario;
        System.out.println("¿Quien descubrio america?");
        respuestaUsuario = sc.nextLine();
        return respuestaUsuario;
    }
}
