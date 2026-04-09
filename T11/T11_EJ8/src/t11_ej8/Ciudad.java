/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t11_ej8;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author DAM
 */
public class Ciudad {

    private String nombre;
    private Set<Sede> sedes;
    //Constructores
    public Ciudad(String nombre) {
        this.nombre = nombre;
        this.sedes = new HashSet<>();
    }

    public Ciudad() {
        this.nombre = "";
        this.sedes = new HashSet<>();
    }
    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Sede> getSedes() {
        return sedes;
    }

    public void setSedes(Set<Sede> sedes) {
        this.sedes = sedes;
    }
    //Metodo Add
    public void addSede(Sede s) {
        sedes.add(s);
    }
    //Metodo mostrar.
    @Override
    public String toString() {
        String texto = "Ciudad: " + nombre + "\nSedes:\n";

        for (Sede s : sedes) {
            texto += " - " + s + "\n";
        }

        return texto;
    }
}
