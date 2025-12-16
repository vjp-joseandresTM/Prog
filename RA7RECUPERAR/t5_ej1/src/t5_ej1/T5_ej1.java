/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5_ej1;

/**
 *
 * @author alumno
 */
public class T5_ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear objetos
        Coche miCoche = new Coche();
        Coche cochePadre = new Coche();

        // Establecer datos de miCoche
        miCoche.establecerMarca("Seat");
        miCoche.establecerModelo("Ibiza");
        miCoche.establecerColor("Rojo");

        // Establecer datos de cochePadre
        cochePadre.establecerMarca("Audi");
        cochePadre.establecerModelo("A4");
        cochePadre.establecerColor("Negro");

        // Arrancar coches
        miCoche.arrancarCoche();
        cochePadre.arrancarCoche();

        // Acelerar miCoche 5 veces
        for (int i = 0; i < 5; i++) {
            miCoche.acelerarCoche();
        }

        // Frenar miCoche 2 veces
        for (int i = 0; i < 2; i++) {
            miCoche.frenarCoche();
        }

        // Acelerar cochePadre 3 veces
        for (int i = 0; i < 3; i++) {
            cochePadre.acelerarCoche();
        }

        // Apagar cochePadre
        cochePadre.apagarCoche();

        // Mostrar estados
        System.out.println("Estado de miCoche:");
        miCoche.obtenerEstado();

        System.out.println("Estado de cochePadre:");
        cochePadre.obtenerEstado();
    }
    
}
