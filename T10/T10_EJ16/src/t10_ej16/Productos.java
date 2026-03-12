/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t10_ej16;

import java.time.chrono.ThaiBuddhistEra;

/**
 *
 * @author alumno
 */
public class Productos {
    private String producto;
    private float precio;
    private int stock;
    
    public Productos(){
        this.producto = "";
        this.precio = 0F;
        this.stock = 0;
        
    }

    public Productos(String producto, float precio, int stock) {
        this.producto = producto;
        this.precio = precio;
        this.stock = stock;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Productos{" + "producto=" + producto + ", precio=" + precio + ", stock=" + stock + '}';
    }
    
    
}
