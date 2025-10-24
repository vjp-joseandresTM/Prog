/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;
import java.util.Scanner;

/**
 *
 * @author DAM
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
        int num1;
        int num2;
        int resultado;
        
      System.out.println("introduce un numero");
        num1 = sc.nextInt();
      System.out.println("introduce un numero");
        num2 = sc.nextInt();
        
      if(num1 > 10){
         secundario.multiplicar(num1, num2); //Llama al fichero de clase secundario y usa el metodo de multiplicar sustituyendo sus variables (Las de la calse secundario) por las de este.
         
      }else{
         secundario.sumar(num1, num2); //Llama al fichero de clase secundario y usa el metodo de sumar sustituyendo sus variables (Las de la calse secundario) por las de este.
         
      }
       
       
        
    }
    
}
