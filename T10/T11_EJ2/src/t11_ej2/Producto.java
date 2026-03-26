/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t11_ej2;

/**
 *
 * @author alumno
 */
public class Producto {
    private String nomProducto;
    private float precio;
    private int stock;
     
    
    //Constructores
    public Producto(String nomProducto, float precio, int stock){
        this.nomProducto = nomProducto;
        this.precio = precio;
        this.stock = stock;
    }

    public Producto() {
        this.nomProducto = "";
        this.precio = 0F;
        this.stock = 0;
    }

    //Getters y setters

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
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
    
    //Metodo Mostrar

    @Override
    public String toString() {
        return "Producto{" + "nomProducto=" + nomProducto + ", precio=" + precio + ", stock=" + stock + '}';
    }
    
}
