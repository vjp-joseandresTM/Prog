/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t8_ej7;

import java.util.Scanner;

/**
 *
 * @author DAM
 */
public class T8_EJ7 {

    /**
     * @param args the command line arguments
     */
    //Metodo main el cual crea el objeto con un array, posteriormete llama al menú
    public static void main(String[] args) {

        Dia[] dias = new Dia[30];

        menu(dias);

    }
    //Menú con las opciones que llama a los metodos.
    public static void menu(Dia[] dias) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("1.Rellanar temperaturas.");
            System.out.println("2.Mostrar dias.");
            System.out.println("3.Media de temperaturas.");
            System.out.println("4.Dia o dias mas calurosos.");
            System.out.println("5.Salir del programa.");
            System.out.println("\n");
            System.out.print("Introduce una opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    randTemp(dias);
                    break;
                case 2:
                    mostrarTemp(dias);
                    break;
                case 3:
                    mediaTemp(dias);
                    break;
                case 4:
                    masAlto(dias);
                    break;
                case 5:
                    System.out.println("Gracias por usar el programa, saliendo...");
                    break;
                default:
                    System.out.println("Elige otra opcion.");
            }
        } while (opcion != 5);
    }
    //Metodo que genera las temperaturas de los dias añadiendo los nombres de los dias.
    public static void randTemp(Dia[] dias) {

        String[] diasSemana = {
            "Lunes", "Martes", "Miércoles", "Jueves",
            "Viernes", "Sábado", "Domingo"
        };

        int diaInicio = (int) (Math.random() * 7);

        for (int i = 0; i < dias.length; i++) {

            int temp = (int) (Math.random() * 41);
            String nombreDia = diasSemana[(diaInicio + i) % 7];

            dias[i] = new Dia(nombreDia, temp);
        }
    }
    //Mostrar los dias de las semana que se rellenaron antes.
    public static void mostrarTemp(Dia[] dias) {

        for (int i = 0; i < dias.length; i++) {
            if (dias[i] != null) {
                System.out.println(dias[i].getNombreDia() + " día " + (i + 1) + ": " + dias[i].getTemperatura() + " grados.");
            }
        }
    }
    //Mostrar media de la temperatura del mes.
    public static void mediaTemp(Dia[] dias) {
        int suma = 0;
        for (int i = 0; i < dias.length; i++) {

            suma += dias[i].getTemperatura();

        }

        int media = suma / dias.length;

        System.out.println("La media de la temperatura del mes fue: " + media + " º ");
    }
    //Temperatura mas alta del mes o dias con la temperatura mas alta.
    public static void masAlto(Dia[] dias) {
        Dia aux;
        for (int i = 0; i < dias.length - 1; i++) {
            for (int j = 0; j < dias.length - 1; j++) {
                if (dias[i].getTemperatura() > dias[j + 1].getTemperatura()) {
                    aux = dias[j];
                    dias[j] = dias[j + 1];
                    dias[j + 1] = aux;
                }
            }
        }
        int max = dias[dias.length - 1].getTemperatura();
        for (int i = 0; i < dias.length; i++) {
            if (dias[i].getTemperatura() == max) {
                System.out.println(
                        dias[i].getNombreDia() + " día " + (i + 1)
                        + " con " + max + " grados"
                );
            }
        }
    }
}
