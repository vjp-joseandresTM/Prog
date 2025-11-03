/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicicio.pkg17;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      char letraGenerada = generarLetra();
       
    }
    public static char pedirLetra(){
        Scanner sc = new Scanner(System.in);
        char letraUser;
        System.out.println("Introduce una letra para jugar: ");
        letraUser = sc.nextLine().charAt(0);
        return letraUser;
        
        
    }
    public static char generarLetra(){
        int numero = (int) (Math.random()*(122-97+1))+ 97; 
        return (char)numero;
       
    }
    

    
}
