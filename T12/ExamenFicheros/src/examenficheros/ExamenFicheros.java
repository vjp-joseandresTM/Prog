/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ExamenFicheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaramos el ArrayList y llamamos al menu.
        ArrayList<Producto> lista = new ArrayList<>();
        menu(lista);
    }
    //Menu que llama a los metodos.
    public static void menu(ArrayList<Producto> lista) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Rellenar Inventario.");
            System.out.println("2. Guardar en fichero.");
            System.out.println("3. Leer y procesar datos.");
            System.out.println("4. Salir");
            System.out.print("Introduce una opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    rellenarInv(lista);
                    break;

                case 2:
                    guardarFichero(lista);
                    break;
                case 3:
                    mostrarYProcesar(lista);
                    break;
                case 4:
                    System.out.println("Hasta la proxima...");
                    break;
                default:
                    System.out.println("Opcion invalida, intentelo con otra.");
            }
        } while (opcion != 4);
    }
    //Rellenamos productos mientras el usuario no escriba SI.
    public static void rellenarInv(ArrayList<Producto> lista) {
        Scanner sc = new Scanner(System.in);
        Scanner ssc = new Scanner(System.in);
        boolean salir = false;
        while (salir != true) {

            System.out.print("Introduzca nombre del producto: ");
            String nom = sc.nextLine();
            System.out.print("Introduzca la cantidad: ");
            int cant = sc.nextInt();
            System.out.print("Introduzca el precio: ");
            double pre = sc.nextDouble();

            Producto p = new Producto(nom, cant, pre);
            lista.add(p);

            System.out.println("Quiere dejar de añadir producto? Escriba SI");
            String opSalida = ssc.nextLine();
            if (opSalida.equalsIgnoreCase("SI")) {
                salir = true;

            }
            sc.nextLine();
        }
    }
    //Exportamos a un txt cada objeto de nuestra lista.
    public static void guardarFichero(ArrayList<Producto> lista) {
        FileWriter fw = null;
        PrintWriter pw = null;

        try {
            fw = new FileWriter("inventario.txt", true);
            pw = new PrintWriter(fw);

            for (Producto p : lista) {
                pw.println(p.toString()); //Lo que mandaremos a guardar sera el toString ya que le he dado el formato pedido por el ekjercicio

            }

            System.out.println("Fichero guardad.");

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
    //Mostraremos cada linea que se encuentre en el txt.
    public static void mostrarYProcesar(ArrayList<Producto> lista) {
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader("inventario.txt");
            br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No existe archivo");
        } catch (IOException e) {
            System.out.println("Error");
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el fichero.");
            }
        }
    }

}
