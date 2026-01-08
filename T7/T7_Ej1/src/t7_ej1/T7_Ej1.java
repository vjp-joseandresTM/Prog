/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7_ej1;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T7_Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = new int[10];
        rellenaVector(numeros);
        mostrarVector(numeros);
    }
    
    public static void rellenaVector(int[] numeros){
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("===Rellena los numeros=== ");
        
        for (i = 0; i < 10; i++){
            System.out.print("Introduce un numero: ");
            numeros[i] = sc.nextInt();
        }
    }
    
    public static void mostrarVector(int[] numeros){
        int i;
        for(i = 0; i<10; i++){
            if(numeros[i] % 2 == 0){
                System.out.println(numeros[i]);
            }
        }
    }

    
    
}
