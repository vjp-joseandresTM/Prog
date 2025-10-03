/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora.avanzada;

/**
 *
 * @author JoseTarrero
 */
    import java.util.Scanner;
public class CalculadoraAvanzada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer digito: ");
        double a = Double.parseDouble(sc.nextLine());
        
        System.out.print("Introduce el segundo digito: ");
        double b = Double.parseDouble(sc.nextLine());
        double suma = a + b;
        System.out.println("Resultado: " + suma);
        sc.close();
        
        System.out.print("GRACIAS POR USAR");
        // TODO code application logic here
    }
    
}
