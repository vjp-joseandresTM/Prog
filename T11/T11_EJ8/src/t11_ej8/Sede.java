/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t11_ej8;

/**
 *
 * @author DAM
 */
public class Sede {

    private String nombre;
    private double ingresos;
    //Constructores
    public Sede(String nombre, double ingresos) {
        this.nombre = nombre;
        this.ingresos = ingresos;
    }

    public Sede() {
        this.nombre = "";
        this.ingresos = 0;
    }
    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }
    //Metodo mostrar.
    @Override
    public String toString() {
        return nombre + " (" + ingresos + " €)";
    }
}
