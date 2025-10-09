
package ejercicio4;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  
    
    int numero1;
    int numero2;
    int numero3;
    int menor;
    
    System.out.println("Introduce el primer numero");
        numero1 = sc.nextInt();
        
    System.out.println("Introduce el primer numero");
        numero2 = sc.nextInt();
        
    System.out.println("Introduce el primer numero");
        numero3 = sc.nextInt();
    
    menor = numero1;
    
    if(numero2<menor){
        menor = numero2;
        
    } if(numero3<menor){
        menor = numero3;
    
    }
    System.out.println("El mas pequeño es: " + menor);
    
}
}
