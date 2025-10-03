/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15_tema2;

/**
 *
 * @author DAM
 */
public class Ejercicio15_Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tiempo = 10000;
        int enHoras = 10000/3600;
        int resto = 10000%3600;
        int enMinutos = resto/60;
        int enSegundos = resto%60;
        
        System.out.println(tiempo + " Segundos son: " + enHoras + "H " + enMinutos + "m " + enSegundos + "S " );
    }
    
}
