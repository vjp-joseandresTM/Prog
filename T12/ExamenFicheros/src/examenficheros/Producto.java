/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenficheros;

/**
 *
 * @author alumno
 */
public class Producto {
    
    //Declaramos los atributos.
    private String nombre;
    private int cantidad;
    private double precio;
    
    //Constructores parametrizados y por defecto.
    public Producto(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    public Producto(){
        this.nombre = "";
        this.cantidad = 0;
        this.precio = 0;
    }
    //Getter y Setters.
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    //Metodo toString.
    @Override
    public String toString() {
        return nombre + "#" + cantidad + "#" + precio; //Formateado como lo pide el ejercicio.
    }
    
    
}
