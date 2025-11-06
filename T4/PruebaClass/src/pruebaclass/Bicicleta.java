/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaclass;

/**
 *
 * @author alumno
 */

public class Bicicleta {
    
    //Atributos
    private String marca;
    private String color;
    private String tipo;
    private int antiguedad;
    
    //Constructores
    //Lo veremos más adelante
    
    //Getters//Setters
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String m){
        marca = m;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String c){
        color = c;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String t){
        tipo = t;
    }
    
    public int getAntiguedad(){
        return antiguedad;
    }
    
    public void setAntiguedad(int a){
        antiguedad = a;
    }
    //Otros métodos
    public void mostrarAntiguedad(){
      if(antiguedad>10){
          System.out.println("La bici es una mierda vieja");
      }else{
          System.out.println("La bici es nueva y gitano te la va a robar");
      }  
    }
    
    //Mostrar
    public void mostrarBicicleta(){
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
        System.out.println("Tipo: " + tipo);
        System.out.println("Antiguedad: " + antiguedad);
    }
}


