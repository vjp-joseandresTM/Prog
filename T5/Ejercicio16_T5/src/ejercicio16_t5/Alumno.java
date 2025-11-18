/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio16_t5;

/**
 *
 * @author DAM
 */
public class Alumno {
    
 private String nombre;
 private int nota;
 
 public Alumno(){
     nombre = "";
     nota = 0;
 }
 
 public Alumno(String nombre, int nota){
     this.nombre = nombre;
     this.nota = nota;
 }

 public String getNombre() {
        return nombre;
 }
 public void setNota(int nota){
     if(nota < 0 || nota > 10){
         System.out.println("La nota es invalida...");
     }
    this.nota = nota;
 }
 public int getNota() {
        return nota;
 }
 
 public String calificacion(){
     if(nota<=4){
         return "Suspenso";
     }else if(nota<=6){
         return "Aprobado";
     }else if(nota<=8){
         return "Sobresaliente";
     }else{
         return "Excelente";
     }
     
 }
 

 public void mostrarAlumno(){
     System.out.println("El nombre del alumno: " + getNombre());
     System.out.println("La nota fue: " + getNota() + " Que es un: " + calificacion());
 }

}
