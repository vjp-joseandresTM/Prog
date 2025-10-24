/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contenedorcalculos;

/**
 *
 * @author alumno
 */
public class Calculador {
    public static void paroimpar(int numero){
        if (numero % 2 == 0) {//Comprobamos si el resto de la division es 0 por lo que seria par
            System.out.println("El numero es par ");
       
        }else{//Si la operacion anterior determina que es una cifra diferente a 0 es inpar.
            System.out.println("El numero resulta ser impar");
        }
    }
}
