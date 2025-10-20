/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio31;

/**
 *
 * @author DAM
 */
public class Ejercicio31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aleatorio;
        int contador = 0;
        int impares = 0;
        int imp1 = 0, imp2 = 0, imp3 = 0;
        
        while(impares < 3){
            aleatorio = (int) Math.floor((Math.random()*100+1));
            contador++;
         
            if(aleatorio % 2 != 0){
               impares++;
               if(impares == 1) imp1 = aleatorio;
               else if (impares == 2) imp2 = aleatorio;
               else if (impares == 3) imp3 = aleatorio;
               
               
            }
        }
        
        System.out.println("Números impares generados: " + imp1 + ", " + imp2 + ", " + imp3);
        System.out.println("Total de números generados: " + contador);
    }
    
}
