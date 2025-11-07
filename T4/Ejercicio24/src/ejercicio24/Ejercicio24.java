/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;
import java.util.Scanner;
/**
 *
 * @author DAM
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombreUsuario = nombre();
        int edadUsuario = edad();
        esMayor(edadUsuario, nombreUsuario);
        
    }
    
    public static String nombre(){
     Scanner sc = new Scanner(System.in);
     String nombre;
        System.out.println("Introduce tu nombre: ");
     nombre = sc.nextLine();
     return nombre;
    
    }
    
    public static int edad(){
        Scanner sc = new Scanner(System.in);
        int edad;
        System.out.println("Introduce tu numero: ");
        edad = sc.nextInt();
        return edad;
    }
    
    public static void esMayor(int edad, String nombre){
        if(edad>18){
            System.err.println(nombre +" Te aproximas a la muerte :D");
        }else if (edad>12){
            System.out.println(" Adolescencia, anda con ojo con el kalimotxo, que nos conocemos!!!!!!");
        }else {
            System.out.println(nombre + " Eres casi un feto por lo que puedes hacer todas las maldades que quieras");
        }
        
    }
}
