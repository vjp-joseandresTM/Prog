/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio30;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author DAM
 */
public class Ejercicio30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int  aleatorio = (int) Math.floor((Math.random()*10+1)); //Le declaro que la variable sea un numero aleatorio
       System.out.print("Introduce el primer número: "); //Pido un numero en consola 
       int numero = sc.nextInt();
       
       if (aleatorio==numero){ //Si el numero es igual, que felicicte al usuario
           System.out.println("Felicidades, el numero era el mismo");
           
       }else{ //Si la comparacion de los numeros no es igual
            System.out.println("Lo siento, el numero fue: " + aleatorio);
       }
    }
    
}
