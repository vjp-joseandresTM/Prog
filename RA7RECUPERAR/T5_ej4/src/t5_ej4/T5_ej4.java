/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5_ej4;

/**
 *
 * @author DAM
 */
public class T5_ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pajarito p1 = new Pajarito();
        Pajarito p2 = new Pajarito();
        
        p1.establecerColoryEdad("Azul", 14);
        p2.establecerColoryEdad("Verde", 5);
        
        System.out.println("Numero de pajaros: "+ Pajarito.muestraPajaros());
    }
    
}
