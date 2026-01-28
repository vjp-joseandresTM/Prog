/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t8_ej1;

/**
 *
 * @author alumno
 */
public class Asignaturas {
    //Atributos
    private String nombreAsig;
    private double notas;

    //Constructores
    public Asignaturas(String nombreAsig, double notas) {
        this.nombreAsig = nombreAsig;
        this.notas = notas;
    }
    
    public Asignaturas(){
        nombreAsig = "";
        notas = 0;
    }
    //Getters/Setters
    public String getNombreAsig() {
        return nombreAsig;
    }

    public void setNombreAsig(String nombreAsig) {
        this.nombreAsig = nombreAsig;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }
    //Metodo tooString
    @Override
    public String toString() {
        return "Asignaturas{" + "nombreAsig=" + nombreAsig + ", notas=" + notas + '}';
    }
    
    
    
   
}
