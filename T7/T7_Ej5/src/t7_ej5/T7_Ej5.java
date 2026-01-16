/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7_ej5;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T7_Ej5 {
    //Declaramos constantes con el tamaño de 
    public final static int FIL = 4; 
    public final static int COL = 2;

    /**
     * @param args the command line arguments
     */
    //Creamos la variable y llamamos a los metodos
    public static void main(String[] args) {
        int[][] matriz = new int[FIL][COL];
        numsIntro(matriz);
        mostrar(matriz);
        mayor(matriz);
        menor(matriz);
        System.out.print("\n");
        suma(matriz);
    }
    //Metodo que pide al usuario los numeros
    public static void numsIntro(int[][]matriz){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los numeros:");
        for (int i = 0; i < FIL; i++) {
            for (int j = 0; j < COL; j++) {
                System.out.print("Posicion a introducir: "+ i + j+ "-->" );
                matriz[i][j] = sc.nextInt();
            }
        }
    }
    
  
    //Muestra el array 
    public static void mostrar(int[][] matriz){
        for (int i = 0; i < FIL; i++) {
            for (int j = 0; j < COL; j++) {
                System.out.print("["+ i + j +"]-->"+matriz[i][j]);
            }
        }
    }
    //Busca cual es el numero mayor de los introducidos
    public static void mayor(int[][] matriz) {
        int mayor = matriz[0][0];
        for (int i = 0; i < FIL; i++) {
            for (int j = 0; j < COL; j++) {
                if (mayor < matriz[i][j]) {
                    mayor = matriz[i][j];

                }

            }

        }

        System.out.println("El mayor es: " + mayor);

    }
    //Busca el  menor de todos
    public static void menor(int[][] matriz) {
        int menor = matriz[0][0];
        for (int i = 0; i < FIL; i++) {
            for (int j = 0; j < COL; j++) {
                if (menor > matriz[i][j]) {
                    menor = matriz[i][j];

                }

            }

        }

        System.out.println("El menor es: " + menor);

    }
    //Suma los numeros de la matriz y muestra
    public static void suma(int [][] matriz){
        int suma = 0;
        for (int i = 0; i < FIL; i++) {
            for (int j = 0; j < COL; j++) {
              suma = suma + matriz[i][j];
            }
        }
        System.out.println("La suma de los numerines es de: "+ suma);
    }

}
