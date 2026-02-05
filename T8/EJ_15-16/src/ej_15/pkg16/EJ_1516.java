/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_15.pkg16;

import java.util.Scanner;

/**
 *
 * @author DAM
 */
public class EJ_1516 {

    static Pelicula[] peliculas = new Pelicula[5];
    static int numPeliculas = 0;

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n--- MENÚ CINE ---");
            System.out.println("1. Rellenar peliculas");
            System.out.println("2. Mostrar Peliculas");
            System.out.println("3. Mostrar peliculas y socios q lo han visto");
            System.out.println("4. Mostrar pelicula menos rentable");
            System.out.println("5. Pedir nombre de pelicula y mostrar beneficio neto");
            System.out.println("6. Contar numero de socios que han abonado cantidad mayor.");
            System.out.println("7. Mostrar socios por letra");
            System.out.println("8. Mostrar películas por texto");
            System.out.println("9. Cambiar 'a' por 'e' en la última película");
            System.out.println("10. Convertir títulos a MAYÚSCULAS");
            System.out.println("11. SALIR");
            System.out.println("12. SALIR...");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    rellenarPelicula();
                    break;
                case 2:
                    mostrarPeliculas();
                    break;
                case 3:
                    mostrarPeliculasYSocios();
                    break;
                case 4:
                    peliculaMenosRentable();
                    break;
                case 5:
                    buscarPelicula();
                    break;
                case 6:
                    contarSociosMayores();

                    break;
                case 7:
                    System.out.println("Gracias por usar... Adios!");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (opcion != 7);
    }

    public static void rellenarPelicula() {
        Scanner sc = new Scanner(System.in);
        if (numPeliculas >= peliculas.length) {
            System.out.println("No caben más películas.");
            return;
        }
        Pelicula p = new Pelicula();
        System.out.print("Título: ");
        p.setTitulo(sc.nextLine());
        System.out.print("Coste licencia: ");
        p.setCostoLicencia(sc.nextDouble());
        sc.nextLine();
        Socio[] socios = new Socio[4];
        for (int i = 0; i < 4; i++) {
            socios[i] = new Socio();
            System.out.print("Nombre socio " + (i + 1) + ": ");
            socios[i].setNombre(sc.nextLine());
            System.out.print("Precio abonado: ");
            socios[i].setPrecioAbonado(sc.nextDouble());
            sc.nextLine();
        }
        p.setSocios(socios);
        peliculas[numPeliculas] = p;
        numPeliculas++;
        System.out.println("Película añadida correctamente.");
    }

    public static void mostrarPeliculas() {
        if (numPeliculas == 0) {
            System.out.println("No hay películas.");

        }
        for (int i = 0; i < numPeliculas; i++) {
            System.out.println((i + 1) + ". " + peliculas[i].getTitulo());
        }
    }

    public static void mostrarPeliculasYSocios() {
        if (numPeliculas == 0) {
            System.out.println("No hay películas.");

        }
        for (int i = 0; i < numPeliculas; i++) {
            System.out.println("\n--- " + peliculas[i].getTitulo() + " ---");
            System.out.println("Coste licencia: " + peliculas[i].getCostoLicencia());
            for (Socio s : peliculas[i].getSocios()) {
                System.out.println(" " + s.getNombre() + " pagó " + s.getPrecioAbonado());
            }
        }
    }

    public static void peliculaMenosRentable() {
        if (numPeliculas == 0) {
            System.out.println("No hay películas.");

        }

        // Inicializamos con la primera película
        Pelicula peor = peliculas[0];
        double ingresos0 = 0;

        for (Socio s : peor.getSocios()) {
            ingresos0 += s.getPrecioAbonado();
        }

        double minBeneficio = ingresos0 - peor.getCostoLicencia();

        // Recorremos el resto
        for (int i = 1; i < numPeliculas; i++) {
            Pelicula p = peliculas[i];
            double ingresos = 0;

            for (Socio s : p.getSocios()) {
                ingresos += s.getPrecioAbonado();
            }

            double beneficio = ingresos - p.getCostoLicencia();

            if (beneficio < minBeneficio) {
                minBeneficio = beneficio;
                peor = p;
            }
        }

        System.out.println("La película menos rentable es: " + peor.getTitulo()
                + " con beneficio " + minBeneficio);
    }

    public static void buscarPelicula() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce título: ");
        String nombre = sc.nextLine();
        for (int i = 0; i < numPeliculas; i++) {
            Pelicula p = peliculas[i];
            if (p.getTitulo().equalsIgnoreCase(nombre)) {
                double ingresos = 0;
                for (Socio s : p.getSocios()) {
                    ingresos += s.getPrecioAbonado();
                }
                double beneficio = ingresos - p.getCostoLicencia();
                System.out.println("Beneficio neto: " + beneficio);
                mostrarPeliculasYSocios();
                return;
            }
        }
        System.out.println("No encontrada.");
    }

    public static void contarSociosMayores() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad mínima: ");
        double x = sc.nextDouble();
        int contador = 0;
        for (int i = 0; i < numPeliculas; i++) {
            for (Socio s : peliculas[i].getSocios()) {
                if (s.getPrecioAbonado() > x) {
                    contador++;
                }
            }
        }
        System.out.println("Socios que pagaron más de " + x + ": " + contador);
    }

    public static void mostrarSociosPorLetra() {
        if (numPeliculas == 0) {
            System.out.println("No hay películas.");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una letra: ");
        char letra = sc.nextLine().toLowerCase().charAt(0);

        System.out.println("Socios que empiezan por '" + letra + "':");

        for (int i = 0; i < numPeliculas; i++) {
            for (Socio s : peliculas[i].getSocios()) {
                if (s.getNombre().toLowerCase().charAt(0) == letra) {
                    System.out.println(" - " + s.getNombre());
                }
            }
        }
    }

    public static void mostrarPeliculasPorTexto() {
        if (numPeliculas == 0) {
            System.out.println("No hay películas.");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce texto inicial: ");
        String texto = sc.nextLine().trim().toLowerCase();

        System.out.println("Películas que empiezan por '" + texto + "':");

        for (int i = 0; i < numPeliculas; i++) {
            String titulo = peliculas[i].getTitulo().trim().toLowerCase();
            if (titulo.startsWith(texto)) {
                System.out.println(" - " + peliculas[i].getTitulo());
            }
        }
    }

    public static void cambiarAporE() {
        if (numPeliculas == 0) {
            System.out.println("No hay películas.");
            return;
        }

        Pelicula ultima = peliculas[numPeliculas - 1];
        String nuevoTitulo = ultima.getTitulo()
                .replace('a', 'e')
                .replace('A', 'E');

        ultima.setTitulo(nuevoTitulo);

        System.out.println("Nuevo título de la última película: " + nuevoTitulo);
    }

    public static void convertirTitulosMayus() {
        if (numPeliculas == 0) {
            System.out.println("No hay películas.");
            return;
        }

        for (int i = 0; i < numPeliculas; i++) {
            peliculas[i].setTitulo(peliculas[i].getTitulo().toUpperCase());
        }

        System.out.println("Todos los títulos han sido convertidos a MAYÚSCULAS.");
    }

}
