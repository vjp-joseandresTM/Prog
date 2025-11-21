/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12_t5;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author DAM
 */
public class Ejercicio12_T5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Catetos c1 = new Catetos();
        Catetos c2 = new Catetos();
        double cat1 = pedirNum();
        c1.setCateto1(cat1);
        double cat2 = pedirNum();
        c2.setCateto2(cat2);
         mostrarHipotenusa();
    }
    
    public static double pedirNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un num: ");
        return sc.nextDouble();
    }
    
    public static double hipotenusa(double cat1, double cat2){
        double resultado = cat1 + cat2;
        return resultado;
    }
    
    public static void mostrarHipotenusa(double resultado){
        System.out.println("La hipotenusa fue: "+ resultado);
    }
}
