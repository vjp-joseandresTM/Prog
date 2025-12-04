/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3_tema6;

/**
 *
 * @author alumno
 */
public abstract class FiguraGeometrica {
    String color;
    
    public FiguraGeometrica (String color){
        this.color = color;
    }
    
    public FiguraGeometrica(){
        color = "";
       
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "color=" + color + '}';
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    
    
}
