/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simexamen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author DAM
 */
public class SIMEXAMEN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        guardar();
        mostrar();
    }

    public static void guardar() {
        FileWriter fw = null;
        PrintWriter pw = null;
        Scanner sc = new Scanner(System.in);
        try {
            fw = new FileWriter("lista.txt", true);
            pw = new PrintWriter(fw);
            System.out.print("Ingrese el nombre a guardar: ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese la edad: ");
            int edad = sc.nextInt();

            pw.println(nombre + ":" + edad);
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

    public static void mostrar() {
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader("lista.txt");
            br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
            }

        }
    }

}
