/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t12_ej6;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author DAM
 */
public class T12_EJ6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = new int[100];//Creacion del array
        for (int i = 0; i < 100; i++) {//Rellenamos el array con numeros pares
            numeros[i] = i * 2;
        }
        impresora(numeros);
        mostrarFichero();
    }
    //Meotddo que vuelca el array en el fichero
    public static void impresora(int numeros[]) {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = null;
        PrintWriter pw = null;

        System.out.print("Introduce el nombre para guardar el fichero: ");
        String nombre = sc.nextLine();
        nombre = nombre + ".txt";
        File archivo = new File(nombre);
        try {
            if (archivo.createNewFile()) {
                fw = new FileWriter(nombre);
                pw = new PrintWriter(fw);

                for (int i = 0; i < 100; i++) {
                    pw.println(numeros[i]);
                }
                System.out.println("Fichero creado correctamente: " + archivo.getName());
            } else {
                System.out.println("El fichero ya se encuentra creado previamente");
            }

        } catch (Exception e) {
            System.out.println("ERROR AL CREAR UN FICHERO ");
        } finally {
            try {
                if (pw != null) {
                    pw.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (Exception e) {
                System.out.println("ERROR AL CERRAR EL FICHERO");
            }
        }

    }
    //Metodo que lee el fichero
    public static void mostrarFichero() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nombre del fichero que quiere leer: ");
        String nombre = sc.nextLine();
        nombre = nombre + ".txt";

        try {
            File archivo = new File(nombre);
            Scanner lector = new Scanner(archivo);

            System.out.println("\nContenido del fichero:");
            while (lector.hasNextLine()) {
                System.out.println(lector.nextLine());
            }

            lector.close();

        } catch (Exception e) {
            System.out.println("ERROR al leer el fichero.");
        }
    }

}
