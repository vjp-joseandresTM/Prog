/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author DAM
 */
public class Coche {
    //Declaro atributos
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;
    private boolean motorEncendido = false;
    
    public void establecerMarca(String m){
        marca = m;
    }
    
    public void establecerModelo(String mod){
        modelo = mod;
    }
    
    public void establecerColor(String col){
        color = col;
    }
    //• arrancarCoche (pone motorEncendido a true y velocidad a 10)

    public void arrancarCoche(){
        motorEncendido = true;
        velocidad = 10;
        System.out.println("El coche ha arrancado.");
    }
    // apagarCoche (pone motorEncendido a false y velocidad a 0)

    public void apagarCoche(){
        motorEncendido = false;
        velocidad = 0;
        
        System.out.println("El coche se ha apagado.");

    }
    
    public void acelerarCoche() {
        if (motorEncendido == true) {
            velocidad = velocidad + 20;
            System.out.println("El coche ha acelerado. Velocidad actual: " + velocidad + " km/h");
        } else {
            System.out.println("No se puede acelerar si el motor está apagado.");
        }
    }

    //frenarCoche (disminuye 6 la velocidad)
    public void frenarCoche() {
        if (motorEncendido == true) {
            velocidad = velocidad - 6;
            if (velocidad < 0) {
                velocidad = 0;
            }
            System.out.println("El coche ha frenado. Velocidad actual: " + velocidad + " km/h");
        } else {
            System.out.println("No se puede frenar con el motor apagado.");
        }
    }
    //obtenerEstado (muestra el valor de los atributos)
     public void obtenerEstado() {
        System.out.println("MARCA: " + marca);
        System.out.println("MODELO: " + modelo);
        System.out.println("COLOR: " + color);
        System.out.println("VELOCIDAD: " + velocidad + " km/h");
        System.out.println("MOTOR ENCENDIDO: " + (motorEncendido ? "Sí" : "No"));
        
    }
    
    
}


