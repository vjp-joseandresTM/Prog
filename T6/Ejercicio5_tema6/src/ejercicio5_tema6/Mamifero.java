/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5_tema6;

/**
 *
 * @author DAM
 */
public class Mamifero {

    protected String nombre;
    protected String sexo;
    protected String color;
    protected int edad;

    public Mamifero(String nombre, String sexo, String color, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.color = color;
        this.edad = edad;
    }
}

interface Oviparo {

    String obtenerMensajeOviparo();

    void ponerHuevo();

    void incubarHuevo();

    void mostrarNumHuevos();
}

interface Volador {

    String obtenerMensajeVolador();

    void aumentarAlturaVuelo();

    void bajarAlturaVuelo();

    void mostrarAlturaVuelo();
}
