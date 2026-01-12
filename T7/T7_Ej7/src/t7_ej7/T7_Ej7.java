/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7_ej7;
import java.util.Arrays;
/**
 *
 * @author DAM
 */
public class T7_Ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int[] numeros = new int[15]; 
     genNumeros(numeros);
        ordenar(numeros);
    }
    
    public static void genNumeros(int[] numero){
        for(int i = 0; i<15; i++){
           numero[i] = (int)(Math.random()*50);
        }
    }
    
    public static void ordenar(int[] numero){
        Arrays.sort(numero);
        System.out.println(numero); 
    }
}
