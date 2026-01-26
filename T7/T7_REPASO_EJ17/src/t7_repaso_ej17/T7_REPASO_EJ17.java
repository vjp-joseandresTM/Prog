/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7_repaso_ej17;

/**
 *
 * @author DAM
 */
public class T7_REPASO_EJ17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = new int[10];
        genNum(numeros);
        mostrador(numeros);
        organizador(numeros);
        mostrador(numeros);
    }
    
    public static void genNum(int[] numeros){
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random()*10);
        }
 
    }
    
    public static void mostrador(int[] numeros){
        System.out.println("Numeros desordenados: ");
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] == numeros[9]){
                System.out.print(numeros[i]);
            }else{
                System.out.print(numeros[i]+", ");
            }
        }
        System.out.println("\n");
    }
    
    public static void organizador(int[] numeros){
        
        for (int i = 0; i < numeros.length; i++) {
            for(int j = 0; j < numeros.length - 1;j++){
                if(numeros[j]>numeros[j+1]){
                    int aux = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = aux;
                }
            }
        }
    }
    
}
