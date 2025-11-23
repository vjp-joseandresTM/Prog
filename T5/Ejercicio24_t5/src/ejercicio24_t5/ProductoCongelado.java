/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio24_t5;

/**
 *
 * @author DAM
 */
public class ProductoCongelado extends Producto{
    //Creamos atributos, getters/setters y mostrar.
    private double temperaturaCongelacion;

    public ProductoCongelado(String fechaCaducidad, String numeroLote, double temperaturaCongelacion) {

        super(fechaCaducidad, numeroLote);
        this.temperaturaCongelacion = temperaturaCongelacion;
    }

    public void setTemperaturaCongelacion(double temperaturaCongelacion) {
        this.temperaturaCongelacion = temperaturaCongelacion;
    }

    public double getTemperaturaCongelacion() {
        return temperaturaCongelacion;
    }

    public void mostrarInfo() {
        System.out.println("=== PRODUCTO CONGELADO ===");
        super.mostrarInfo();
        System.out.println("Temperatura recomendada: " + temperaturaCongelacion + " ºC");
        System.out.println();
    }    
}
