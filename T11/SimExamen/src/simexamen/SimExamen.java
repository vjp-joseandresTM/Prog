/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simexamen;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author DAM
 */
public class SimExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, Bicicleta> bicis = new HashMap();
        HashMap<String, Cliente> clientes = new HashMap();
        HashSet<String> bicisAlquiladas = new HashSet<>();
        menuPrin(bicis, clientes, bicisAlquiladas);
    }

    public static void menuPrin(Map bicis, Map clientes, HashSet<String> bicisAlquiladas) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. GESTIONAR BICIS");
            System.out.println("2. GESTIONAR CLIENTES");
            System.out.println("3. ALQUILAR BICICLETA");
            System.out.println("4. DEVOLVER BICICLETA");
            System.out.println("5. MOSTRAR ESTADO DEL SISTEMA");
            System.out.println("6. SALIR");
            System.out.println("===============================");
            System.out.println("Introduce una opcion");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    menuBic(bicis, clientes);
                    break;
                case 2:
                    menuCli(bicis, clientes);
                    break;

                case 3:
                    alquilarBic(bicis, clientes, bicisAlquiladas);
                    break;
                case 4:
                    devolverBici(bicis, clientes, bicisAlquiladas);
                    break;
                case 5:
                    mostrarSys(bicis, clientes, bicisAlquiladas);
                    break;
                case 6:
                    System.out.println("Bye...");
                    break;

                default:
                    System.out.println("Gracias por usar...");
            }
        } while (opcion != 6);
    }

    public static void menuBic(Map bicis, Map clientes) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. AÑADIR BICICLETA");
            System.out.println("2. ELIMINAR BICICLETA");
            System.out.println("3. MOSTRAR BICICLETA");
            System.out.println("4. VOLVER");
            System.out.println("===============================");
            System.out.println("Introduce una opcion");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    añadirBici(bicis);
                    break;
                case 2:
                    eliminarBici(bicis);
                    break;

                case 3:
                    mostrarBici(bicis);
                    break;
                case 4:

                    break;

                default:
                    System.out.println("Volviendo al menu principal...");
            }
        } while (opcion != 4);
    }

    public static void menuCli(Map bicis, Map clientes) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. AÑADIR CLIENTES");
            System.out.println("2. ELIMINAR CLIENTES");
            System.out.println("3. MOSTRAR CLIENTES");
            System.out.println("4. VOLVER");
            System.out.println("===============================");
            System.out.println("Introduce una opcion");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    añadirCli(clientes);
                    break;
                case 2:
                    eliminarCli(clientes);
                    break;

                case 3:
                    mostrarCli(clientes);
                    break;
                case 4:

                    break;

                default:
                    System.out.println("Volviendo al menu principal...");
            }
        } while (opcion != 4);
    }

    public static void añadirBici(Map bicis) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inrooduce el id de la bici: ");
        String idBici = sc.nextLine();
        sc.nextLine();
        System.out.print("Inrooduce el modelo de la bici: ");
        String modBici = sc.nextLine();
        System.out.print("Inrooduce el precio por hora de la bici: ");
        Float precioBici = sc.nextFloat();

        Bicicleta b = new Bicicleta(idBici, modBici, precioBici);

        bicis.put(idBici, b);
    }

    public static void eliminarBici(Map bicis) {
        Scanner sc = new Scanner(System.in);
        String idBic;
        boolean borrado = false;
        do {
            System.out.println("Introduce el id a borrar");
            idBic = sc.nextLine();
            if (bicis.containsKey(idBic)) {
                bicis.remove(idBic);
                borrado = true;
                System.out.println("La bici se elimino correctamente");
            } else {
                System.out.println("El id de la bici no existe.");
            }
        } while (borrado != true);
    }

    public static void mostrarBici(Map bicis) {
        Iterator<Bicicleta> it = bicis.values().iterator();

        while (it.hasNext()) {
            Bicicleta b = it.next();
            System.out.println(b.toString());
        }
    }

    //CLIENTES
    public static void añadirCli(Map clientes) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el DNI del usuario: ");
        String dniC = sc.nextLine();
        System.out.println("Introduce el nombre del usuario: ");
        String nombreC = sc.nextLine();

        Cliente c = new Cliente(dniC, nombreC);

        clientes.put(dniC, c);
        System.out.println("Cliente añadido correctamente");

    }

    public static void eliminarCli(Map clientes) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el DNI a eliminar");
        String dni = sc.nextLine();
        if (clientes.containsKey(dni)) {
            clientes.remove(dni);
            System.out.println("Cliente eliminado de forma satisfactoria");
        } else {
            System.out.println("No existe el cliente");
        }
    }

    public static void mostrarCli(Map clientes) {
        Iterator<Cliente> it = clientes.values().iterator();

        while (it.hasNext()) {
            Cliente c = it.next();
            System.out.println(c.toString());
        }

    }

    public static void alquilarBic(Map bicis, Map clientes, HashSet<String> bicisAlquiladas) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el DNI del cliente: ");
        String dni = sc.nextLine();
        System.out.print("Introudice el ID de la bici a alquilar: ");
        String id = sc.nextLine();
        
        if (!clientes.containsKey(dni)) {
            System.out.println("No existe ese DNI en el sistema");
        }
        if (!bicis.containsKey(id)) {
            System.out.println("No existe ese ID en el sistema");
        }
        
        if (bicisAlquiladas.contains(id)){
            System.out.println("La bici ya se encuentra alquilada");
        }
        
        bicisAlquiladas.add(id);
        System.out.println("Añadido correctamente");
    }
    
    public static void devolverBici(Map bicis, Map clientes, HashSet<String> bicisAlquiladas){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el id de la bici que desea eleminiar");
        String id = sc.nextLine();
        
        if (bicisAlquiladas.contains(id)) {
            bicisAlquiladas.remove(id);
            System.out.println("Devuelta correctamente");
        }else{
            System.out.println("No se encuentra alquilada o registrada en el sistema");
        }
    }
    
    public static void mostrarSys(Map <String, Bicicleta>bicis, Map<String,Cliente> clientes, HashSet<String> bicisAlquiladas){
        System.out.println("==== BICIS DISPONIBLES ====");
        for(String id : bicis.keySet()){
            if (!bicisAlquiladas.contains(id)) {
                System.out.println(bicis.get(id));
            }
  
        }
        
        System.out.println("\n ==== BICIS ALQUILADAS ====");
        for(String id : bicisAlquiladas){
            System.out.println(bicis.get(id));
        }
        
        System.out.println("\n ==== CLIENTES REGISTRADOS  ====");
        for(Cliente c : clientes.values()){
            System.out.println(c);
        }
    }
}
