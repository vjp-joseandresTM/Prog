/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenprog;

/**
 *
 * @author alumno
 */
public class Equipos {
    //Atributos
    private String codigo;
    private String nombre;
    private int trofeos;
    //Constructores
    public Equipos(String codigo, String nombre, int trofeos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.trofeos = trofeos;
    }
  
    public Equipos() {
        this.codigo = "";
        this.nombre = "";
        this.trofeos = 0;
    }
    //Getters y setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTrofeos() {
        return trofeos;
    }

    public void setTrofeos(int trofeos) {
        this.trofeos = trofeos;
    }
    //Metodo mostrar
    @Override
    public String toString() {
        return "Equipos{" + "codigo=" + codigo + ", nombre=" + nombre + ", trofeos=" + trofeos + '}';
    }
    
  
    
}
