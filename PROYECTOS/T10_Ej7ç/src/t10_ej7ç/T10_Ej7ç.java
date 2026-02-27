/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t10_ej7ç;

import java.util.ArrayList;
import java.util.Scanner;

public class T10_Ej7ç {

    public static void main(String[] args) {
       ArrayList<ArrayList<Integer>> temperaturas = new ArrayList<>();
       String[] semana = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
    }

    public static void menu(ArrayList<ArrayList<Integer>> temperaturas) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do { 
            System.out.println("1.Rellenar las temperaturas");
            System.out.println("2.Mostrar las temperaturas");
            System.out.println("3.Visualizar las temperaturas medias del mes");
            System.out.println("4.Dia o dias mas calurosos del mes.");
            System.out.println("5.Salir del programa.");
            System.out.println("\n Introduce una opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                   
                default:
                    throw new AssertionError();
            }
        } while (opcion != 5);
       
    }
    
    public static void rellenarTemperaturas(ArrayList<ArrayList<Integer>> temperatura){
        Scanner sc = new Scanner(System.in);
        int temper;
        for(int semana = 0; semana<4; semana++){
            ArrayList<Integer>semanaTem = new ArrayList<>();
            System.out.println("\n SEMANA "+ (semana+1));
            for(int dia = 0; dia<7;dia++ ){
                temper = sc.nextInt();
            }
        }
    }
    
    
}

