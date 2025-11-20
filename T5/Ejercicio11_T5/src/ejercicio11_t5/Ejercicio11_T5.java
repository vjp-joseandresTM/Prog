/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11_t5;
import java.util.Scanner;
/**
 *
 * @author DAM
 */
public class Ejercicio11_T5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Numero n1 = new Numero();
       Numero n2 = new Numero();
       
       pedirValores(n1,n2);
       if(n1.getValor()>10){
           int resultado = multiplicar(n1,n2);
           System.out.println("Se ha multiplicado: " + n1.getValor());
           System.out.println("Resultado: " + resultado);
       }else{
           int resultado = sumar(n1, n2);
           System.out.println("Se ha sumado: "+n1.getValor()+ "+" + n2.getValor());
           System.out.println("Resultado = " + resultado);
       }
       
      
    }
     public static int sumar(Numero a, Numero b){
           return a.getValor() + b.getValor();
       }
       
       public static int multiplicar(Numero a , Numero b){
           return a.getValor() * b.getValor();
       }
       
       public static void pedirValores(Numero a, Numero b){
           Scanner sc = new Scanner(System.in);
           
           System.out.println("Introduce el primer numero: ");
           a.setValor(sc.nextInt());
           
           System.out.println("Introduce el primer numero: ");
           b.setValor(sc.nextInt());
       }
}
