/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3_tema6;

/**
 *
 * @author DAM
 */
public abstract class Rectangulo extends FiguraGeometrica {

    double base;
    double altura;

    public Rectangulo(double base,double altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
        super();
        base = 0;
        altura = 0;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return super.toString() + "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }




}
