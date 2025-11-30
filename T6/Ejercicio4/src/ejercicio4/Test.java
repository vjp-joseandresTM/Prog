/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author DAM
 */
public class Test {
    public static void main(String[] args) {

        System.out.println("=== INSTANCIAS NORMALES ===");

        Perro perro = new Perro("Rex", 5, 12.5);
        Lobo lobo = new Lobo("Colmillo", 7, 35.0);
        Leon leon = new Leon("Simba", 8, 190.0);
        Gato gato = new Gato("Misu", 3, 4.2);

        mostrarAnimal(perro);
        mostrarAnimal(lobo);
        mostrarAnimal(leon);
        mostrarAnimal(gato);

        System.out.println("\n=== POLIMORFISMO ===");

        Animal a1 = new Perro("Rocky", 4, 10.0);
        Animal a2 = new Lobo("Gris", 6, 40.0);
        Animal a3 = new Leon("Nala", 7, 150.0);
        Animal a4 = new Gato("Luna", 2, 3.5);

        mostrarAnimal(a1);
        mostrarAnimal(a2);
        mostrarAnimal(a3);
        mostrarAnimal(a4);
    }

    public static void mostrarAnimal(Animal animal) {
        System.out.println("\n--- Información del animal ---");
        animal.mostrarDatos();
        animal.mostrarSonido();
        animal.mostrarAlimentacion();
        animal.mostrarHabitat();
        animal.mostrarNombreCientifico();
    }
}