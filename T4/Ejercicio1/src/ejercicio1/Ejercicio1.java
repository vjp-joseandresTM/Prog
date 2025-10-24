/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;
import java.util.Scanner;


public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void lector(int numero){
        if(numero > 0){  //Compara el numero si es mayor que 0
         System.out.println("El número es positivo.");  //Es positivo  
         
        }else if(numero < 0){ //si es menor que 0
         System.out.println("El número es negativo.");//Es negativo
        }else{//Si no cumple ninguno de los otros 2
         System.out.println("El número es 0.");// No queda mas que ser 0
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        System.out.print("Introduce el primer número: ");//Pedimos que se meta un numero
        num1 = sc.nextInt();
        lector(num1);//Llamamos al metodo lector 
    }
    
}
