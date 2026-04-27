/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t12_ej14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author DAM
 */
public class T12_EJ14 {

    /**
     * @param args the command line arguments
     */
    //Llamamos al metodo 
    public static void main(String[] args) {
        System.out.println(" ===== CÁLCULO DE BECAS =====");
        leerYCalcularBecas("DatosBeca.txt");
    }

    public static void leerYCalcularBecas(String nombreFichero) {
        FileReader fr = null;
        BufferedReader br = null;
        //Creamos los FileReader y BufferedReader
        try {
            fr = new FileReader(nombreFichero);
            br = new BufferedReader(fr);
            String linea;
            //Creamos un array para dividir los datos y poder tratarlos
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");
                String nombre = datos[0];
                String sexo = datos[1];
                int edad = Integer.parseInt(datos[2]);
                int suspensos = Integer.parseInt(datos[3]);
                String residencia = datos[4];
                double ingresos = Double.parseDouble(datos[5]);

                double beca = calcularBeca(edad, suspensos, residencia, ingresos);

                //Si la beca es mayot que 0 se muestran los datos de beca
                if (beca > 0) {
                    System.out.println("Becario: " + nombre);
                    System.out.println("Cuantía total: " + beca + " €");
                    System.out.println("----------------------------------");
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero.");
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el fichero.");
            }
        }
    }
    
    
    public static double calcularBeca(int edad, int suspensos, String residencia, double ingresos) {
        if (suspensos >= 2) {
            return 0; //Si tiene 2 o mas suspensas no hay beca
        }

        double total = 1500;
        //Comprobamos requisitos y sumamos cuantias.
        if (ingresos <= 12000) {
            total += 500;
        }

        if (edad < 23) {
            total += 200;
        }

        if (suspensos == 0) {
            total += 500;
        } else if (suspensos == 1) {
            total += 200;
        }

        if (residencia.equalsIgnoreCase("NO")) {
            total += 1000;
        }

        return total;
    }

}
