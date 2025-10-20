package ejercicio27;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2;
        int opcion = 0;

        System.out.print("Introduce el primer número: ");
        num1 = sc.nextDouble();
        System.out.print("Introduce el segundo número: ");
        num2 = sc.nextDouble();

        do {
            System.out.println("--- MENÚ ---");
            System.out.println("1. Sumar los números");
            System.out.println("2. Restar los números");
            System.out.println("3. Multiplicar los números");
            System.out.println("4. Dividir los números");
            System.out.println("5. Salir del programa");
            System.out.print("Elige una opción: ");

            try {
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Resultado: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Resultado: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Resultado: " + (num1 * num2));
                        break;
                    case 4:
                        try {
                            if (num2 == 0) {
                                throw new ArithmeticException();
                            }
                            System.out.println("Resultado: " + (num1 / num2));
                        } catch (ArithmeticException e) {
                            System.out.println("Error: No se puede dividir entre 0.");
                        }
                        break;
                    case 5:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida, intenta de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir un número entero.");
                
            }

        } while (opcion != 5);
    }
}
