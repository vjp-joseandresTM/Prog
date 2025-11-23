/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio19_t5;
import java.util.Scanner;
/**
 *
 * @author DAM
 */
public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // EMPLEADO 1
        System.out.println("Introduce los datos del empleado 1");
        System.out.print("Nombre: ");
        String nombre1 = sc.nextLine();
        System.out.print("Horas trabajadas: ");
        int horas1 = Integer.parseInt(sc.nextLine());
        System.out.print("Tarifa por hora: ");
        double tarifa1 = Double.parseDouble(sc.nextLine());
        Empleado emp1 = new Empleado(nombre1, horas1, tarifa1);

        System.out.println();

        // EMPLEADO 2
        System.out.println("Introduce los datos del empleado 2");
        System.out.print("Nombre: ");
        String nombre2 = sc.nextLine();
        System.out.print("Horas trabajadas: ");
        int horas2 = Integer.parseInt(sc.nextLine());
        System.out.print("Tarifa por hora : ");
        double tarifa2 = Double.parseDouble(sc.nextLine());
        Empleado emp2 = new Empleado(nombre2, horas2, tarifa2);

        System.out.println();

        // EMPLEADO 3
        System.out.println("Introduce los datos del empleado 3");
        System.out.print("Nombre: ");
        String nombre3 = sc.nextLine();
        System.out.print("Horas trabajadas: ");
        int horas3 = Integer.parseInt(sc.nextLine());
        System.out.print("Tarifa por hora : ");
        double tarifa3 = Double.parseDouble(sc.nextLine());
        Empleado emp3 = new Empleado(nombre3, horas3, tarifa3);

        System.out.println();

        // MOSTRAR RESULTADOS
        System.out.println("----- SUELDOS BRUTOS -----");
        System.out.println(emp1.getNombre() + " cobrara " + emp1.calcularSueldo() + " euros.");
        System.out.println(emp2.getNombre() + " cobrara " + emp2.calcularSueldo() + " euros.");
        System.out.println(emp3.getNombre() + " cobrara " + emp3.calcularSueldo() + " euros.");


    }    
}
