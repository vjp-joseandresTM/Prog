/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13_tema2;

/**
 *
 * @author DAM
 */
public class Ejercicio13_Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int numero1 = 1;
            byte numero2 = 2;
            
    System.err.println("La variable numero1 contiene el valor " + numero1 + " y la variable numero2 contiene el valor " + numero2);

            int cambio = numero1;
            numero1 = numero2;
            numero2 = (byte) cambio;
            
     System.out.println("Ahora, la variable numero1 contiene el valor " + numero1 + " y la variable numero2 contiene el valor " + numero2);        
        // TODO code application logic here
    }
    
}
