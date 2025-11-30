/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author DAM
 */
public class Leon extends Felino {

    public Leon(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }

    @Override
    public void mostrarSonido() {
        System.out.println("Sonido: Rugido");
    }

    @Override
    public void mostrarAlimentacion() {
        System.out.println("Alimentación: Carnívora");
    }

    @Override
    public void mostrarHabitat() {
        System.out.println("Hábitat: Sabana");
    }

    @Override
    public void mostrarNombreCientifico() {
        System.out.println("Nombre científico: Panthera leo");
    }
}
