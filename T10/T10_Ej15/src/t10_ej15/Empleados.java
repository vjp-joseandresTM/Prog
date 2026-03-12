/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t10_ej15;

/**
 *
 * @author DAM
 */
public class Empleados {
    private String nombreEmpleado;
    private int sueldo;
    //Constructores
    public Empleados(){
        this.nombreEmpleado = "";
        this.sueldo = 0;
    }
    
    public Empleados(String nombreEmpleado, int sueldo){
        this.nombreEmpleado = nombreEmpleado;
        this.sueldo = sueldo;
        
    }
    //Getters y setters
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    //Metodo mostrar.
    @Override
    public String toString() {
        return "Empleados{" + "nombreEmpleado=" + nombreEmpleado + ", sueldo=" + sueldo + '}';
    }
    
    
}
