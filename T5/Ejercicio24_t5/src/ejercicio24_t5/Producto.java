/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio24_t5;

/**
 *
 * @author DAM
 */
public class Producto {
    //Declaramos atributos.
    protected String fechaCaducidad;
    protected String numeroLote;
    //Creamos constructores.
    public Producto(){
        fechaCaducidad = "";
        numeroLote = "";
    }
    public Producto(String fechaCaducidad, String numeroLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
    }    
    //GETTERS, SETTERS Y MOSTRAR.
    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public String getNumeroLote() {
        return numeroLote;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public void setNumeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
    }
    
     public void mostrarInfo() {
        System.out.println("Fecha de caducidad: " + fechaCaducidad);
        System.out.println("Número de lote: " + numeroLote);
    }   
    
    
}
