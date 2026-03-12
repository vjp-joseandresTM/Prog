/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t10_ej15;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DAM
 */
public class T10_Ej15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Empresa> listaEmpresa = new ArrayList<>();
        menu(listaEmpresa);
    }
    //Menu que llama a los metodos
    public static void menu(ArrayList<Empresa> listaEmpresa) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENU EMPRESAS ---");
            System.out.println("1. Añadir empresa y empleados");
            System.out.println("2. Mostrar empresas y empleados");
            System.out.println("3. Mostrar empleados cuyo nombre contiene 'A'");
            System.out.println("4. Mostrar empleados ordenados por sueldo");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    rellenar(listaEmpresa);
                    break;
                case 2:
                    mostrar(listaEmpresa);
                    break;

                case 3:
                    mostrarA(listaEmpresa);
                    break;
                case 4:
                    filtroSueldo(listaEmpresa);
                    break;
                case 5:
                    System.out.println("Saliendo del programa.....");
                default:
                    System.out.println("Introduzca una opcion valida...");
            }
        } while (opcion != 5);
    }
    //Rellenamos los nombres de empresa y los empleados en las listas.
    public static void rellenar(ArrayList<Empresa> listaEmpresa) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre de la empresa: ");
        String nombreEmpresa = sc.nextLine();

        Empresa empresa = new Empresa();
        empresa.setNombreEmpresa(nombreEmpresa);

        System.out.print("¿Cuántos empleados quieres añadir? ");
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<Empleados> listaEmpleados = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Nombre del empleado: ");
            String nombre = sc.nextLine();

            System.out.print("Sueldo del empleado: ");
            int sueldo = sc.nextInt();
            sc.nextLine();

            listaEmpleados.add(new Empleados(nombre, sueldo));
        }

        empresa.setEmpleados(listaEmpleados);
        listaEmpresa.add(empresa);
    }
    //Leemos las listas y mostramos la informacion
    public static void mostrar(ArrayList<Empresa> listaEmpresa) {
        System.out.println("\n--- EMPRESAS Y EMPLEADOS ---");
        for (Empresa emp : listaEmpresa) {
            System.out.println("\nEmpresa: " + emp.getNombreEmpresa());
            for (Empleados e : emp.getEmpleados()) {
                System.out.println("   - " + e);
            }
        }
    }

    //Mostramos solo los que empiezan por A
    public static void mostrarA(ArrayList<Empresa> listaEmpresa) {
        System.out.println("\n--- EMPLEADOS CON 'A' EN EL NOMBRE ---");
        for (Empresa emp : listaEmpresa) {
            for (Empleados e : emp.getEmpleados()) {
                if (e.getNombreEmpleado().toUpperCase().contains("A")) {
                    System.out.println(e);
                }
            }
        }
    }
    
    //Filtramos por sueldo.
    public static void filtroSueldo(ArrayList<Empresa> listaEmpresa) {
        
        System.out.println("\n--- EMPLEADOS ORDENADOS POR SUELDO ---");


        ArrayList<Empleados> todos = new ArrayList<>();
        for (Empresa emp : listaEmpresa) {
            for (Empleados e : emp.getEmpleados()) { //Repasar addAll.
                todos.add(e);
            }
        }

        for (int i = 0; i < todos.size() - 1; i++) {
            for (int j = 0; j < todos.size() - 1 - i; j++) {
                if (todos.get(j).getSueldo() > todos.get(j + 1).getSueldo()) {
                    Empleados aux = todos.get(j);
                    todos.set(j, todos.get(j + 1));
                    todos.set(j + 1, aux);
                }
            }
        }

 
        for (Empleados e : todos) {
            System.out.println(e);

        }

    }
}