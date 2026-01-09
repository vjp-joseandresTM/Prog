/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5_ej12;

/**
 *
 * @author DAM
 */
public class Triangulo {
    private int cateto1;
    private int cateto2;
    
    public Triangulo(){
        this.cateto1 = 0;
        this.cateto2 = 0;
    }
    
    public Triangulo(int cateto1, int cateto2){
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
        
    }

    public int getCateto1() {
        return cateto1;
    }

    public void setCateto1(int cateto1) {
        this.cateto1 = cateto1;
    }

    public int getCateto2() {
        return cateto2;
    }

    public void setCateto2(int cateto2) {
        this.cateto2 = cateto2;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "cateto1=" + cateto1 + ", cateto2=" + cateto2 + '}';
    }
    
    public void mostrarCatetos(){
        System.out.println("El primer cateto: "+ cateto1);
        System.out.println("El segundo cateto: "+ cateto2);
    }
    
    public int calcularLongitud(){
        cateto1 = cateto1 * 2;
        cateto2 = cateto2 * 2;
        int resultado = cateto1 + cateto2;
        return resultado;
        
    }
    
    public void mostrarResultado(){
        int resultado = calcularLongitud();
        System.out.println("El resultado es:" + resultado);
    }
    
}
 