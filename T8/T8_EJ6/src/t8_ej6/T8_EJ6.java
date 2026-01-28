/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t8_ej6;
import java.util.Scanner;
/**
 *
 * @author DAM
 */
public class T8_EJ6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Introduccion de numero de empleados que se van a "Fichar"
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos empleados desea ingresar? ");
        int cantidad = sc.nextInt();
        sc.nextLine();
        Empleados[] empleados = new Empleados[cantidad];
        
        //Bucle que crea a los empleados
        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nEmpleado " + (i + 1));
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Horas trabajadas: ");
            int horas = sc.nextInt();
            System.out.print("Tarifa por hora: ");
            double tarifa = sc.nextDouble();
            sc.nextLine();
            empleados[i] = new Empleados(nombre, horas, tarifa);
        }
        //Mostrar los empleados creados
        System.out.println("\n--- Sueldos Brutos ---");
        for (Empleados e : empleados) {
            e.mostrarDatos();
        }
       
    }

}
