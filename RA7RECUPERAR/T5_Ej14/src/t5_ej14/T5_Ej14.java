/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5_ej14;
import java.util.Scanner;
/**
 *
 * @author DAM
 */
public class T5_Ej14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numero;
        int multiplicando = 0;
        int resultado = 0;
        System.out.println("Introduce el numero para obtener su tabla: ");
        numero = sc.nextInt();
        
        Tablas t = new Tablas(numero, multiplicando, resultado);
        t.operacion();
    }
    
}
