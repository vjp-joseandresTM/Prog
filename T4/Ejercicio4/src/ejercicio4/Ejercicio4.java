/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        
        System.out.println("Introduce el primer numero: ");
        num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero: ");
        num2 = sc.nextInt();
        System.out.println("Introduce el tercer numero :");
        num3 = sc.nextInt();
        
        Menor.comparador(num1, num2, num3);
    }
    
}
