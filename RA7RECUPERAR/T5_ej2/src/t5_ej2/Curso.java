/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5_ej2;

/**
 *
 * @author DAM
 */
public class Curso {
    private String nombre;
    private int numeroHoras;
    
    public static int numeroDeCursos = 0;
    
    public void establecerNombreyHoras(String nombre, int numeroHoras){
        this.nombre = nombre;
        this.numeroHoras = numeroHoras;
    }
    
    public void obtenerNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void obtenerHoras(int numeroHoras){
        this.numeroHoras = numeroHoras;
    }
    
    public static int sumarCursos(){
        numeroDeCursos++;
        return numeroDeCursos;
    }
    
    public static void verNumCursos(){
        System.out.println("El num de cursos es: "+ numeroDeCursos);
    }
    
    public void mostrar(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Numero de horas: "+ numeroHoras);
               
    }
}
