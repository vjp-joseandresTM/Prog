/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t11_ej3;

/**
 *
 * @author DAM
 */
public class Conductor {

    private String dni;
    private String nombre;
    //Constructores
    public Conductor() {
        this.dni = "";
        this.nombre = "";
    }

    public Conductor(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
    //Getters y Setters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //Metodo mostrar.
    @Override
    public String toString() {
        return nombre + " (" + dni + ")";
    }
    
}
