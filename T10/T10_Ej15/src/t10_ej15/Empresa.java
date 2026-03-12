/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t10_ej15;

import java.util.ArrayList;

/**
 *
 * @author DAM
 */
public class Empresa {
    private String nombreEmpresa;
    private ArrayList<Empleados> empleados;
    //Constructores
    public Empresa(){
        this.nombreEmpresa = "";
        this.empleados = new ArrayList<>();
    }

    public Empresa(String nombreEmpresa, ArrayList<Empleados> empleados) {
        this.nombreEmpresa = nombreEmpresa;
        this.empleados = empleados;
    }
    //Getters y setters
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public ArrayList<Empleados> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleados> empleados) {
        this.empleados = empleados;
    }
    //Metodo mostrar
    @Override
    public String toString() {
        return "Empresa{" + "nombreEmpresa=" + nombreEmpresa + ", empleados=" + empleados + '}';
    }
    
    
}
