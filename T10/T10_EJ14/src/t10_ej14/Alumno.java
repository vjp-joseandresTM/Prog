/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t10_ej14;

/**
 *
 * @author alumno
 */
public class Alumno {

    private String nombreAl;
    private Asignatura[] notas;
    //Constructores
    public Alumno() {
        this.nombreAl = "";
        notas = new Asignatura[0];
    }

    public Alumno(String nombreAl, Asignatura[] notas) {
        this.nombreAl = nombreAl;
        this.notas = notas;
    }
    //Getters y setters
    
    public String getNombreAl() {
        return nombreAl;
    }

    public void setNombreAl(String nombreAl) {
        this.nombreAl = nombreAl;
    }

    public Asignatura[] getNotas() {
        return notas;
    }

    public void setNotas(Asignatura[] notas) {
        this.notas = notas;
    }
    //Media
    public float notaMedia() {
        float suma = 0;
        for (Asignatura a : notas) {
            suma += a.getNotaAsig();
        }
        return suma / notas.length;
    }
    //Mostrar
    @Override
    public String toString() {
        return "Alumno{" + "nombreAl=" + nombreAl + ", notas=" + notas + '}';
    }

}
