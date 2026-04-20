/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escaperoom2;

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
public class EscapeRoom2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileWriter fw = null;
        PrintWriter pw = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            System.out.println("Dentro del try");
            fr = new FileReader("datos_empleados.txt");
            System.out.println("Despues de fr");
            br = new BufferedReader(fr);
            System.out.println("Despues de br");
            fw = new FileWriter("sospechosos_zona_cero.txt");
            System.out.println("Despues de pw");
            pw = new PrintWriter(fw);

            String linea = br.readLine();
            int contador = 0;

            while (linea != null) {
                System.out.println("Dentro de while");
                if (linea.contains("Zona Cero")) {
                    System.out.println("Dentro de if");
                    pw.println(linea);
                    contador++;
                }

                linea = br.readLine();
            }
            System.out.println("Contador: " + contador);

            br.close();
            fr.close();
            pw.close();
            fw.close();

        } catch (FileNotFoundException e) {
            System.out.println("ERRRO");
        } catch (IOException e) {
            System.out.println("error");

        }
    }

}
