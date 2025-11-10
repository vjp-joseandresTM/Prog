/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author DAM
 */
public class Test {
    public static void main(String[] args) {
        // Crear objetos de la clase Coche
        Coche miCoche = new Coche();
        Coche cochePadre = new Coche();

        // Establecer datos del primer coche
        miCoche.establecerMarca("Seat");
        miCoche.establecerModelo("Cordoba");
        miCoche.establecerColor("Azul");

        // Establecer datos del segundo coche
        cochePadre.establecerMarca("Peugeot");
        cochePadre.establecerModelo("Partner");
        cochePadre.establecerColor("Gris");

        // Arrancar ambos coches
        miCoche.arrancarCoche();
        cochePadre.arrancarCoche();

        // Acelerar y frenar miCoche
        for (int i = 1; i <= 5; i++) {
            miCoche.acelerarCoche();
        }

        for (int i = 1; i <= 2; i++) {
            miCoche.frenarCoche();
        }

        // Acelerar cochePadre
        for (int i = 1; i <= 3; i++) {
            cochePadre.acelerarCoche();
        }

        // Apagar cochePadre
        cochePadre.apagarCoche();

        // Mostrar el estado de los coches
        System.out.println("ESTADO FINAL DE MI COCHE:");
        miCoche.obtenerEstado();

        System.out.println("ESTADO FINAL DE COCHE PADRE:");
        cochePadre.obtenerEstado();
    }
}
