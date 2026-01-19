/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7_ej14;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T7_Ej14 {
    public static final int SEM = 4;
    public static final int DIAS = 7;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        int matriz[][] = new int[SEM][DIAS];
        menu(diasSemana, matriz);
        
    }
    
    public static void menu(String[] diasSemana, int [][] matriz){
        int opcion = 0;
        Scanner sc = new Scanner(System.in);   
        do{
            System.out.println("1. Rellenar temperaturas.");
            System.out.println("2. Mostrar temperaturas. ");
            System.out.println("3. Visualizar temperatura media del mes.");
            System.out.println("4. Dia o dias mas calurosos del mes.");
            System.out.println("5. SALIR DEL PROGRAMA.");
            System.out.println("\n "
                    + "Introduce una opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    rellenarTemp(diasSemana, matriz);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
               
            }
            
        }while(opcion != 5);
    }
    
    public static void rellenarTemp(String[] diasSemana, int [][] matriz ){
        for(int i = 0 ; i < SEM; i++){
            for (int j = 0; j < DIAS; j++) {
                matriz[i][j] = (int)(Math.random()*46);
                
            }
        }
    }
    
    public static void mostrarTemp(String[] diasSemana, int [][] matriz){
        
    }
}
