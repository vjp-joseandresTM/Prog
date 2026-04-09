/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t11_ej3;

import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author DAM
 */
public class Autobus {

    private String matricula;
    private Map<String, Conductor> conductores;
    //Constructoters
    public Autobus() {
        this.matricula = "";
        this.conductores = new HashMap<>();
    }

    public Autobus(String matricula, Map<String, Conductor> Conductores) {
        this.matricula = matricula;
        this.conductores = new HashMap<>();
    }

    public Autobus(String matricula) {
        this.matricula = matricula;
        this.conductores = new HashMap<>();
    }
    //Getters y Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Map<String, Conductor> getConductores() {
        return conductores;
    }

    public void setConductores(Map<String, Conductor> conductores) {
        this.conductores = conductores;
    }
    //Metodo add.
    public void addConductor(Conductor c) {
        conductores.put(c.getDni(), c);
    }
    //Metodo mostrar
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Autobús " + matricula + "\nConductores:\n");
        conductores.forEach((dni, c) -> sb.append(" - ").append(c).append("\n"));
        return sb.toString();
    }

}
