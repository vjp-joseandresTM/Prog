/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author DAM
 */
public class Empleado {
    private String nombre;
    private int salario;
    private Direccion direccion;
    
    public Empleado(){
        nombre = "";
        salario = 0;
        direccion = new Direccion();
    }
    
    public Empleado(String nombre, int salario,String calle, int nPiso, String ciudad, int numero){
        this.nombre = nombre;
        this.salario = salario;
        direccion = new Direccion(calle, nPiso,ciudad,numero);
    } 

    public String getNombre() {
        return nombre;
    }

    public int getSalario() {
        return salario;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
     public void mostrarEmpleado(){
         System.out.println("Nombre:"+ getNombre() );
         System.out.println("Edad:"+ getSalario());
         System.out.println("Direccion:");
         direccion.mostrarDireccion();
         
     }
    
    
    
    
}
