/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3_tema6;

/**
 *
 * @author alumno
 */
public abstract class Circulo extends FiguraGeometrica{
   double radio;
   
   public Circulo(double radio, String color){
       super(color);
       this.color = color;
   }
   
   public Circulo(){
       super();
       radio = 0;
   }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return super.toString() + "Circulo{" + "radio=" + radio + '}';
    }


   
}
