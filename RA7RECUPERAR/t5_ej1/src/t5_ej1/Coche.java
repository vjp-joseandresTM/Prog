/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5_ej1;

/**
 *
 * @author alumno
 */
public class Coche {

    String marca;
    String modelo;
    String color;
    int velocidad;
    boolean motorEncendido;

    public void establecerMarca(String marca) {
        this.marca = marca;
    }

    public void establecerModelo(String modelo) {
        this.modelo = modelo;

    }

    public void establecerColor(String color) {
        this.color = color;
    }

    public void arrancarCoche() {
        motorEncendido = true;
    }

    public void apagarCoche() {
        motorEncendido = false;
        velocidad = 0;
    }

    public void acelerarCoche() {
        velocidad += 20;
    }

    public void frenarCoche() {
        velocidad = velocidad - 6;
    }

    public void obtenerEstado() {
        System.out.println("La marca es: " + marca);
        System.out.println("El modelo es: " + modelo);
        System.out.println("El color: " + color);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Esta el motor encendido: " + motorEncendido);
    }

}
