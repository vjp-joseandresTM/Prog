/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t8_ej6;

/**
 *
 * @author DAM
 */
public class Empleados {
    private String nombre;
    private int horasTrabajadas;
    private double tarifaXhora;
    
    //Constructores
    public Empleados(){
        this.nombre = "";
        this.horasTrabajadas = 0;
        this.tarifaXhora = 0;
    }
    
   public Empleados(String nombre, int horasTrabajadas, double tarifaXhora){
       this.nombre = nombre;
       this.horasTrabajadas = horasTrabajadas;
       this.tarifaXhora = tarifaXhora;
   }
   
}
