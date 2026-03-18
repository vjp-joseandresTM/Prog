/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenprogarrays;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Coche {

    private static String nomTitular;
    private static String matricula;
    //Constructores 
    public Coche() {
        this.nomTitular = "";
        this.matricula = "";
    }

    public Coche(String nomTitular, String matricula) {
        this.nomTitular = nomTitular;
        this.matricula = matricula;
    }
    //Getters y setters.
    public String getNomTitular() {
        return nomTitular;
    }

    public void setNomTitular(String nomTitular) {
        this.nomTitular = nomTitular;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    //Metodos mostrar
    @Override
    public String toString() {
        return "Coche{" + "nomTitular=" + nomTitular + ", matricula=" + matricula + '}';
    }
    //Mostramos info de los coches
    public static void mostrarCoches(){
        System.out.println("\nInfoCoches:");
        System.out.println("Nombre de titular: "+ nomTitular);
        System.out.println("Matricula: " + matricula);
        
    }
    //Introducimos datos de coches
    public static void introDatos(){
       Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombre de titular: ");
        nomTitular = sc.nextLine();
     
        System.out.println("Introduce matricula: ");
        matricula = sc.nextLine();

    }
    
    

    
}
