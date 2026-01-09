/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5_ej14;

/**
 *
 * @author DAM
 */
public class Tablas {

    private int numero;
    private int multiplicando;
    private int resultado;

    public Tablas() {
        this.numero = 0;
        this.multiplicando = 0;
        this.resultado = 0;

    }

    public Tablas(int numero, int multiplicando, int resultado) {
        this.numero = numero;
        this.multiplicando = multiplicando;
        this.resultado = resultado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getMultiplicando() {
        return multiplicando;
    }

    public void setMultiplicando(int multiplicando) {
        this.multiplicando = multiplicando;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public void operacion() {
        for (int i = 0; i < 10; i++) {
            resultado = numero * multiplicando;
            System.out.println(numero + " X " + multiplicando + " = " + resultado);
            multiplicando++;
        }
    }
}
