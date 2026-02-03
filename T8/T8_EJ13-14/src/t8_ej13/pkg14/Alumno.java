/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t8_ej13.pkg14;

/**
 *
 * @author alumno
 */
public class Alumno {
    private String nombre;
    private int edad;
    private double notaMedia;
    
    //Constructores
    public Alumno(){
        this.nombre = "";
        this.edad = 0;
        this.notaMedia = 0;
    }
    
    public Alumno(String nombre, int edad, double notaMedia){
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }

    //Getters/Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }
    
    //Metodos de mostrar
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", edad=" + edad + ", notaMedia=" + notaMedia + '}';
    }
    
    public  void mostrarAlumno(){
        System.out.println("Nombre: "+ nombre +
        " Edad: "+ edad + " Nota media: "+ notaMedia);
    }
    
}
