/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t8_ej2;
import java.util.Scanner;
/**
 *
 * @author DAM
 */
public class T8_EJ2 {

    /**
     * @param args the command line arguments
     */
    
    //Metodo principal en el que llamo a los metos y recojo lo que devuelven 
    public static void main(String[] args) {
        int l = longitud();
        int[] numVector = new int[l];
        genAleatorios(numVector);
        mostrarNum(numVector);
    }
    //le pedimos al usuario introducir los numeros de la longitud del array
    public static int longitud(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la longitud del array: ");
        int l = sc.nextInt();
        System.out.println("\n");
        return l;
        
    }
    
    //Generamos los numeros aleatorios dentro de cada  vector
    public static void genAleatorios(int[] numVector){
        for (int i = 0; i < numVector.length; i++) {
            numVector[i] = (int)(Math.random()*7);
        }
    }
    
    //Mostramos con for each los numeros que se han almacenado.
    public static void mostrarNum(int[] numVector){
        
        for(int n:numVector){
            System.out.println(n);
        }
        
    }
    
}
