/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio24_t5;

/**
 *
 * @author DAM
 */
public class ProductoRefrigerado extends Producto {
    private String codigoOrganismo;

    public ProductoRefrigerado(String fechaCaducidad, String numeroLote, String codigoOrganismo) {
        super(fechaCaducidad, numeroLote);
        this.codigoOrganismo = codigoOrganismo;
    }

    public void setCodigoOrganismo(String codigoOrganismo) {
        this.codigoOrganismo = codigoOrganismo;
    }

    public String getCodigoOrganismo() {
        return codigoOrganismo;
    }

    public void mostrarInfo() {
        System.out.println("=== PRODUCTO REFRIGERADO ===");
        super.mostrarInfo();
        System.out.println("Código del organismo: " + codigoOrganismo);
        System.out.println();
    }
}

