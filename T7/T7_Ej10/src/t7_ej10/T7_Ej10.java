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
    
   //Llamo a los metodos, y declaro una variable.
    public static void main(String[] args) {
        int[] numeros = new int[10];
        rellenarArray(numeros);
        mostrarArray(numeros);
        ordenarZero(numeros);
        mostrarArray(numeros);
    }
    //Aqui el metodo rellena el array con numeros aleatorios usando el Math.random.
    public static void rellenarArray(int[] numeros){
        for(int i = 0; i<10; i++){
            numeros[i] = (int)(Math.random()*8)+1;
           
        }
    }
    //El metodo recorre los indices del array y muestra el contenido de los dichos.
    public static void mostrarArray(int[] numeros){
        for(int i = 0; i<10;i++){
            System.out.println("Numero: " + numeros[i]);
        }
    }
    //Me ayduo en este metodo de dos For para comprobar cual esta repetido y posteriormente suprimo el 0.
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
