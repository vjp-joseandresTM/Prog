/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;
import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

/**
 *
 * @author alumno
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        pedirContrasena();
    }
    
    public static void pedirContrasena(){
        Scanner sc = new Scanner(System.in);
        int intentos = 0;
        int claveCorrecta = 1234;
        boolean acceso = false;
        
        while(intentos < 3 && !acceso){
            System.out.print("Introduce la contraseña (numérica): ");
            int clave = sc.nextInt();
            
            acceso = comprobarContrasena(clave, claveCorrecta);
            
            if(acceso){
              mensajeAcceso(true);
            }else{
                intentos++;
                if (intentos == 3) {
                    mensajeAcceso(false);
                }else{
                    System.out.println("Contraseña incorrecta. Te quedan " + (3 - intentos) + " intentos.");
                }
            }
            
            
            
        }    
        
        sc.close();
    }
    
    public static boolean comprobarContrasena(int clave, int claveCorrecta){
        return clave == claveCorrecta;
    }
    
    public static boolean mensajeAcceso(boolean permitido){
       if(permitido){
            System.out.println("¡Enhorabuena! Acceso concedido.");
       }else{
            System.out.println("Error de acceso. Has agotado los 3 intentos.");
       }
    }
}
