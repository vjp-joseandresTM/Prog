/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int numero1;
       int numero2;
       int numero3;
       int esMayor;
       
       System.out.println("Introduzca el primer numero: ");
       numero1 = sc.nextInt();
       
       System.out.println("Introduzca el segundo numero: ");
       numero2 = sc.nextInt();
       
       System.out.println("Introduzca el tercer numero: ");
       numero3 = sc.nextInt();
       
       esMayor = numero1;
       
       if(numero2>esMayor){
        esMayor = numero2;
       } if (numero3>esMayor){ 
        esMayor = numero3;
       
    }
    
        System.out.println("El numero mas grande es " + esMayor);
}
}