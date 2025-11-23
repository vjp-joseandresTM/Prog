/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio24_t5;

/**
 *
 * @author DAM
 */
public class Test {
    public static void main(String[] args) {
        //Creamos y mostramos Objetos.
        ProductoFresco fresco = new ProductoFresco("10/02/2026", "L001", "05/02/2050", "España");

        ProductoRefrigerado refrigerado = new ProductoRefrigerado("15/03/2026", "R100", "ORG-123");

        ProductoCongelado congelado = new ProductoCongelado("30/12/2026", "C900", -18.0);

        fresco.mostrarInfo();
        refrigerado.mostrarInfo();
        congelado.mostrarInfo();
    }    
}
