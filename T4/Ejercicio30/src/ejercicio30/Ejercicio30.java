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
       int  aleatorio = (int) Math.floor((Math.random()*100+1));
       System.out.print("Introduce el primer número: ");
       int numero = sc.nextInt();
       
       if (aleatorio==numero){
           System.out.println("Felicidades, el numero era el mismo");
           
       }else{
            System.out.println("Lo siento, el numero fue: " + aleatorio);
       }
    }
    
}
