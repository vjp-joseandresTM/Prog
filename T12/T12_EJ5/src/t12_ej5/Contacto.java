/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t12_ej5;

/**
 *
 * @author alumno
 */


public class Contacto {
    //Declaramos las variables.
    private String nombre;
    private int edad;
    private int numero;
    //Constructores.
    public Contacto(String nombre, int edad, int numero) {
        this.nombre = nombre;
        this.edad = edad;
        this.numero = numero;
    }
   
    public Contacto(){
        this.nombre = "";
        this.edad = 0;
        this.numero = 0;
    }
    //Getters y setters.
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    //NO IMPLEMENTO METODOS MOSTRAR PUES NO SON NECESARIOS EN ESTE EJERCICIO AL TENER QUE LEER EL FICHERO Y NO LOS OBJETOS DE LA CLASE, NO ES NECESARIO 8D
}
