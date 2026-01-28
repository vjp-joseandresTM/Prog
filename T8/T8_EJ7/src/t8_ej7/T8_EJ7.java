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
    public static void main(String[] args) {

        Dia[] dias = new Dia[30];
        String[] diasSemana = {
            "Lunes", "Martes", "Miércoles", "Jueves",
            "Viernes", "Sábado", "Domingo"
        };
        menu();

    }

    public static void menu() {
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
                    
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Gracias por usar el programa, saliendo...");
                    break;
                default:
                    System.out.println("Elige otra opcion.");
            }
        } while (opcion != 5);
    }
    
    public static void randTemp(Dia[] dias){
        int nombDia = (int)(Math.random()*8);
        
        for (int i = 0; i < dias.length; i++) {
        
        int temp = (int) (Math.random() * 41); // 0 a 40 grados
        dias[i].setTemperatura(temp);
        
        }
    }
}
