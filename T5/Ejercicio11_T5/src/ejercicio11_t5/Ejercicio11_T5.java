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
       Numero n1 = new Numero(); //Creamos nuevos objetos partiendo de Numero
       Numero n2 = new Numero();
       
       pedirValores(n1,n2); //Llamamos a pedirValores, este dara a valor un valor propiamente, este introducido por el usuario.
       
       //Si el numero 1 introducido es  mayor que 10 multiplicaremos los dos valores
       if(n1.getValor()>10){
           int resultado = multiplicar(n1,n2);
           System.out.println("Se ha multiplicado: " + n1.getValor());
           System.out.println("Resultado: " + resultado);
       }else{//Si el valor no es mayor que 10 se suman
           int resultado = sumar(n1, n2);
           System.out.println("Se ha sumado: "+n1.getValor()+ "+" + n2.getValor());
           System.out.println("Resultado = " + resultado);
       }
       
      
    }
    
        //Aqui es donde sumamos los valores para luego ser tomado por el if else
     public static int sumar(Numero a, Numero b){
           return a.getValor() + b.getValor();
       }
        //Lo mismo la multiplicacion
       public static int multiplicar(Numero a , Numero b){
           return a.getValor() * b.getValor();
       }
        //Aqui es donde se piden los valores.
       public static void pedirValores(Numero a, Numero b){
           Scanner sc = new Scanner(System.in);
           
           System.out.println("Introduce el primer numero: ");
           a.setValor(sc.nextInt());
           
           System.out.println("Introduce el primer numero: ");
           b.setValor(sc.nextInt());
       }
}
