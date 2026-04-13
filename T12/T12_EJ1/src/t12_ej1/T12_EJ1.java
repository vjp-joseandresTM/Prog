package t12_ej1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class T12_EJ1 {

    public static void main(String[] args) {
        ArrayList<Contacto> agendaTlf = new ArrayList<>();
        menu(agendaTlf);
    }

    public static void menu(ArrayList<Contacto> agendaTlf) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n============== MENÚ =============");
            System.out.println("1. Añadir contactos.");
            System.out.println("2. Visualizar contactos.");
            System.out.println("3. Eliminar contactos.");
            System.out.println("4. Ordenar contactos por edad.");
            System.out.println("5. Salir del programa.");
            System.out.println("=================================");
            System.out.print(" []Introduce una opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    addContacto(agendaTlf);
                    break;

                case 2:
                    visualizarListaContactos(agendaTlf);
                    break;

                case 3:
                    eliminarContactoLista(agendaTlf);
                    break;

                case 4:
                    mostrarContactosEdad(agendaTlf);
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida (1-5)");
            }

        } while (opcion != 5);
    }
    //Metodo que añade el contacto
    public static void addContacto(ArrayList<Contacto> agendaTlf) throws InputMismatchException {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n--Introduce los datos del contacto--");

        System.out.print("Nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Edad: ");
        int edad = entrada.nextInt();

        System.out.print("Telefono movil: ");
        int telefonoMovil = entrada.nextInt();

        agendaTlf.add(new Contacto(nombre, edad, telefonoMovil));
        System.out.println("Contacto guardado correctamente");
    }
    //Mwtodo que visualiza la lista de contacots 
    public static void visualizarListaContactos(ArrayList<Contacto> agendaTlf) {
        System.out.println();

        if (agendaTlf.isEmpty()) {
            System.out.println("La agenda está vacía");
        } else {
            for (Contacto contacto : agendaTlf) {
                System.out.println(contacto);
            }
        }
    }
    //Eliminamos un contacto de la lista
    public static void eliminarContactoLista(ArrayList<Contacto> agendaTlf) {
        Scanner entrada = new Scanner(System.in);

        System.out.println();
        System.out.print("Introduce el teléfono móvil que deseas eliminar: ");
        int telefonoMovil = entrada.nextInt();

        boolean eliminado = false;

        for (int i = 0; i < agendaTlf.size(); i++) {
            if (agendaTlf.get(i).getNumeroMovil() == telefonoMovil) {
                agendaTlf.remove(i);
                eliminado = true;
                System.out.println("Contacto eliminado correctamente");
                break;
            }
        }

        if (!eliminado) {
            System.out.println("No existe ningún contacto con ese número");
        }
    }
    
    //Mostramos los contacot por edad
    public static void mostrarContactosEdad(ArrayList<Contacto> agendaTlf) {
        System.out.println();

        if (agendaTlf.isEmpty()) {
            System.out.println("La agenda está vacía");
        } else {
            for (int i = 0; i < agendaTlf.size() - 1; i++) {
                for (int j = i + 1; j < agendaTlf.size(); j++) {
                    if (agendaTlf.get(j).getEdad() < agendaTlf.get(i).getEdad()) {
                        Contacto aux = agendaTlf.get(i);
                        agendaTlf.set(i, agendaTlf.get(j));
                        agendaTlf.set(j, aux);
                    }
                }
            }

            System.out.println("--Contactos ordenados por edad--");
            for (Contacto contacto : agendaTlf) {
                System.out.println(contacto);
            }
        }
    }
}
