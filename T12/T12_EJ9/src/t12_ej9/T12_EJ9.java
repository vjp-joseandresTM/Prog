/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t12_ej9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author alumno
 */
public class T12_EJ9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        leerFichero();
    }

    public static void leerFichero() {
        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw = null;
        PrintWriter pw = null;

        try {
            fr = new FileReader("Normal.txt");
            br = new BufferedReader(fr);
            fw = new FileWriter("fraseinvertida.txt");
            pw = new PrintWriter(fw);
            String linea = br.readLine();
            if (linea != null) {
                linea = invertir(linea);
                pw.println(linea);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: No existe el fichero.");
        } catch (IOException e) {
            System.out.println("Excepcion IO");
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
                if (pw != null) {
                    pw.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar los ficheros.");
            }
        }

    }

    public static String invertir(String texto) {
        String invertida = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            invertida += texto.charAt(i);

        }

        return invertida;
    }
}
