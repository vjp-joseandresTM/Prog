/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11_t5;

/**
 *
 * @author DAM
 */
public class Numero {
    
    private int valor; //Escribimos la variable
  
    
    //Iniciamos los constructores
    public Numero(int valor){
        this.valor = valor;
    }
    
    public Numero(){
        valor = 0;
    }
    //Establecemos un getter que devuelva valor
    public int getValor() {
        return valor;
    }
    //Y un setter.
    public void setValor(int valor) {
        this.valor = valor;
    }
    //Mostramos
    public void mostrarValor(){
        System.out.println(getValor());
    }
    
    
}
