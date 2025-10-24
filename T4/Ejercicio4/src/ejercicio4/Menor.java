/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author alumno
 */
public class Menor {
    public static void comparador(int num1,int num2, int num3){
        int menor = 0;
        if(num1<=num2 && num1<=num3){
            menor = num1;
            System.out.println("El numero menor es el "+ menor);
        }else if (num2 <= num1 && num2<=num3){
            menor = num2;
            System.out.println("El numero menor es el "+ menor);
            
        }else{
            menor = num3;
            System.out.println("El numero menor es el" + menor);
        }

    }
}
