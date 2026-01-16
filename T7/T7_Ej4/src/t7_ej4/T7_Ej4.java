/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7_ej4;

/**
 *
 * @author alumno
 */
public class T7_Ej4 {
    //Las constantes me sirven para hacer el programa mas maleable y asignan los valores del array en la matriz.
    public final static int FIL = 4;
    public final static int COL = 3;

    /**
     * @param args the command line arguments
     */
    //Llamada a los metodos y declaracion de las variables.
    public static void main(String[] args) {
        int[][] matriz = new int[FIL][COL];
        generar(matriz);
        paresMostrar(matriz);
        
    }
    //Generamos los numeros aleatorios de la matriz.
    public static void generar(int[][] matriz) {
        for (int i = 0; i < FIL; i++) {
            for (int j = 0; j < COL; j++) {
                matriz[i][j] = (int) (Math.random() * 101) + 100;

            }
        }
    }
    //Imprimimos solo los valores que sean pares obtenidos del metodo generar.
    public static void paresMostrar(int [][] matriz){
        for (int i = 0; i < FIL; i++) {
            for (int j = 0; j < COL; j++) {
                if(matriz[i][j]%2 == 0){
                    System.out.print("["+matriz[i][j] + "]");
                    
                }
            }
        }
    }
}
