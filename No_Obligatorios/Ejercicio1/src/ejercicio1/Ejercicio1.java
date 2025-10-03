/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author José Andrés Tarrero Méndez
 * Operaciones Aritmeticas
 * @param args the command line arguments
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int dato1; 
     int dato2, resultado;
     
     dato1 = 20;
     dato2 = 10;
     
     //Suma
      resultado = dato1 + dato2;
      System.out.print(dato1 + "+" + dato2 + "=" + resultado);
      
     //Resta
     resultado = dato1 - dato2;
     System.out.println(dato1 + "-" + dato2 + "=" + resultado);
     
     //Producto
     resultado = dato1 * dato2;
     System.out.println(dato1 + "*" + dato2 + "=" + resultado);
     
     //Cociente
     resultado = dato1 / dato2;
     System.out.println(dato1 + "/" + dato2 + "=" + resultado);
    }
    
}
