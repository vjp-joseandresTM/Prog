/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5_ej9;
import java.util.Scanner;
/**
 *
 * @author DAM
 */
public class T5_Ej9 {

    /**
     * @param args the command line arguments
     */
    //En el main llamo a los metodos 
    public static void main(String[] args) {
        int numero = pedirnumero();
        int cifras = calcCifras(numero);
        int[] vector = new int[cifras];
        
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
    //Calculamos las cifras que tiene ese numero 
    public static int calcCifras(int numero){
        int contador = 0;
       
        do{
          numero = numero/10;
          contador++;
        }while(numero > 0);
        return contador;
    }
    //Cojemos el numero y lo dividimos en cifras
    public static void dividirCifras(int[] vector, int numero){
        
        for (int i = 0; i < vector.length; i++) {
            
            vector[i] = numero%10;
            numero = numero/10;
            
        }
    }
    //Mostramos los numeros 
    
    public static void mostrar(int[] vector){
        for(int i = 0; i< vector.length ; i++){
            System.out.print(vector[i]);
        }
    }
    
}
