/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7_ej6;

/**
 *
 * @author DAM
 */
public class T7_Ej6 {

    /**
     * OJO EN EL EJERCICIO SE MUESTRA TAMBIEN 1 POR LO QUE YO LO HE AÑADIDO TAMBIEN PESE A 
     * NO SER CONSIDERADO PRIMO.
     */
    
    //Se encarga de crear las variables y llamar a los metodos.
    public static void main(String[] args) {
        int[] primos = new int[80];
        int contador = 0;
        int numero = 1;
        
        primos(primos, contador, numero);
    }
    //Rellena el array con los numeros primos llamando a un metodo que comprueba si son primos.
    public static void primos(int[] primos, int contador, int numero){
        while(contador<80){
          if(esPrimo(numero)){
              primos[contador] = numero;
              contador++;
          }  
          numero++;
        }
        
        for (int i = 0; i < primos.length; i++) { // Tambien los imprime por pantalla
            System.out.println((i+1) + "- " + primos[i]);
        }
    }
    
    //Metodo dedicado a hacer la comprobacion de los numeros primos.
    public static boolean esPrimo(int numero){

        for(int i = 2; i <= Math.sqrt(numero);i++){
            if(numero % i == 0){
                return false;
            }
        }
        return true;
    }

    
}
