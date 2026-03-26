/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t11_ej11;

/**
 *
 * @author DAM
 */
public class Alumno implements Comparable<Alumno> {

    private String dni;
    private int expediente;
    private float notaMedia;
    
    //Constructores
    public Alumno() {
        this.dni = "";
        this.expediente = 0;
        this.notaMedia = 0F;
    }

    public Alumno(String dni, int expediente, float notaMedia) {
        this.dni = dni;
        this.expediente = expediente;
        this.notaMedia = notaMedia;
    }
    
    //Getters y setters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getExpediente() {
        return expediente;
    }

    public void setExpediente(int expediente) {
        this.expediente = expediente;
    }

    public float getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(float notaMedia) {
        this.notaMedia = notaMedia;
    }
    //Mostrar al aluumno
    @Override
    public String toString() {
        return "Alumno{"
                + "dni='" + dni + '\''
                + ", expediente=" + expediente
                + ", notaMedia=" + notaMedia
                + '}';
    }
    //Devolver el hash expediente para saber si son iguales luego
    @Override
    public int hashCode() {
        return Integer.hashCode(expediente);
    }
    //Comprobamos si el alumno es igual
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Alumno)) {
            return false;
        }
        Alumno other = (Alumno) obj;
        return this.expediente == other.expediente;
    }
    //Metodo de ordenacion
    @Override
    public int compareTo(Alumno o) {
        return Integer.compare(this.expediente, o.expediente);
    }

}
