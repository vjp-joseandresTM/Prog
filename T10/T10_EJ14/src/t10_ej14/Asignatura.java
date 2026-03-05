/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t10_ej14;

/**
 *
 * @author alumno
 */
public class Asignatura {

    private String nombre;
    private float notaAsig;
    //Constructores
    public Asignatura() {
        this.nombre = "";
        this.notaAsig = 0F;
    }
    
    public Asignatura(String nombre, float notaAsig) {
        this.nombre = nombre;
        this.notaAsig = notaAsig;
    }
    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNotaAsig() {
        return notaAsig;
    }

    public void setNotaAsig(float notaAsig) {
        this.notaAsig = notaAsig;
    }
    //Metodo esta suspenso
    public boolean estaSuspensa() {
        if (notaAsig < 5.0) {
            return true;
        } else {
            return false;
        }
    }

}
