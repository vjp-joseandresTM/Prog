/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;
import java.util.Scanner;

/**
 *
 * @author DAM
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la nota del alumno (0 a 10): ");
        int nota = sc.nextInt();
        
         if (nota < 0 || nota > 10) {
            System.out.println("Error: la nota debe estar entre 0 y 10.");
        } else if (nota <= 4) {
            System.out.println("Calificación: Suspenso.");
        } else if (nota <= 6) {
            System.out.println("Calificación: Bien.");
        } else if (nota <= 8) {
            System.out.println("Calificación: Notable.");
        } else {
            System.out.println("Calificación: Sobresaliente.");
        }

        // TODO code application logic here
    }
    
}
