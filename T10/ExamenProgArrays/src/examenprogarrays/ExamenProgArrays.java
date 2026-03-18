/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenprogarrays;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ExamenProgArrays {
public static final int FIL = 3;
public static final int COL = 3;
    /**
     * @param args the command line arguments
     */
    //Creamos un vector y llamamos al menu
    public static void main(String[] args) {
        Coche[] parking = new Coche[9];
        menu(parking);
    }

    //Llamada a los metodos de el menu
    public static void menu(Coche[] parking) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n ========MENU OPCIONES=======");
            System.out.println("1. Aparcar coche");
            System.out.println("2. Mostrar plazas libres");
            System.out.println("3. Mostrar datos de coches");
            System.out.println("4. Titulares String");
            System.out.println("5. Buscar por matricula");
            System.out.println("6. Matriz de parking");
            System.out.println("7. Salir");
            System.out.println("===============================");

            System.out.print("Introduce una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    aparcar(parking);
                    break;
                case 2:
                    vacio(parking);
                    break;
                case 3:
                    mostrarCoches(parking);
                    break;
                case 4:

                    break;
                case 5:
                    matriculaBusc(parking);
                    break;
                case 6:
                    
                    break;
                case 7:

                    break;

                default:
                    System.out.println("Introduce un caracter valido");
            }
        } while (opcion != 7);
    }
    //Aparcamos el coche en la posicion que nos pida el usuario introduciendo los datos.
    public static void aparcar(Coche[] parking) {
        Scanner sc = new Scanner(System.in);
        int pos;
        boolean valido = false;

        do {
            System.out.print("Introduce la posicion para aparcar: ");
            pos = sc.nextInt();
            if (parking[pos] == null) {
                parking[pos] = new Coche();
                parking[pos].introDatos();
                valido = true;
            } else {
                System.out.println("Ese aparcamiento esta ocupado");
            }

        } while (valido = false);
    }
    //Mostramos las posiciones vacias.
    public static void vacio(Coche[] parking) {
        int pos;
        System.out.println("Posiciones: ");
        for (int i = 0; i < parking.length; i++) {
            if (parking[i] == null) {
                pos = i;
                System.out.print("Posicion: " + pos);
            }
        }
    }
    //Mostramos los coches que estan rellenos
    public static void mostrarCoches(Coche[] parking) {
        int pos;
        for (int i = 0; i < parking.length; i++) {
            if (parking[i] != null) {
                pos = i;
                System.out.print("Posicion: " + (pos + 1));
                parking[i].mostrarCoches();
            }
        }

    }
    //Buscamos la matricula y ponemos a verdadero encontrado
    public static void matriculaBusc(Coche[] parking) {
        Scanner sc = new Scanner(System.in);
        String buscar;
        boolean encontrado = false;
        int pos;
        System.out.println("Introduce matricula a buscar: ");
        buscar = sc.nextLine();
        

        for (int i = 0; i < parking.length; i++) {
            if (parking[i] != null && buscar.equalsIgnoreCase(parking[i].getMatricula())) {
                System.out.println("Encontrado en: "+(i));
                encontrado = true;
            }

        }
        
        if(encontrado = false){
            System.out.println("No encontrado");
        }

    }
    //Metodo en el que se crea una matriz de caracteres
    public static void tabla(Coche[] parking) {
        char[][] matriz = new char[FIL][COL];
        for (int i = 0; i < FIL; i++) {
            for (int j = 0; j < COL; j++) {
               
            }
        }
        
    }

}
