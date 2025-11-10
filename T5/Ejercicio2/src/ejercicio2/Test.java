/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author DAM
 */
public class Test {
       public static void main(String[] args) {
        // Crear los objetos de la clase Curso
        Curso curso1 = new Curso();
        Curso.sumarCursos(); // Incrementa el contador
        Curso curso2 = new Curso();
        Curso.sumarCursos(); // Incrementa el contador

        // Establecer los datos de cada curso
        curso1.establecerNombreyHoras("Programación", 120);
        curso2.establecerNombreyHoras("Sistemas Informáticos", 90);

        // Mostrar los datos de los cursos
        System.out.println("=== DATOS DE LOS CURSOS ===");
        System.out.println("Curso 1: " + curso1.obtenerNombre() + " - " + curso1.obtenerHoras() + " horas");
        System.out.println("Curso 2: " + curso2.obtenerNombre() + " - " + curso2.obtenerHoras() + " horas");

        // Mostrar el número total de cursos creados
        System.out.println("=== TOTAL DE CURSOS ===");
        Curso.verNumeroCursos();
    }
} 

