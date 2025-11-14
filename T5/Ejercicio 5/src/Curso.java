
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jose
 */
import java.util.Scanner;

public class Curso {
    private String nombre;
    private double nota;
    
    //Constructor de nombre 
       public Curso(String nombre){
        this.nombre = nombre;
  
    }
       
    public void setNota(double nota){
        this.nota = nota;
    }  
    
    public double getNota(){
        return nota;
    }
    
    //Metodo para calcular la media
    public static double calcularMedia(double n1, double n2, double n3,double n4, double n5, double n6){
        return (n1 + n2 + n3 + n4 + n5 + n6)/6;
    }
    
    public String getNombre(){
        return nombre;
    }
    
}

