/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12_t5;

/**
 *
 * @author DAM
 */
public class Catetos {
    private double cateto1;//Declaramos las variables a usar
    private double cateto2;
    
    //Iniciamos los constructores (Por defecto y parametrizado).
    public Catetos(double catetos1, double catetos2){
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }
    
    public Catetos(){
        cateto1 = 0;
        cateto2 = 0;
    }

    public double getCateto1() {
        return cateto1;
    }

    public double getCateto2() {
        return cateto2;
    }

   
    public void setCateto1(double cateto1) {
        this.cateto1 = cateto1;
    }

    public void setCateto2(double cateto2) {
        this.cateto2 = cateto2;
    }
    
    public void mostrarValores(){
       System.out.println(getCateto1());
       System.out.println(getCateto2());
    }
    
    
    
}
