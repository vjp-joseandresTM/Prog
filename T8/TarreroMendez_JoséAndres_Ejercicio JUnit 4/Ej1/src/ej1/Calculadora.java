/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1;

/**
 *
 * @author alumno
 */
public class Calculadora {

    private double a;
    private double b;

    public Calculadora(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double sumar() {
        return a + b;
    }

    public double restar() {
        return a - b;
    }

    public double multiplicar() {
        return a * b;
    }

    public double dividir() {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return a / b;
    }
 
}
