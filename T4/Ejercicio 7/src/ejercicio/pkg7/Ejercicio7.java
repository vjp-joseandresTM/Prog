/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg7;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;//Declaramos las variables
        int num2;
        int num3;
        int num4;
        
        System.out.println("Introduce el primer numero: ");//Le pedimos al usuario que introduzca los numeros.
        num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero: ");
        num2 = sc.nextInt();
        System.out.println("Introduce el tercer numero: ");
        num3 = sc.nextInt();
        System.out.println("Introduce el cuarto numero: ");
        num4 = sc.nextInt();
        Vasos(num1,num2,num3,num4);//Pasamos los datos a Vasos para proceder a operar con ellos.
        
                    
    }
    
    public static void Vasos(int num1, int num2, int num3, int num4){
        int cambio; //Declaro la variabel Cambio la cual jugara como el vaso 
        int i;
        for(i = 1; i<=3; i++){
            if(num1>num2){ //Compienzo a ccmpararr los numeros para reordenarlos .
             cambio = num1;
             num1 = num2;
             num2 = cambio;
            }
            if(num2>num3){
             cambio = num2;
             num2 = num3;
             num3 = cambio;
            }
            if(num3>num4){
             cambio = num3;
             num3 = num4;
             num4 = cambio;
            }
           
        }
         System.out.println("El orden fue " + num1 + "-" + num2 + "-" + num3 + "-" +num4);
       
        
  
    }
}