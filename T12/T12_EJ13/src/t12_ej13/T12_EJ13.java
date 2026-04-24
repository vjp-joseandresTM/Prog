/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t12_ej13;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author DAM
 */
public class T12_EJ13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("===== REGISTRO DE BECARIOS =====");
        String registro = pedirDatos();
         guardarEnFichero(registro); 
    }

    public static String pedirDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce nombre + apellidos: ");
        String nombre = sc.nextLine();
        System.out.print("Sexo (H-M): ");
        String sexo = sc.nextLine();
        System.out.print("Edad (20-60): ");
        int edad = pedirEdad();
        System.out.print("Numero de suspensos (0-4):  ");
        int notas = sc.nextInt();
        sc.nextLine();
        System.out.print("Residencia familiar (SI-NO): ");
        String residencia = sc.nextLine();
        System.out.print("Ingresos anuales de la familia: ");
        double ingresos = Double.parseDouble(sc.nextLine());
        return nombre + ";" + sexo + ";" + edad + ";" + notas + ";" + residencia + ";" + ingresos;
    }

    public static int pedirEdad() {
        boolean valido = false;
        Scanner sc = new Scanner(System.in);
        int edadP = 0;
        while (!valido) {

            edadP = sc.nextInt();
            if (edadP >= 20 && edadP <= 60) {
                valido = true;
            } else {
                System.out.println("La edad debe estar en el rango.");
            }

        }
        return edadP;
    }

    public static void guardarEnFichero(String cadena) {
        FileWriter fw = null;
        PrintWriter pw = null;

        try {
            fw = new FileWriter("DatosBeca.txt", true);
            pw = new PrintWriter(fw);

            pw.println(cadena);
        } catch (IOException e) {
            System.out.println("Error");
        } finally {
            try {
                if (pw != null) {
                    pw.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el fichero.");
            }
        }
    }
}
