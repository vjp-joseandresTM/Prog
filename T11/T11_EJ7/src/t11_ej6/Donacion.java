/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t11_ej6;

/**
 *
 * @author DAM
 */
public class Donacion {
    private String nombreDonante;
    private int cantidad;
    //Constructor nuevo
    public Donacion(){
        this.nombreDonante = "";
        this.cantidad = 0;
    }

    public Donacion(String nombreDonante, int cantidad) {
        this.nombreDonante = nombreDonante;
        this.cantidad = cantidad;
    }
    //Getters y setters
    public String getNombreDonante() {
        return nombreDonante;
    }

    public void setNombreDonante(String nombreDonante) {
        this.nombreDonante = nombreDonante;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    //Metodo mostrar
    @Override
    public String toString() {
        return "Donacion{" + "nombreDonante=" + nombreDonante + ", cantidad=" + cantidad + '}';
    }
    
    public void mostrarDonacion(){
        System.out.println("Nombre de donante: "+ nombreDonante);
        System.out.println("Cantidad donada: "+ cantidad);
    }
}
