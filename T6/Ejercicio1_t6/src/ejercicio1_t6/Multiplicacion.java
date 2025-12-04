/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1_t6;

/**
 *
 * @author DAM
 */
public class Multiplicacion extends Calculadora{
    private int multiplicando;
    public Multiplicacion(int numero, int multiplicando){
        super(numero);
        this.multiplicando = multiplicando;
    } 
    
    @Override
    public void realizarOperacion(){
       int resultado = numero * multiplicando;
       System.out.println("Multiplicacion: " + resultado);
    }
   
}
