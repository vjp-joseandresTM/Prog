/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author DAM
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Direccion dir1 = new Direccion("Tenenrias", 1, "Seattle",23);
        Empleado em1 = new Empleado("JoseJoaquin", 80, dir1.getCalle(), dir1.getNpiso(), dir1.getCiudad(), dir1.getNcalle() );
        em1.mostrarEmpleado();
        
        Direccion dir2 = new Direccion("Las cabezas", 70, "Jaraíz", 2);
        Empleado em2 = new Empleado("Roberto", 80, dir1.getCalle(), dir1.getNpiso(), dir1.getCiudad(), dir1.getNcalle() );
        em2.mostrarEmpleado();
        
        Direccion dir3 = new Direccion("Tenenrias", 1, "Seattle",23);
        Empleado em3 = new Empleado("JoseJoaquin", 80, dir1.getCalle(), dir1.getNpiso(), dir1.getCiudad(), dir1.getNcalle() );
        em2.mostrarEmpleado();
    }
    
}
