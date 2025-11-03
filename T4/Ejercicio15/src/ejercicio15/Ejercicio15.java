package ejercicio15;
import java.util.Scanner;/**
 *
 * @author alumno
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int num1 = numeroUno();
      int num2 = numeroDos();
      menuOpciones(num1, num2);
    }
    
    public static int numeroUno(){
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Introduce el primer numero: ");
        numero = sc.nextInt();
        return  numero;
    }
    public static int numeroDos(){
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Introduce el segundo  numero: ");
        numero = sc.nextInt();
        return  numero;
    }
    
    
    
    
    public static void menuOpciones(int num1, int num2){
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("----MENU DE OPCIONES----");
            System.out.println("1.Sumar los numeros");
            System.out.println("2.Restar los numeros");
            System.out.println("3.Multiplicar los numeros");
            System.out.println("4.Dividir los numeros");
            System.out.println("5.Salir del programa");
            
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Elegiste opcion 1");
                    calculos.sumar(num1, num2);
                    break;
                case 2:
                    System.out.println("Elegiste opcion 2");
                    calculos.restar(num1, num2);
                    break;
                case 3:
                    System.out.println("Elegiste opcion 3");
                    calculos.multiplicar(num1, num2);
                    break;
                case 4:
                    System.out.println("Elegiste opcion 4");
                    calculos.dividir(num1, num2);
                    break;
                case 5:
                    System.out.println("Hasta la proxima");
                    break;
                
            }
    
            
        }while (opcion != 5);
        
    }
    

    
}
