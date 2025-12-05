/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5_tema6;

/**
 *
 * @author DAM
 */
public class Murcielago extends Mamifero implements Volador {

    private int alturaVuelo;

    public Murcielago(){
        super();
        alturaVuelo = 0;
    }

    public Murcielago(String nombre, String sexo, String color, int edad, int altura) {
        super(nombre, sexo, color, edad);
        this.alturaVuelo = altura;
    }

    public int getAlturaVuelo() {
        return alturaVuelo;
    }

    public void setAlturaVuelo(int alturaVuelo) {
        this.alturaVuelo = alturaVuelo;
    }

    @Override
    public String toString() {
        return "Murcielago{" + "alturaVuelo=" + alturaVuelo + '}';
    }
    
    
    @Override
    public String obtenerMensajeVolador() {
        return "El murciélago es un animal volador";
    }

    @Override
    public void aumentarAlturaVuelo() {
        alturaVuelo += 5;
    }

    @Override
    public void bajarAlturaVuelo() {
        alturaVuelo -= 5;
    }

    @Override
    public void mostrarAlturaVuelo() {
        System.out.println("Altura de vuelo: " + alturaVuelo + " metros");
    }
}
