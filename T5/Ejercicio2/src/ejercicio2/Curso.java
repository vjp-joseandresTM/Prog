/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author DAM
 */
public class Curso {
    private String nombre;
    private int numeroHoras;
    private static int numeroDeCursos;
    
    public void establecerNombreyHoras(String n, int h){
        nombre = n;
        numeroHoras = h;
        
    } 
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public int obtenerHoras() {
        return numeroHoras;
    }
    
    public static void sumarCursos() {
        numeroDeCursos++;
    }
     // Método estático para ver cuántos cursos se han creado
    public static void verNumeroCursos() {
        System.out.println("Número total de cursos creados: " + numeroDeCursos);
    }
    
}
