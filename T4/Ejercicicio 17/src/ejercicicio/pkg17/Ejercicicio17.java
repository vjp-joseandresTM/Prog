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
      
      juego(); 
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
    
    public static char juego(){
        char generado = generarLetra();
        char solicitada;
        int intentos = 0;
        do {
            solicitada = pedirLetra();

            if (solicitada < generado) {
                intentos++;
                System.out.println("La letra es más alta en el abecedario");
            } else if (solicitada > generado) {
                intentos++;
                System.out.println("La letra es más baja en el abecedario");
            }

        } while (solicitada != generado);

        System.out.println("¡DIN DIN DIN! La letra era:  " + generado + " Los intentos fueron :" + intentos);
        return generado;
    }
    

    
}
