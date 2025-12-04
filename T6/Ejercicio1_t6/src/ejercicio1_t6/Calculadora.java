/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1_t6;

/**
 *
 * @author DAM
 */
abstract class Calculadora {
    int numero;
    
    public Calculadora(){
        numero = 0;
    }
    public Calculadora(int numero){
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void mostrar(){
        System.out.println(numero);
    }
    public abstract void realizarOperacion();
}
