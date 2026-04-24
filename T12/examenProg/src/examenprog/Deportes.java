/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenprog;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author alumno
 */
public class Deportes {

    //Atributos
    private String nombreDep;

    //Constructores
    public Deportes(String nombreDep) {
        this.nombreDep = nombreDep;

    }

    public Deportes() {
        this.nombreDep = "";

    }
    //Getters y setters

    public String getNombreDep() {
        return nombreDep;
    }

    public void setNombreDep(String nombreDep) {
        this.nombreDep = nombreDep;
    }
    //Metodo mostrar

    @Override
    public String toString() {
        return "Deportes{" + "nombreDep=" + nombreDep + '}';
    }

}
