/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7_ej8;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T7_Ej8 {

    /**
     * @param args the command line arguments
     */
    
    //En el main llamo a los metodos 
    public static void main(String[] args) {
        int[] vector = new int[5];
        int numero = pedirnumero();
        dividirCifras(vector, numero);
        mostrar(vector);
        
       
    }
    
    //Aqui pedimos un numero al usuario y lo retornamos
    public static int pedirnumero(){
        
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        numero = sc.nextInt();
        return numero;
    }
    
    public static void dividirCifras(int[] vector, int numero){
        
        for (int i = 0; i < vector.length; i++) {
            
            vector[i] = numero%10;
            numero = numero/10;
            
        }
    }
    
    public static void mostrar(int[] vector){
        for(int i = 0; i< vector.length ; i++){
            System.out.print(vector[i]);
        }
    }
            
}
