/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej_15.pkg16;

/**
 *
 * @author DAM
 */
public class Socio {
    private String nombre;
    private double precioAbonado;
    
    //Constructores.
    public Socio(){
        this.nombre = "";
        this.precioAbonado = 0;
    }
    public Socio(String nombre, double precioAbonado) {
        this.nombre = nombre;
        this.precioAbonado = precioAbonado;
    }

    //Getters y setters.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioAbonado() {
        return precioAbonado;
    }

    public void setPrecioAbonado(double precioAbonado) {
        this.precioAbonado = precioAbonado;
    }
    
    //Metodos de mostrar.
    @Override
    public String toString() {
        return "Socios{" + "nombre=" + nombre + ", precioAbonado=" + precioAbonado + '}';
    }
    
    
    
}
