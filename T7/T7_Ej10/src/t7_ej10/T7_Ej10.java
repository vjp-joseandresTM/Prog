/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7_ej10;

/**
 *
 * @author DAM
 */
public class T7_Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = new int[10];
        rellenarArray(numeros);
        mostrarArray(numeros);
        ordenarZero(numeros);
        mostrarArray(numeros);
    }
    
    public static void rellenarArray(int[] numeros){
        for(int i = 0; i<10; i++){
            numeros[i] = (int)(Math.random()*8)+1;
           
        }
    }
    
    public static void mostrarArray(int[] numeros){
        for(int i = 0; i<10;i++){
            System.out.println("Numero: " + numeros[i]);
        }
    }
    
    public static void ordenarZero(int[] numeros){
        for (int i = 0; i < numeros.length; i++) {
            for(int j = i+1; j<numeros.length;j++){
                if(numeros[i]==numeros[j]){
                    numeros[j] = 0;
                }
            }
            
        }
        System.out.println("Ahora Suprimimos y ponemos 0: ");
    }
    
}
