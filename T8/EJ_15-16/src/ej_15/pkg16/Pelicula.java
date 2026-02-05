/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej_15.pkg16;

/**
 *
 * @author DAM
 */
public class Pelicula {
    private String titulo;
    private double costoLicencia;
    private Socio[] socios;
    
    public Pelicula(){
        this.titulo = "";
        this.costoLicencia = 0;
        this.socios = new Socio[4];
    }

    public Pelicula(String titulo, double costoLicencia, Socio[] socios) {
        this.titulo = titulo;
        this.costoLicencia = costoLicencia;
        this.socios = socios;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getCostoLicencia() {
        return costoLicencia;
    }

    public void setCostoLicencia(double costoLicencia) {
        this.costoLicencia = costoLicencia;
    }

    public Socio[] getSocios() {
        return socios;
    }

    public void setSocios(Socio[] socios) {
        this.socios = socios;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", costoLicencia=" + costoLicencia + ", socios=" + socios + '}';
    }
    
    
    
}
