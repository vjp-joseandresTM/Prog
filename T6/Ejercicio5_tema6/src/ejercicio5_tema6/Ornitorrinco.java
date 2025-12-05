/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5_tema6;

/**
 *
 * @author DAM
 */
public class Ornitorrinco extends Mamifero implements Oviparo {

    private int numeroHuevos;

    public Ornitorrinco(String nombre, String sexo, String color, int edad, int huevos) {
        super(nombre, sexo, color, edad);
        this.numeroHuevos = huevos;
    }

    @Override
    public String obtenerMensajeOviparo() {
        return "El ornitorrinco es un mamífero ovíparo";
    }

    @Override
    public void ponerHuevo() {
        numeroHuevos++;
    }

    @Override
    public void incubarHuevo() {
        if (numeroHuevos > 0) {
            numeroHuevos--;
        }
    }

    @Override
    public void mostrarNumHuevos() {
        System.out.println("Número de huevos: " + numeroHuevos);
    }
}
