/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5_ej15;

/**
 *
 * @author DAM
 */
public class T5_Ej15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Direccion d1 = new Direccion("Tenerias", 2, 2, "Jaraiz");
        Direccion d2 = new Direccion("Valcorchero", 4, 2, "Madrigal");
        Direccion d3 = new Direccion("Coronacion", 7, 15, "Plasencia");

        Empleado e1 = new Empleado("Jose", 5000, d1);
        Empleado e2 = new Empleado("TXUS", 200, d2);
        Empleado e3 = new Empleado("David Escudero", 5000, d3);

        System.out.println("=====EMPLEADO Nº1=====");
        e1.mostrarEmpleado();
        System.out.println("=====EMPLEADO Nº2=====");
        e2.mostrarEmpleado();
        System.out.println("=====EMPLEADO Nº4=====");
        e3.mostrarEmpleado();
    }

}
