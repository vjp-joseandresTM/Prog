/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32;
import java.util.Scanner;
/**
 *
 * @author DAM
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //Año actual
         System.out.print("Introduzca el año actual: ");
        int anioActual = sc.nextInt();
        System.out.print("Introduzca el mes actual: ");
        int mesActual = sc.nextInt();
        System.out.print("Introduzca el día actual: ");
        int diaActual = sc.nextInt();

        // Fecha de nacimiento
        System.out.print("Ahora, introduzca su año de nacimiento: ");
        int anioNacimiento = sc.nextInt();
        System.out.print("Introduzca su mes de nacimiento: ");
        int mesNacimiento = sc.nextInt();
        System.out.print("Por último introduzca su día de nacimiento: ");
        int diaNacimiento = sc.nextInt();

        // Inicializar años, meses y días
        int años = anioActual - anioNacimiento;
        int meses = mesActual - mesNacimiento;
        int dias = diaActual - diaNacimiento;

        // Ajustar días
        if (dias < 0) {
            meses--; // se pide prestado un mes
            dias += 30; // aproximamos todos los meses a 30 días para simplificar
        }

        // Ajustar meses
        if (meses < 0) {
            años--;
            meses += 12;
        }

        System.out.println("Su edad exacta es de " + años + " años, " + meses + " meses y " + dias + " días.");

        sc.close();
    }
    
}
