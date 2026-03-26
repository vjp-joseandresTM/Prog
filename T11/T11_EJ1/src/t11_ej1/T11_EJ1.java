/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t11_ej1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author DAM
 */
public class T11_EJ1 {

    /**
     * @param args the command line arguments
     */
    public static final int POS = 31;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Mapa donde se guardan las temperaturas del mes
        Map<Integer, Dia> temperaturas = new HashMap<>();

        // Array con los nombres de los días de la semana
        String[] diaSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

        int opcion;

        do {
            System.out.println("\n===== MENÚ =====");
            System.out.println("1. Rellenar las temperaturas");
            System.out.println("2. Mostrar las temperaturas");
            System.out.println("3. Mostrar la temperatura media del mes");
            System.out.println("4. Día/días más calurosos del mes");
            System.out.println("5. Salir");
            System.out.print("Introduce una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    rellenarTemperaturas(temperaturas, diaSemana);
                case 2:
                    mostrarTemperaturas(temperaturas);
                case 3:
                    temperaturaMedia(temperaturas);
                case 4:
                    diaMasCaluroso(temperaturas);
                case 5:
                    System.out.println("Saliendo del programa...");
                default:
                    System.out.println("Opción invalida, inserta otra.");
            }

        } while (opcion != 5);
    }

    public static void rellenarTemperaturas(Map<Integer, Dia> mapa, String[] diaSemana) {

        System.out.println();
        mapa.clear(); // Limpia el mapa antes de rellenarlo

        int diaInicial = (int) (Math.random() * 7);

        for (int i = 0; i < POS; i++) {

            int temperatura = (int) (Math.random() * 41);

            mapa.put(i, new Dia(diaSemana[diaInicial], temperatura));

            diaInicial++;
            if (diaInicial == 7) {
                diaInicial = 0;
            }
        }

        System.out.println("Temperaturas generadas correctamente.");
    }

    public static void mostrarTemperaturas(Map<Integer, Dia> mapa) {

        System.out.println();

        if (mapa.isEmpty()) {
            System.out.println("Aún no se han generado las temperaturas.");
            return;
        }

        System.out.println("===== TEMPERATURAS =====");

        for (int i = 0; i < mapa.size(); i++) {
            Dia d = mapa.get(i);
            System.out.println(d.getNombreDia() + " día " + (i + 1) + ": " + d.getTemperatura() + "ºC");
        }
    }

    public static void temperaturaMedia(Map<Integer, Dia> mapa) {

        System.out.println();

        if (mapa.isEmpty()) {
            System.out.println("Aun no hay temperaturas insertadas.");
            return;
        }

        int suma = 0;

        for (int i = 0; i < mapa.size(); i++) {
            suma += mapa.get(i).getTemperatura();
        }

        float media = (float) suma / mapa.size();

        System.out.println("La temperatura media del mes es: " + media + "ºC");
    }

    public static void diaMasCaluroso(Map<Integer, Dia> mapa) {

        System.out.println();

        if (mapa.isEmpty()) {
            System.out.println("Aun hay temperaturas.");
            return;
        }

        int max = mapa.get(0).getTemperatura();

        // Buscar la temperatura máxima
        for (int i = 0; i < mapa.size(); i++) {
            if (mapa.get(i).getTemperatura() > max) {
                max = mapa.get(i).getTemperatura();
            }
        }

        System.out.println("El día o días más calurosos fueron: " + max + "ºC");

        // Mostrar los días que tienen esa temperatura
        for (int i = 0; i < mapa.size(); i++) {
            if (mapa.get(i).getTemperatura() == max) {
                System.out.println(" - " + mapa.get(i).getNombreDia() + " día " + (i + 1));
            }
        }
    }
}
