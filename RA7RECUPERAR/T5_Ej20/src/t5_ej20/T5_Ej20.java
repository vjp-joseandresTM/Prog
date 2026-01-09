/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5_ej20;
import java.util.Scanner;
/**
 *
 * @author DAM
 */
public class T5_Ej20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cuenta cuenta = null;
        int opcion;
        int cantidad;
        
        do{
            
            System.out.println("------MENU BANCO-----");
            System.out.println("1. Crear una cuenta vacia.");
            System.out.println("2. Crear una cuenta con saldo inicial.");
            System.out.println("3. Ingresar dinero.");
            System.out.println("4. Sacar dinero.");
            System.out.println("5. Ver saldo. ");
            System.out.println("6. Salir del programa");
            System.out.println("");
            System.out.println("=======================");
            System.out.println(" SELECCIONE UNA OPCION");
            System.out.println("=======================");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    cuenta = new Cuenta();
                    break;
                case 2:
                    System.out.println("A continuacion se creará una cuenta con un saldo inicial a ingresar.");
                    System.out.println("Introduzca una cifra para ingresar de deposito: ");
                    cantidad = sc.nextInt();
                    cuenta = new Cuenta(cantidad);
                    break;
                case 3:
                    System.out.println("Introduzca la cantidad que desea ingresar: ");
                    cantidad = sc.nextInt();
                    cuenta.ingresar(cantidad);
                    System.out.println("Gracias!!!!!");
                    break;
                case 4:
                    System.out.println("Introduzca la cantidad que desea extraer: ");
                    cantidad = sc.nextInt();
                    cuenta.extraer(cantidad);
                    System.out.println("Gracias!!!!!");
                    break;
                    
                case 5:
                    if(cuenta != null){
                        System.out.println("El saldo es: " + cuenta.getSaldo());
                    }else{
                        System.out.println("No hay ninguna cuenta creada.");
                    }
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opcion no valida, intentalo de nuevo");
            }
        }while(opcion != 6);
    }
    
}
