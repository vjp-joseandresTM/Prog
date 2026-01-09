/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5_ej15;

/**
 *
 * @author DAM
 */
public class Empleado {

    private String nombre;
    private int salario;
    private Direccion direccion;

    public Empleado() {
        this.nombre = "";
        this.salario = 0;
        this.direccion = null;
    }

    public Empleado(String nombre, int salario, Direccion direccion) {
        this.nombre = nombre;
        this.salario = salario;
        this.direccion = direccion;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }



    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", salario=" + salario + ", direccion=" + direccion + '}';
    }

    public void mostrarEmpleado() {
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("El salario: " + salario);
        System.out.println("Direccion: " + direccion);

    }
    
    
}
