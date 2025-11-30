/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author DAM
 */
public class Perro extends Canido {

    public Perro(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }

    @Override
    public void mostrarSonido() {
        System.out.println("Sonido: Ladrido");
    }

    @Override
    public void mostrarAlimentacion() {
        System.out.println("Alimentación: Carnívora");
    }

    @Override
    public void mostrarHabitat() {
        System.out.println("Hábitat: Doméstico");
    }

    @Override
    public void mostrarNombreCientifico() {
        System.out.println("Nombre científico: Canis lupus familiaris");
    }
}